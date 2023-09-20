package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(25 - 5);
    }

    public void multiplicaDoisNumeros(int numero1, int numero2){
        System.out.println(numero1 * numero2);

    }

    public void dividindoDoisNumeros(int numero1, int numero2){
        System.out.println(numero1 / numero2);
    }

    public double divideDoisNumeros(double num1, double num2){
        if (num2 == 0){
            return 0;
        }
        return num1 / num2;
    }

    public double divide(double numero1, double numero2){
        if (numero2 != 0){
            return numero1 / numero2;
        }
        return 0;
    }

    public void imprimeDivisaoDeDoisNumeros(double num1,  double num2){
        //return; não pode, porque é void
        if (num2 == 0){
            System.out.println("Não existe divisão por ZERO");
            return;
        }
        System.out.println(num1 / num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros");
        System.out.println("Num1: " + num1);
        System.out.println("Num2: " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }

        System.out.println(soma);
    }

    public void somaVarArgs(int... numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;

        }

        System.out.println(soma);
    }
}
