package ExercicesFonctions;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class SaveTest {
    public static void main(String[] args) {
        //On ouvre un scanner
        Scanner scanner = new Scanner(System.in);
        String path = "C:\\Users\\evac0\\IdeaProjects\\ExercicesJava\\src\\ExercicesFonctions.SaveTest.txt";
        Path filePath = Paths.get(path);

        try {
            System.out.print("Entrez une phrase : ");
            //On récupère la phrase écrite par l'utilisateur
            String phrase = scanner.nextLine();

            //Créer un nouveau fichier fileWriter
            FileWriter writer = new FileWriter(path);
            Files.writeString(filePath, phrase, StandardCharsets.UTF_8);
            writer.write(phrase);
            writer.close();
            //Gère les exceptions
        } catch (IOException e) {
            System.out.println("Le fichier n'a pas pu être sauvegardé.");
            e.printStackTrace(
            );
        } finally {
            //On ferme le scanner
            scanner.close();
        }
    }
}

