package br.com.fiap.mspedido.repository;

import br.com.fiap.mspedido.model.Pedido;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PedidoRepository extends MongoRepository<Pedido, String> {

}
