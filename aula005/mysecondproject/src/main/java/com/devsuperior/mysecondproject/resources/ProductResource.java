package com.devsuperior.mysecondproject.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.mysecondproject.entities.Product;
import com.devsuperior.mysecondproject.repositories.ProductRepository;

@RestController // define que essa classe vai ser um recurso Rest
@RequestMapping(value = "/products")  // caminho pelo qual o recurso vai responder
public class ProductResource {

	@Autowired //pre processamento e resolucao da dependencia do ProductResource e obtem uma estancia do caregoryRepository
	private ProductRepository categoryRepository;
	
	@GetMapping // quando uma execucao get no caminho categories vai ser chamado o metodo
	public ResponseEntity<List<Product>> findAll() { // encapsula uma resposta http -- retorna todas as categorias
		List <Product> list = categoryRepository.findAll();
		
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Product> findById(@PathVariable Long id) { // reconhecer /ID que voce vai adicionar no caminho da pagina
		Product cat = categoryRepository.findById(id).get();
		return ResponseEntity.ok().body(cat);
	}
	

}
