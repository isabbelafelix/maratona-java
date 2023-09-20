package academy.devdojo.maratonajava.javacore.Dconstrutores.test;


import academy.devdojo.maratonajava.javacore.Dconstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Haikyuu", "TV", 15, "Ação", "Production IG");
        //Anime anime1 = new Anime();
        //anime1.imprime();
        anime.imprime();
    }
}
