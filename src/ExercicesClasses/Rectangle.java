package ExercicesClasses;

import java.util.Objects;

public class Rectangle {

    //On définit les variables
    static Integer hauteur = 6;
    static Integer largeur = 9;


    //Constructeur par défaut
    public Rectangle(Integer hauteur, Integer largeur) {
        this.hauteur = hauteur;
        this.largeur = largeur;
    }

    //Getter et Setter
    public Integer getHauteur() {
        return hauteur;
    }

    public void setHauteur(Integer hauteur) {
        this.hauteur = hauteur;
    }

    public Integer getLargeur() {
        return largeur;
    }

    public void setLargeur(Integer largeur) {
        this.largeur = largeur;
    }


    //Méthode afficher
    public void Afficher() {
        for (int i = 0; i < hauteur; i++) {
            for (int j = 0; j < largeur; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //toString
    @Override
    public String toString() {
        return "Rectangle{" +
                "hauteur=" + hauteur +
                ", largeur=" + largeur +
                '}';
    }

    //Equals et Hashcode
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Rectangle rectangle = (Rectangle) o;
            return Objects.equals(hauteur, rectangle.hauteur) && Objects.equals(largeur, rectangle.largeur);
        }
        @Override
        public int hashCode() {
            return Objects.hash(hauteur, largeur);
        }

        public static void main (String [] args){
            Rectangle rectangle = new Rectangle(hauteur, largeur);
            rectangle.Afficher();
        }
}