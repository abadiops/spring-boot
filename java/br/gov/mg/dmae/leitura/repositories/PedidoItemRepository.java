package br.gov.mg.dmae.leitura.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.gov.mg.dmae.leitura.entities.PedidoItem;
import br.gov.mg.dmae.leitura.entities.pk.PedidoItemPK;


public interface PedidoItemRepository extends JpaRepository<PedidoItem, PedidoItemPK> {

}