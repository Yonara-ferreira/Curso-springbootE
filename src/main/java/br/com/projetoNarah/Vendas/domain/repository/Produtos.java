package br.com.projetoNarah.Vendas.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.projetoNarah.Vendas.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer>{

}
