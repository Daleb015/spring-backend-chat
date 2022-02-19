package co.com.daleb.springbackendchat.repository;

import co.com.daleb.springbackendchat.model.Mensaje;
import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MensajeRepository extends MongoRepository<Mensaje, String> {
  List<Mensaje> findFirst10ByOrderByFechaDesc();
}
