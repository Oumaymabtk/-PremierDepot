package exercice;

import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        // Création d'une instance de la calculatrice
        Calculatrice calc = new Calculatrice();
        Scanner scanner = new Scanner(System.in);

        // Demande de l'opération à effectuer
        System.out.println("Bienvenue dans la calculatrice !");
        System.out.println("Choisissez une opération :");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Entrez votre choix (1-4) : ");
        int choix = scanner.nextInt();

        // Demande des deux nombres
        System.out.print("Entrez le premier nombre : ");
        double num1 = scanner.nextDouble();
        System.out.print("Entrez le deuxième nombre : ");
        double num2 = scanner.nextDouble();

        // Exécution de l'opération choisie
        try {
            double resultat = 0;
            switch (choix) {
                case 1:
                    resultat = calc.addition(num1, num2);
                    break;
                case 2:
                    resultat = calc.soustraction(num1, num2);
                    break;
                case 3:
                    resultat = calc.multiplication(num1, num2);
                    break;
                case 4:
                    resultat = calc.division(num1, num2);
                    break;
                default:
                    System.out.println("Choix invalide !");
                    return;
            }

            // Affichage du résultat
            System.out.println("Le résultat est : " + resultat);

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
