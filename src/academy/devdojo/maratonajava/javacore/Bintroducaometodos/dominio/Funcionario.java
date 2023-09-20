package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

import java.security.PublicKey;

public class Funcionario {

    private String nome;
    private Integer idade;
    private double[] salarios;
    private double media;


    //CRIAR DOIS METODOS
    //1 - IMPRIMIR O RESULTADO DOS OBJETOS
    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);

        if (salarios == null){
            return;
        }
        for (double salario : salarios) {
            System.out.print(salario + " ");
        }

        imprimeMediaSalario();
    }

    public void imprimeMediaSalario(){
        if (salarios == null) {
            return;
        }

        for (double salario : salarios){
            media += salario;
        }
        media /= salarios.length;
        System.out.println("\nMédia salarial: " + media);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void setSalarios(double[] salarios) {
        this.salarios = salarios;
    }

    public String getNome() {
        return nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public double[] getSalarios() {
        return salarios;
    }

    public double getMedia() {
        return media;
    }
}
