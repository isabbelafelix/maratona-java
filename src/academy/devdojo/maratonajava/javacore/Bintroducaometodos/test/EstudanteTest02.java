package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest02 {
    public static void main(String[] args) {

        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Mariana";
        estudante01.idade = 23;
        estudante01.sexo = 'F';

        estudante02.nome = "Luke";
        estudante02.idade = 2;
        estudante02.sexo = 'M';

        estudante01.imprime();
        estudante02.imprime();

    }
}
