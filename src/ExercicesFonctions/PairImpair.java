package ExercicesFonctions;

import java.util.Scanner;

public class PairImpair {
    public static void main(String [] args){
        int number;
        System.out.print("Un entier : ");
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

         if(number%2 ==0)
             System.out.println("Pair");
         else
             System.out.println("Impair");
    }
}
