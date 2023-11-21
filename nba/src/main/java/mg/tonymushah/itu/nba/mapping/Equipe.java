package mg.tonymushah.itu.nba.mapping;

import jakarta.persistence.*;

@Entity
public class Equipe {
   @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idEquipe;
    private String nom;
    private int idVille;

    public int getIdEquipe() {
        return this.idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getIdVille() {
        return this.idVille;
    }

    public void setIdVille(int idVille) {
        this.idVille = idVille;
    }

    @Override
    public String toString(){
        return String.format("EquipeMere[idequipe=%i,nom='%s',idville=%i]",getIdEquipe(),getNom(),getIdVille());
    }
}
