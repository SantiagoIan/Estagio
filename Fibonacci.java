package AulasPOO.Exercicios.Test;

public class Fibonacci {

    public static int fibonacci(int n) {
        int a = 0, b = 1;

        System.out.println("número 1 = 0");
        System.out.println("número 2 = 1");

        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            System.out.println("Soma = "  + a +" + "+ b + " = " + temp);
            a = b;
            b = temp;
        }
        return b;
    }

    public static void main(String[] args) {
        int n = 10;
        System.out.println("\nCálculo da sequência de Fibonacci:");
        fibonacci(n);
    }
}

