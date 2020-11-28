package co.com.daleb.springbackendchat.service;

import co.com.daleb.springbackendchat.model.Mensaje;

import java.util.List;

public interface MensajeService {

    List<Mensaje> obtenerUltimos10();

    Mensaje persistirMensaje(Mensaje mensaje);
}
