package mg.tonymushah.itu.nba.mapping;

import java.sql.Date;

import jakarta.persistence.*;

@Entity
public class Joueur {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int idJoueur;
    private String nom;
    private Date dateDeNaissance;
    private String genre;
    private String etat;

    public int getIdJoueur() {
        return this.idJoueur;
    }

    public void setIdJoueur(int idJoueur) {
        this.idJoueur = idJoueur;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDateDeNaissance() {
        return this.dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getGenre() {
        return this.genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getEtat() {
        return this.etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    @Override
    public String toString(){
        return String.format("Joueur[idjoueur=%i ,nom='%s',datedenaissance='%s',genre ='%s',etat='%s']",getIdJoueur(),getNom(),getDateDeNaissance(),getGenre(),getEtat());
    }


    
}
