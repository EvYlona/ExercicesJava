package ExercicesFonctions;

public class Pyramid {
    public static void main(String[] args) {
        int rows = 9;//Hauteur
        int k = 0;

        for (int i = 1; i <= rows; ++i, k = 0) {
            for (int a = 1; a <= rows - i; ++a) {
                System.out.print(" ");
            }

            while (k != 2 * i - 1) {
                //On affiche une étoile
                System.out.print("*");
                //On incrémente la varibale de 1
                ++k;
            }

            System.out.println();
        }
    }
}
