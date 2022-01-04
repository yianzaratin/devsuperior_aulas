// Etapa 2: FileReader e BufferedReader com controle manual

package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program2 {

	public static void main(String[] args) {

		String path = "C:\\workspaces\\in.txt";
		
		BufferedReader br = null;
		FileReader fr = null;

		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();

			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} 
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		} 
		finally {
			try {
				br.close();
				fr.close();

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
