package Store.Entity;

import java.util.Objects;

public class Client {
    //Attributs
    private String nom;
    private String adresse;

    //Constructeur
    public Client(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }

    //Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    //toString
    @Override
    public String toString() {
        return "Client{" +
                "nom='" + nom + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }

    //Equals et Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Client client = (Client) o;
        return Objects.equals(nom, client.nom) && Objects.equals(adresse, client.adresse);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, adresse);
    }
}
