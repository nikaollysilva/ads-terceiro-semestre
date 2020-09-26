package br.com.bandtec.projectjpa.repositories;

import br.com.bandtec.projectjpa.domain.Praia;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PraiaRepository extends CrudRepository<Praia, Integer> {

    List<Praia> findByTamanhoLessThan(double tamanhaoMax);

    List<Praia> findByNomeContains(String thechoNome);

    int countByTamanhoGreaterThan(Double tamanhaMinimo);

    boolean existsByTamanho(double tamanho);

    boolean existsByNome(String nome);
}
