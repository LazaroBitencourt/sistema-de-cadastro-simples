package com.github.LazaroBitencourt.sistemadecadastrosimples.controller;

import com.github.LazaroBitencourt.sistemadecadastrosimples.model.Usuario;
import com.github.LazaroBitencourt.sistemadecadastrosimples.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    @GetMapping("/lista-todos")
    @ResponseBody
    public ResponseEntity<List<Usuario>> listaUsuarios(){
        List<Usuario> usuarios = usuarioRepository.findAll();
        return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
    }
}
