package com.senai.crud_usuario_spring_arraylist.controller;

import com.senai.crud_usuario_spring_arraylist.entity.Usuario;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class CrudApplicationController {

    @GetMapping
    public Usuario getUsuario(){
        return new Usuario(1, "Vitor");
    }
}
