package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais03 {
    public static void main(String[] args) {
        //Doar se salário > 5000

        double salario = 3000;
        String mensagemDoar = "Vou doar 500 pro DevDojo";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";

        //(condição) ? verdadeiro : falso
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);

        /**
         * Dado um determinado salário anual, eu quero saber qual valor
         * que tenho que pagar;
         */


    }
}
