package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Models.Message;

@RestController
@RequestMapping("/api/mensajes")
public class MessageController {
    private List<Message> mensajes = new ArrayList<>();

   private MessageController(){
    mensajes.add(new Message(1, "23640278", "Karol Levi", "Hola, este es un mensaje de prueba."));
    mensajes.add(new Message(2, "23640095", "Tanek Alejandro", "Hola, este es un mensaje de prueba."));
    mensajes.add(new Message(3, "23640126", "Jesús Enrique", "Hola, este es un mensaje de prueba."));
   }

   @GetMapping
   public List<Message> despliegueMensajes() {
       return mensajes;
   }
}