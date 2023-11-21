package mg.tonymushah.itu.nba.repository;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.nba.mapping.Personne;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public interface PersonneRepository extends CrudRepository<Personne,String>{
    default List<Personne> findByNom (String nom) {
        return StreamSupport.stream(this.findAll().spliterator(), true)
            .filter((persone) -> persone.getNom() == nom)
            .collect(Collectors.toList());
    }
}

