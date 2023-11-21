package mg.tonymushah.itu.nba.mapping;

import jakarta.persistence.*;

@Entity
public class Personne {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String id;
    private String nom;
    private String passwd;

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPasswd() {
        return this.passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    @Override
    public String toString(){
        return String.format("Persone[id='%s',nom='%s',passwd='%s']",getId(),getNom(),getPasswd());
    }

}
