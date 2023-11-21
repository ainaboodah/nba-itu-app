package mg.tonymushah.itu.nba.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.nba.mapping.Equipe;

public interface EquipeRepository extends CrudRepository<Equipe,String> {
    default List<Equipe> findByNom (String nom) {
        return StreamSupport.stream(this.findAll().spliterator(), true)
            .filter((equipe) -> equipe.getNom() == nom)
            .collect(Collectors.toList());
    }
}
