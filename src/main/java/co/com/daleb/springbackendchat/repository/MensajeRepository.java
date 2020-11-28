package co.com.daleb.springbackendchat.repository;

import co.com.daleb.springbackendchat.model.Mensaje;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MensajeRepository extends MongoRepository<Mensaje,String> {
    List<Mensaje> findFirst10ByOrderByFechaDesc();
}
