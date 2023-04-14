package ExercicesFonctions;

import java.util.Scanner;

public class WordNumber {
    public static int countWords(String phrase) {
        //Vérifie si la phrase est vide
        if (phrase == null || phrase.isEmpty()) {
            return 0;
        }
        //Méthode qui fractionne la phrase (où les espaces sont les délimiteurs)
        String[] words = phrase.split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {

        //Lit les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une phrase : ");
        String phrase = scanner.nextLine();

        //On stocke dans la variable le nombre de mots
        int nbrMots = countWords(phrase);
        System.out.println("Nombre de mots : " + nbrMots);
    }
}
