package br.com.bandtec.projetojpa4.repositories;

import br.com.bandtec.projetojpa4.domain.Carro;
import br.com.bandtec.projetojpa4.visions.CarroSimples;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CarroRepository extends CrudRepository<Carro, Integer> {

    @Query("select new br.com.bandtec.projetojpa4.visions.CarroSimples(c.id, c.modelo) from Carro c")
    List<CarroSimples> findAllSimples();

}
