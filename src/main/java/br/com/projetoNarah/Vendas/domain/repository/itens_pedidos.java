package br.com.projetoNarah.Vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoNarah.Vendas.domain.entity.ItemPedido;

public interface itens_pedidos extends JpaRepository<ItemPedido, Integer> {

}
