package br.com.projetoNarah.Vendas;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import br.com.projetoNarah.Vendas.domain.entity.Cliente;
import br.com.projetoNarah.Vendas.domain.entity.Pedido;
import br.com.projetoNarah.Vendas.domain.repository.Clientes;
import br.com.projetoNarah.Vendas.domain.repository.Pedidos;

@SpringBootApplication
public class VendasApplication {
	
	@Bean
	public CommandLineRunner init(
			@Autowired Clientes clientes,
			@Autowired Pedidos pedidos) {
		
		return args -> {
			System.out.println("Salvando clientes");
			Cliente narah = new Cliente(null, "Narah");
			clientes.save(narah);

			Pedido p = new Pedido();
			p.setCliente(narah);
			p.setDataPedido(LocalDate.now());
			p.setTotal(BigDecimal.valueOf(100));
			
			pedidos.save(p);
			
			Cliente cliente = clientes.findClienteFetchPedidos(narah.getId());
			System.out.println(cliente);
			System.out.println(cliente.getPedidos());
			
			pedidos.findByCliente(narah).forEach(System.out::println);

//			List<Cliente> result = clientes.findByNomeLike("Dougllas");
//			result.forEach(System.out::println);

		};
	}

	public static void main(String[] args) {
		SpringApplication.run(VendasApplication.class, args);
	}

}
