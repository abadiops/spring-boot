package br.gov.mg.dmae.leitura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mg.dmae.leitura.entities.Categoria;

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

}
