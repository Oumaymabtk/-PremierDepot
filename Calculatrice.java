package exercice;

class Calculatrice {
//Méthode d'addition
public double addition(double a, double b) {
 return a + b;
}

//Méthode de soustraction
public double soustraction(double a, double b) {
 return a - b;
}

//Méthode de multiplication
public double multiplication(double a, double b) {
 return a * b;
}

//Méthode de division avec gestion de l'erreur de division par zéro
public double division(double a, double b) {
 if (b == 0) {
     throw new ArithmeticException("Erreur : Division par zéro.");
 }
 return a / b;
}
}