package br.gov.mg.dmae.leitura.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.gov.mg.dmae.leitura.entities.Usuario;

@RestController
@RequestMapping(value = "/usuarios")
public class UsuarioResource {

	@GetMapping
	public ResponseEntity<Usuario> findAll() {
		Usuario usuario = new Usuario(1L, "Maria", "maria@gmail.com", "9999999", "12345");
		return ResponseEntity.ok().body(usuario);
	}

}
