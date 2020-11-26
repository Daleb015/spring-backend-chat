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
    mensaje.setTexto("recibido por broker: "+mensaje.getTexto());
    return mensaje;
    }
}
