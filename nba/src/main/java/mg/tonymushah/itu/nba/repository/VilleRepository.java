package mg.tonymushah.itu.nba.repository;

import mg.tonymushah.itu.nba.mapping.*;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

public interface VilleRepository extends CrudRepository<Ville,Integer> {
    default List<Ville> findByNom (String nom) {
        return StreamSupport.stream(this.findAll().spliterator(), true)
            .filter((ville) -> ville.getNom() == nom)
            .collect(Collectors.toList());
    }
}
