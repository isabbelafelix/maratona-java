package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

import java.io.PrintStream;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Maria";
        professor.idade = 35;
        professor.sexo = 'F';

        String dadosProfessor = "Nome: " + professor.nome + ", " +
                "Idade: " + professor.idade +
                ", Sexo: " + professor.sexo;

        System.out.println(dadosProfessor);
    }
}
