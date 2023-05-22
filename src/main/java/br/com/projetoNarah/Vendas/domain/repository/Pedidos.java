package br.com.projetoNarah.Vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoNarah.Vendas.domain.entity.Pedido;

public interface Pedidos extends JpaRepository<Pedido, Integer>{

}
