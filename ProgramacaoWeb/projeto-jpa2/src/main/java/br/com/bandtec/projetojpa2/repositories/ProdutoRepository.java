package br.com.bandtec.projetojpa2.repositories;

import br.com.bandtec.projetojpa2.domain.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

    @Query("select p from Produto p where p.preco > ?1")
    List<Produto> pesquisarPorPrecoMaiorQue(Double preco);

}
