package br.com.alura.mudi.repositories;

import br.com.alura.mudi.models.Pedido;
import br.com.alura.mudi.models.StatusPedido;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PedidoRepository extends JpaRepository<Pedido, Long> {


    ArrayList<Pedido> findByStatus(StatusPedido status);
}
