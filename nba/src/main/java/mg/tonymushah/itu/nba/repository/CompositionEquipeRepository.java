package mg.tonymushah.itu.nba.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.nba.mapping.CompositionEquipe;

public interface CompositionEquipeRepository extends CrudRepository<CompositionEquipe,Integer> {
    default List<CompositionEquipe> findById (int idCompositionEquipe) {
        return StreamSupport.stream(this.findAll().spliterator(), true)
            .filter((compositionEquipe) -> compositionEquipe.getIdComposition() == idCompositionEquipe)
            .collect(Collectors.toList());
    }
}
