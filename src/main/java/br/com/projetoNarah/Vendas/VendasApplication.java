package br.com.projetoNarah.Vendas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.projetoNarah.Vendas.domain.entity.Cliente;
import br.com.projetoNarah.Vendas.domain.repository.Clientes;

@SpringBootApplication
public class VendasApplication {
	
	@Bean
	public CommandLineRunner init(@Autowired Clientes clientes) {
		return args -> {
			System.out.println("Salvando clientes");
			clientes.save(new Cliente(null, "Narah"));
			clientes.save(new Cliente(null, "Pedro"));
			
			 boolean existe = clientes.existsByNome("Dougllas");
	         System.out.println("existe um cliente com o nome Dougllas? " + existe);
            
		};
	}
	
	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
