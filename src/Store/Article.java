package Store;

import java.util.Objects;

public class Article {
    //Attributs
    private String nom;
    private float prix;

    //Constructeur
    public Article(String nom, float prix) {
        this.nom = nom;
        this.prix = prix;
    }

    //Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    //toString
    @Override
    public String toString() {
        return "Article{" +
                "nom='" + nom + '\'' +
                ", prix=" + prix +
                '}';
    }

    //Equals et Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return Float.compare(article.prix, prix) == 0 && Objects.equals(nom, article.nom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prix);
    }
}