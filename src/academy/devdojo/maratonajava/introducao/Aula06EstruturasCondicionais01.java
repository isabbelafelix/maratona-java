package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Pode comprar bebida Alcoolica");
        } else {
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

        //COM OPERADOR DE NEGAÇÃO
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não autorizado a comprar bebida alcoolica");
        }

    }
}
