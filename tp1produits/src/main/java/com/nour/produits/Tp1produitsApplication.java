package com.nour.produits;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.nour.produits.entities.Produit;

import org.springframework.beans.factory.annotation.*;



@SpringBootApplication
public class Tp1produitsApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration repositoryRestConfiguration;
	
	public static void main(String[] args) {
		SpringApplication.run(Tp1produitsApplication.class, args);
	}
	public void run(String... args) throws Exception{
		repositoryRestConfiguration.exposeIdsFor(Produit.class);
		
		
	}
}






