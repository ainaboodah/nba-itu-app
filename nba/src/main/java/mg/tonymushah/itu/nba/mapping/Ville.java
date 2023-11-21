package mg.tonymushah.itu.nba.mapping;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Ville {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idVille;
    private String nom;

    public int getIdVille() {
        return this.idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
    @Override
    public String toString(){
        return String.format("Ville[id=%i,nom='%s']",getIdVille(),getNom());
    }
}