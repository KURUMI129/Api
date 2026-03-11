package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.example.demo.Models.Message;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api/mensajes")
public class MessageController {
    private List<Message> mensajes = new ArrayList<>();

    public MessageController() {
        // Aquí agregamos la ruta de las imágenes tal como las llamaste en la carpeta 'public'
        mensajes.add(new Message(1, "23640278", "Soy Levi we", "No le hablen de frente. Controla todo el barrio. Te ofrece agua de horchata.", "/karol.webp"));
        mensajes.add(new Message(2, "23640095", "Levi Ahegao", "Ha visto cosas. Muchas cosas. Demasiadas cosas. No preguntes cuáles. Defensa perfecta (Mete las putas nalgas)" ,"/tanek.webp"));
        mensajes.add(new Message(3, "23640126", "Levi Mujer", "La versión femenina. Igual de poderosa, el doble de carismática.", "/jesus.webp"));
    }

    @GetMapping
    public List<Message> despliegueMensajes() {
        return mensajes;
    }

    // Este método recibe el mensaje nuevo (donde la imagen viene como texto Base64)
    @PostMapping
    public Message crearMensaje(@RequestBody Message nuevoMensaje) {
        // Generamos el ID sumando 1 al tamaño de la lista
        int nuevoId = mensajes.size() + 1;
        nuevoMensaje.setId(nuevoId);
        
        // Guardamos el mensaje en nuestra lista temporal
        mensajes.add(nuevoMensaje);
        return nuevoMensaje;
    }
}