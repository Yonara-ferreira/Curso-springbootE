package br.com.projetoNarah.Vendas.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.projetoNarah.Vendas.domain.entity.Cliente;

public interface Clientes extends JpaRepository<Cliente, Integer> {

	@Query(value = " select c from Cliente c  where c.nome like :nome ")
	List<Cliente> encontrarPorNome(@Param("nome") String nome);
	
	boolean existsByNome(String nome);
	
}
 