import java.util.Scanner;

public class NumberGame {
    public static void main(String [] args){
        // Générer un nombre aléatoire entre 1 et 100
        int nombreAleatoire = (int) (Math.random() * 100) + 1;
        int nombreDevine = 0;
        int nombreEssais = 0;

        System.out.println("Je pense à un nombre entre 1 et 100. Pouvez-vous le deviner ?");

        // Boucle tant que le nombre deviné n'est pas correct
        while (nombreDevine != nombreAleatoire) {
            // Lecture du nombre deviné
            Scanner scanner = new Scanner(System.in);
            System.out.print("Entrez un nombre : ");
            nombreDevine = scanner.nextInt();

            // Incrémenter le nombre d'essais
            nombreEssais++;

            // Comparer le nombre deviné avec le nombre aléatoire
            if (nombreDevine < nombreAleatoire) {
                System.out.println("Le nombre à deviner est plus grand !");
            } else if (nombreDevine > nombreAleatoire) {
                System.out.println("Le nombre à deviner est plus petit !");
            } else {
                System.out.println("Bravo ! Vous avez deviné le nombre en " + nombreEssais + " essais !");
            }
        }
    }
}
