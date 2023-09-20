package academy.devdojo.maratonajava.introducao;

public class Aula05Operadores {
    public static void main(String[] args) {
        //OPERADORES ARITMETICOS
        // + - / *
        int numero01 = 10;
        int numero02 = 20;

        int resultado = numero01 * numero02;

        System.out.println(resultado);

        // %
        int resto = 20 % 2;
        System.out.println(resto);

        // < > , <= >= , == , !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteDez = 10 != 10;
        System.out.println(isDezMaiorQueVinte);
        System.out.println(isDezMenorQueVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteDez);

        //OPERADORES LÓGICOS
        //&& (AND), || (OR), !
        int idade = 29;
        float salario = 3726F;
        boolean isDentroDaLeiMaiorQueTrinta =  idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta =  idade < 30 && salario >= 3381;
        System.out.println(isDentroDaLeiMaiorQueTrinta + " isDentroDaLeiMaiorQueTrinta");
        System.out.println(isDentroDaLeiMenorQueTrinta + " isDentroDaLeiMenorQueTrinta");

        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 2000;
        float valorPlayStation = 5000F;
        boolean isPlayStationCincoCompravel =
                valorTotalContaCorrente > valorPlayStation || valorTotalContaPoupanca > valorPlayStation;
        System.out.println(isPlayStationCincoCompravel);

        //OPERADORES DE ATRIBUÇÃO
        //=, +=, -=, *=, /=, %=
        double bonus = 1800;
        bonus += 1000;
        bonus -= 1000;
        bonus *= 2;
        bonus /= 2;
        bonus %= 2;
        System.out.println(bonus);

        // ++, --
        int contador = 0;
        contador += 1; //contador = contador + 1
        contador++;
        contador--;
        System.out.println(contador);
    }
}
