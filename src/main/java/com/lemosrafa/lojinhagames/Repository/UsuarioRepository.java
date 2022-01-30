package com.lemosrafa.lojinhagames.Repository;

import java.util.Optional;

import com.lemosrafa.lojinhagames.Model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    public Optional<Usuario> findByUsuario(String usuario);

}
