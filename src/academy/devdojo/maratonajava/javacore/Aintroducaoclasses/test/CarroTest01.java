package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.modelo = "Não sei";
        carro1.ano = 1980;

        Carro carro2 = new Carro();
        carro2.nome = "Onix";
        carro2.modelo = "Premier";
        carro2.ano = 2022;

        carro1 = carro2;
        System.out.println(carro1.nome);
        System.out.println(carro1.modelo);
        System.out.println(carro1.ano);

        System.out.println("--------------------------");

        System.out.println(carro2.nome);
        System.out.println(carro2.modelo);
        System.out.println(carro2.ano);
    }
}
