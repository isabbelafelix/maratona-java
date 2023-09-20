package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Escola;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Professor;

public class EscolaTest01 {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Mariana");
        Professor professor2 = new Professor("Isabela");
        Professor[] professores = {professor1, professor2};
        Escola escola = new Escola("EEFM Alguma Coisa", professores);

        escola.imprime();
    }
}
