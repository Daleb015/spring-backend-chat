package co.com.daleb.springbackendchat.controller;

import co.com.daleb.springbackendchat.model.documents.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;

@Controller
public class ChatController {
    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibeMensaje(Mensaje mensaje){
    mensaje.setFecha(new Date().getTime());
    mensaje.setTexto(mensaje.getTexto());
    if (mensaje.getTipo().equals("NUEVO_USUARIO")){
        mensaje.setTexto(" Nuevo usuario conectado");
    }
    return mensaje;
    }
}
