package com.lemosrafa.lojinhagames.Repository;

import com.lemosrafa.lojinhagames.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.math.BigDecimal;
import java.util.List;



public interface ProdutoRepository extends JpaRepository<Produto, Long> {

    public List<Produto> findAllByNomeContainingIgnoreCase(String nome);


    public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);


    public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);

}
