package academy.devdojo.maratonajava.introducao;

public class Aula03TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean

        long numeroGrande = 10000;
        int age = (int)1000000000000000000L;
        double salarioDouble = 2000.0D;
        float salarioFloat = 2500.0F;
        byte idadeByte = 10;
        short idadeShort = 10;

        //bollean recebe true ou false
        boolean verdadeiro = true;
        boolean falso = false;

        //ascii
        char caractere1 = 87;
        //unicode
        char caractere2 = '\u0041';

        String nome = "Isabela";

        System.out.println("Idade: " + age);
        System.out.println(verdadeiro);
        System.out.println(falso);
        System.out.println(caractere1);
        System.out.println(caractere2);
        System.out.println(nome);
    }
}
