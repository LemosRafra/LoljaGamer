package com.lemosrafa.lojinhagames.Repository;

import java.util.List;

import com.lemosrafa.lojinhagames.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

    public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);

}
