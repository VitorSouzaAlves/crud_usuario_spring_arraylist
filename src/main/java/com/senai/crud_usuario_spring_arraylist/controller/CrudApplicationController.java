package com.senai.crud_usuario_spring_arraylist.controller;

import com.senai.crud_usuario_spring_arraylist.entity.Usuario;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class CrudApplicationController {
    private final List<Usuario> usuarios = new ArrayList<>();


    public CrudApplicationController(){
        usuarios.add(new Usuario(2, "Vitor"));
        usuarios.add(new Usuario(3, "Matheus"));
        usuarios.add(new Usuario(4, "Pedro"));
        usuarios.add(new Usuario(5, "Miguel"));
        usuarios.add(new Usuario(6, "Leonardo"));
    }
    @GetMapping
    public List<Usuario> getUsuario(){
        return usuarios;
    }

    @PostMapping
    public String adicionarUsuario(@RequestBody Usuario usuario){
        usuarios.add(usuario);
        return "Adicionado com sucesso!!";
    }

    @PutMapping("/{id}")
    public String atualizarUsuario(@RequestBody Usuario usuarioAtt, @PathVariable Integer id){
        for (Usuario u : usuarios){
            if (u.getId().equals(id)){
                u.setNome(usuarioAtt.getNome());
                return "Usuário atualizado com sucesso!!";
            }
        }
        return "Usuário não encontrado...";
    }
}
