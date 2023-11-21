package mg.tonymushah.itu.nba.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import mg.tonymushah.itu.nba.mapping.Joueur;
import mg.tonymushah.itu.nba.mapping.Personne;
import mg.tonymushah.itu.nba.repository.JoueurRepository;
import mg.tonymushah.itu.nba.repository.PersonneRepository;

@RestController
public class PersonneController {
    @Autowired
    JoueurRepository repository;

    @GetMapping("/joueur/{id}")
    public Personne getJoueur(@PathVariable(name = "id") String id) {
        return repository.findById(id).orElse(null);
    }
}
