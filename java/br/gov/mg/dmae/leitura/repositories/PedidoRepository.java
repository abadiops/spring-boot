package br.gov.mg.dmae.leitura.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mg.dmae.leitura.entities.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {

}
