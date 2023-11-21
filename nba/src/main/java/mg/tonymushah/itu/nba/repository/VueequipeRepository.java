package mg.tonymushah.itu.nba.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.data.repository.CrudRepository;

import mg.tonymushah.itu.nba.mapping.Vueequipe;

public interface VueequipeRepository extends CrudRepository<Vueequipe,Integer>{
    default List<Vueequipe> findById (int id) {
        return StreamSupport.stream(this.findAll().spliterator(), true)
            .filter((vueEquipe) -> vueEquipe.getIdEquipe() == id)
            .collect(Collectors.toList());
    }

}