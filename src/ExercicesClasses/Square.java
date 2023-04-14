package ExercicesClasses;

import java.util.Objects;

public class Square extends Rectangle{
    static Integer cote = 5;

    //Constructeur hérité de Rectangle
    public Square(Integer cote) {
        super(cote, cote);
    }

    //Méthode calculDeSurface
    public Integer calculSurface() {
        return hauteur * largeur;
    }

    public static void main (String [] args){
        Square square= new Square(cote);
        System.out.println("Surface: " + square.calculSurface());
    }
}
