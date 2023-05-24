package br.com.projetoNarah.Vendas.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoNarah.Vendas.domain.entity.Cliente;
import br.com.projetoNarah.Vendas.domain.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer>{
	
	List<Pedido> findByCliente(Cliente cliente);

}
