package br.com.fiap.Funko.model.repository;

import br.com.fiap.Funko.model.entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{
}
