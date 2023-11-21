package mg.tonymushah.itu.nba.mapping;

import jakarta.persistence.*;

@Entity
public class CompositionEquipe {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idComposition;
    private int idEquipe;
    private int idJoueur;

    public int getIdComposition() {
        return this.idComposition;
    }

    public void setIdComposition(int idComposition) {
        this.idComposition = idComposition;
    }

    public int getIdEquipe() {
        return this.idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getIdJoueur() {
        return this.idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }
    @Override
    public String toString(){
        return String.format("CompositionEquipe[idComposition=%i,idEquipe=%i,idJoueur=%i]",getIdComposition(),getIdEquipe(),getIdJoueur());
    }

    
}
