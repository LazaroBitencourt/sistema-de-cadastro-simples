package com.github.LazaroBitencourt.sistemadecadastrosimples.controller;

import com.github.LazaroBitencourt.sistemadecadastrosimples.model.Usuario;
import com.github.LazaroBitencourt.sistemadecadastrosimples.repository.UsuarioRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PostMapping("/salvar")
    @ResponseBody
    public ResponseEntity<Usuario> salvar(@RequestBody Usuario usuario){
        Usuario novoUsuario = usuarioRepository.save(usuario);
        return new ResponseEntity<Usuario>(novoUsuario,HttpStatus.CREATED);
    }

    @DeleteMapping("/deletar-usuario/{id}")
    @ResponseBody
    public ResponseEntity<String> deletar (@PathVariable("id") Long id){
     usuarioRepository.deleteById(id);
     return new ResponseEntity<String>("Usuário deletado com sucesso", HttpStatus.OK);
    }

    @GetMapping("/buscar-usuario/{id}")
    @ResponseBody
    public ResponseEntity<Usuario> buscarUsuariopeloId (@PathVariable("id") Long id){
     Usuario usuario = usuarioRepository.findById(id).get();
     return new ResponseEntity<Usuario>(usuario,HttpStatus.OK);
    }

    @PutMapping("/atualizar-usuario")
    @ResponseBody
    public ResponseEntity<?> atualizar(@RequestBody Usuario usuario) {
        if(usuario.getId() == null){
            return new ResponseEntity<String>("Id não foi informado para atualização", HttpStatus.BAD_REQUEST);
        }
        Usuario usuarioAtualizado = usuarioRepository.saveAndFlush(usuario);
        return new ResponseEntity<Usuario>(usuarioAtualizado, HttpStatus.OK);
    }

    @GetMapping("/buscar-pelo-nome/{nome}")
    @ResponseBody
    public ResponseEntity<List<Usuario>> buscarUsuarioPeloNome (@PathVariable("nome") String nome){
        List<Usuario> usuarios = usuarioRepository.buscaPeloNome(nome.trim().toUpperCase());
        return new ResponseEntity<List<Usuario>>(usuarios,HttpStatus.OK);
    }
}
