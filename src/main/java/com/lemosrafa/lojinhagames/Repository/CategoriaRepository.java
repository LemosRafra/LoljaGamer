package com.lemosrafa.lojinhagames.Repository;

import java.util.List;

import com.lemosrafa.lojinhagames.Model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long>{
    public List<Categoria> findAllByDescricaoContainingIgnoreCase(String descricao);

}
