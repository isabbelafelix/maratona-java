package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays04 {
    public static void main(String[] args) {
        //1,2,3,4,5,6,7 Meses
        // 31,28,31,30 Dias
        int[][] dias = new int[3][3];
        dias[0][0] = 28;
        dias[0][1] = 31;
        dias[0][2] = 30;

        dias[1][0] = 28;
        dias[1][1] = 31;
        dias[1][2] = 30;

        dias[2][0] = 28;
        dias[2][1] = 31;
        dias[2][2] = 30;

        for (int i = 0; i < dias.length; i++) {
            for (int j = 0; j < dias[i].length; j++) {

                System.out.println(dias[i][j]);
            }
        }

        System.out.println("-----------------------------------");

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }

        }


    }
}
