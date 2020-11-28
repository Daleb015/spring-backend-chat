package co.com.daleb.springbackendchat.controller;

import co.com.daleb.springbackendchat.model.Mensaje;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

import java.util.Date;
import java.util.Random;

@Controller
public class ChatController {

    private String[] colores = {"red","green","blue","brown","pink"};

    @MessageMapping("/mensaje")
    @SendTo("/chat/mensaje")
    public Mensaje recibeMensaje(Mensaje mensaje){

    mensaje.setFecha(new Date().getTime());
    mensaje.setTexto(mensaje.getTexto());
    if (mensaje.getTipo().equals("NUEVO_USUARIO")){
        mensaje.setTexto(" Nuevo usuario conectado");
        mensaje.setColor(colores[new Random().nextInt(colores.length)]);
    }
    return mensaje;
    }

    @MessageMapping("/escribiendo")
    @SendTo("/chat/escribiendo")
    public String escribiendo(String username){
        return username.concat(" está escribieno");
    }
}
