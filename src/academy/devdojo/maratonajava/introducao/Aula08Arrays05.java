package academy.devdojo.maratonajava.introducao;

public class Aula08Arrays05 {
    public static void main(String[] args) {
        int[][] arrayDeInt = new int[3][];

        arrayDeInt[0] = new int[2];
        arrayDeInt[1] = new int[4];
        arrayDeInt[2] = new int[6];

        arrayDeInt[0][0] = 28;
        arrayDeInt[0][1] = 50;

        arrayDeInt[1][0] = 26;
        arrayDeInt[1][1] = 34;
        arrayDeInt[1][2] = 48;
        arrayDeInt[1][3] = 72;

        arrayDeInt[2][0] = 100;
        arrayDeInt[2][1] = 200;
        arrayDeInt[2][2] = 300;
        arrayDeInt[2][3] = 400;
        arrayDeInt[2][4] = 500;
        arrayDeInt[2][5] = 600;

        int[][] arrayDeInt2 = {{0, 0}, {1, 2, 3}, {1, 2, 3, 4, 5, 6}};

        for (int[] arrBase : arrayDeInt) {
            System.out.println("\n----------------------");
            for (int num: arrBase) {
                System.out.print(num + "  ");
            }
        }

        System.out.println();

        for (int[] arrBase : arrayDeInt2) {
            System.out.println("\n----------------------");
            for (int num: arrBase) {
                System.out.print(num + "  ");
            }
        }
    }
}

//Mais utilizado é as coleções = map.