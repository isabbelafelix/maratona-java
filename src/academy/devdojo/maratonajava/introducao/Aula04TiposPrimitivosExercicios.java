package academy.devdojo.maratonajava.introducao;

/*
PRÁTICA

CRIE VARIÁVEIS PARA OS CAMPOS DESCRITOS ABAIXO ENTRE <> E IMPRIMA A SEGUINTE MENSAGEM:

    EU <NOME>, MORANDO NO ENDEREÇO <ENDEREÇO>,
    CONFIRMO QUE RECEBI O SALARIO DE <SALARIO>, NA DATA
 */
public class Aula04TiposPrimitivosExercicios {

    public static void main(String[] args) {

        String nome = "Isabela Felix";
        String endereco = "Rua 15C, Número 70A - Conjunto Industrial";
        double salario = 3200.27;
        String data = "13/01/2023";

        System.out.println("Eu " + nome + ", Morando no endereço " + endereco + ", confirmo que recebi o " +
                "salario de " + salario + ", na data " + data);
    }
}
