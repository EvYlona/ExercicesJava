package ExercicesClasses;

import java.util.Objects;

public class Circle {
    Integer Hauteur;
    Integer Largeur;

    //Getter et Setter
    public Circle(Integer hauteur, Integer largeur) {
        Hauteur = hauteur;
        Largeur = largeur;
    }

    public Integer getHauteur() {
        return Hauteur;
    }

    public void setHauteur(Integer hauteur) {
        Hauteur = hauteur;
    }

    public Integer getLargeur() {
        return Largeur;
    }

    public void setLargeur(Integer largeur) {
        Largeur = largeur;
    }

    //toString
    @Override
    public String toString() {
        return "Circle{" +
                "Hauteur=" + Hauteur +
                ", Largeur=" + Largeur +
                '}';
    }

    //Equals et Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Objects.equals(Hauteur, circle.Hauteur) && Objects.equals(Largeur, circle.Largeur);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Hauteur, Largeur);
    }
}
