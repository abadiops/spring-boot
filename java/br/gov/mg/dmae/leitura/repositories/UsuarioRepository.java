package br.gov.mg.dmae.leitura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mg.dmae.leitura.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
