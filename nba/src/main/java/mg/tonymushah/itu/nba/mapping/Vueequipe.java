package mg.tonymushah.itu.nba.mapping;

import jakarta.persistence.*;

@Entity
public class Vueequipe {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idEquipe;
    private String nomequipe;
    private String nomville;
    private String nomjoueur;

    public int getIdEquipe() {
        return this.idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public String getNomequipe() {
        return this.nomequipe;
    }

    public void setNomequipe(String nomequipe) {
        this.nomequipe = nomequipe;
    }

    public String getNomville() {
        return this.nomville;
    }

    public void setNomville(String nomville) {
        this.nomville = nomville;
    }

    public String getNomjoueur() {
        return this.nomjoueur;
    }

    public void setNomjoueur(String nomjoueur) {
        this.nomjoueur = nomjoueur;
    }
    @Override
    public String toString(){
        return String.format("Vueequipe[idequipe=%i,nomequipe='%s',nomville='%s',nomjoueur='%s']",getIdEquipe(),getNomequipe(),getNomville(),getNomjoueur());
    }

}
