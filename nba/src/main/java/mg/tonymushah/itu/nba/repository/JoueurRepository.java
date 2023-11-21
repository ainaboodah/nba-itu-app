package mg.tonymushah.itu.nba.repository;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.nba.mapping.Joueur;

import java.util.List;
import java.util.stream.*;
public interface JoueurRepository extends CrudRepository<Joueur,String>{
    default List<Joueur> findByNom (String nom) {
        return StreamSupport.stream(this.findAll().spliterator(), true)
            .filter((joueur) -> joueur.getNom() == nom)
            .collect(Collectors.toList());
    }
}

