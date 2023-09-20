package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float, double = 0
        //char = '\u0000' ' '
        //boolean = false
        //String = null
        String [] nomes =  new String[4];
        nomes[0] = "Maria";
        nomes[1] = "Josefa";
        nomes[2] = "Glaucia";
        nomes[3] = "Mariscleuda";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

        nomes = new String[3];
        System.out.println(nomes[0]);

    }
}
