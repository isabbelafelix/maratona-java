package academy.devdojo.maratonajava.introducao;

public class Aula07EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10){
            System.out.println("Dentro do while: " + ++count);

        }

        System.out.println("-----------------------------------------");

        count = 0;
        do {
            System.out.println("Dentro do do-while: " + count);
            count++;

        }while (count < 10);

        System.out.println("-----------------------------------------");

        for (count = 0; count < 10; count++){
            //faça:
            System.out.println("Dentro do For: " + count);

        }
    }
}
