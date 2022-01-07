package com.devsuperior.mysecondproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.mysecondproject.entities.Category;
import com.devsuperior.mysecondproject.repositories.CategoryRepository;

@RestController // define que essa classe vai ser um recurso Rest
@RequestMapping(value = "/categories")  // caminho pelo qual o recurso vai responder
public class CategoryResource {

	@Autowired //pre processamento e resolucao da dependencia do CategoryResource e obtem uma estancia do caregoryRepository
	private CategoryRepository categoryRepository;
	
	@GetMapping // quando uma execucao get no caminho categories vai ser chamado o metodo
	public ResponseEntity<List<Category>> findAll() { // encapsula uma resposta http -- retorna todas as categorias
		List <Category> list = categoryRepository.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findById(@PathVariable Long id) { // reconhecer /ID que voce vai adicionar no caminho da pagina
		Category cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	

}
