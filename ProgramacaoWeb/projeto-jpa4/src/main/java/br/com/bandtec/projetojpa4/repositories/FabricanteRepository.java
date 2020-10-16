package br.com.bandtec.projetojpa4.repositories;

import br.com.bandtec.projetojpa4.domain.Fabricante;
import br.com.bandtec.projetojpa4.visions.NomeFabricante;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface FabricanteRepository extends  CrudRepository<Fabricante, Integer> {
    @Query("select new br.com.bandtec.projetojpa4.visions.NomeFabricante(f.nome) from Fabricante f")
    List<NomeFabricante> findAllSimples();
}
