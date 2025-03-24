package com.senai.crud_usuario_spring_arraylist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class CrudApplicationController {

    @GetMapping
    public String getRegistros(){
        return "ListaUsuarios";
    }
}
