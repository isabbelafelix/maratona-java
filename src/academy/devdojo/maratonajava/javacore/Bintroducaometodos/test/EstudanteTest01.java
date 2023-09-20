package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressoraEstudante = new ImpressoraEstudante();

        estudante01.nome = "Mariana";
        estudante01.idade = 23;
        estudante01.sexo = 'F';

        estudante02.nome = "Luke";
        estudante02.idade = 2;
        estudante02.sexo = 'M';

        impressoraEstudante.imprime(estudante01);

        System.out.println("---------------------------------");

        impressoraEstudante.imprime(estudante02);

        System.out.println("---------------------------------");

        impressoraEstudante.imprime(estudante01);

        System.out.println("---------------------------------");

        impressoraEstudante.imprime(estudante02);

    }
}
