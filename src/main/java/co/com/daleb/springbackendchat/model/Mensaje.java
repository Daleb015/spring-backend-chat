package co.com.daleb.springbackendchat.model;

import java.io.Serializable;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mensajes")
@Data
public class Mensaje implements Serializable {

  @Id
  private String id;

  private String texto;
  private Long fecha;
  private String username;
  private String tipo;
  private String color;
}
