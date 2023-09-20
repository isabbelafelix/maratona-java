package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays03 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros1 = {0, 1, 2, 3, 4, 5};
        int[] numeros2 = new int[]{0, 1, 2, 3, 4, 5};

        for (int i = 0; i < numeros1.length; i++) {

            System.out.println(numeros1[i]);
        }

        System.out.println("------------------------");

        for (int num : numeros2) {
            System.out.println(num);

        }
    }
}
