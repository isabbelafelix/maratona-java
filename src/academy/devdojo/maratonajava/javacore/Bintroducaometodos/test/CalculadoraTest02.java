package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest02 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicaDoisNumeros(8, 7);
        System.out.println("-------------------------------");

        calculadora.dividindoDoisNumeros(50, 2);
        System.out.println("-------------------------------");
    }
}
