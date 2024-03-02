package com.github.LazaroBitencourt.sistemadecadastrosimples.repository;

import com.github.LazaroBitencourt.sistemadecadastrosimples.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario,Long> {
    @Query("SELECT u FROM Usuario u WHERE upper(trim(u.nome)) LIKE %?1%")
    List<Usuario> buscaPeloNome(String nome);
}
