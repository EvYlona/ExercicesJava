package ExercicesFonctions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordNbrCounterText {
    public static void main(String[] args) {
        //Exemple avec le fichier text dans ce chemin "src/ExercicesFonctions.SaveTest.txt
        //On ouvre un scanner
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez le chemin d'accès au fichier : ");
        //On récupère la phrase qu'on stocke dans la variable
        String filePath = scanner.nextLine();
        //Création d'un fichier avec la variable
        File file = new File(filePath);
        //Initialisation du nombre de mots à 0
        int wordCount = 0;

        //Gestion des exceptions
        try{
            //On réouvre un scanner
            Scanner fileScanner = new Scanner(file);
            //On boucle sur le contenu du fichier
            while (fileScanner.hasNextLine()) {
                //
                String line = fileScanner.nextLine();
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            fileScanner.close();
            System.out.println("Le nombre de mots dans le fichier est : " + wordCount);
    } catch (FileNotFoundException e) {
        System.out.println("Le fichier n'existe pas ou n'est pas accessible.");
    }
        scanner.close();
    }
}
