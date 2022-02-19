package co.com.daleb.springbackendchat.service.impl;

import co.com.daleb.springbackendchat.model.Mensaje;
import co.com.daleb.springbackendchat.repository.MensajeRepository;
import co.com.daleb.springbackendchat.service.MensajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MensajeServiceImpl implements MensajeService {

  @Autowired
  private MensajeRepository mensajeRepository;

  @Override
  public List<Mensaje> obtenerUltimos10() {
    return mensajeRepository.findFirst10ByOrderByFechaDesc();
  }

  @Override
  public Mensaje persistirMensaje(Mensaje mensaje) {
    return mensajeRepository.save(mensaje);
  }
}
