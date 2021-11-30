package br.gov.mg.dmae.leitura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mg.dmae.leitura.entities.Produto;

public interface ProdutoRepository  extends JpaRepository<Produto, Long>{

}
