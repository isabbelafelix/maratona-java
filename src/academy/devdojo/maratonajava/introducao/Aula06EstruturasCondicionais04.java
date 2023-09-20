package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais04 {
    //Dado um determinado salário anual, qual valor
    //de imposto vou ter que pagar
    //Tabela de impostos:
    //€ 0	      € 34,712	    9.70%
    //€ 34,713	  € 68,507	    37.35%
    //€ 68,508		            49.50%
    public static void main(String[] args) {
         double salarioAnual = 25000;
         double primeiraFaixa = 9.70 / 100;
         double segundaFaixa = 37.35 / 100;
         double terceiraFaixa = 49.50 / 100;
         double valorDoImposto;

         if (salarioAnual <= 34712){
             valorDoImposto = salarioAnual * primeiraFaixa;
         } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
             valorDoImposto = salarioAnual * segundaFaixa;
         } else {
             valorDoImposto = salarioAnual * terceiraFaixa;
         }
        System.out.println(valorDoImposto);

    }
}
