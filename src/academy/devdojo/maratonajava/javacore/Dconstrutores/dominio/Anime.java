package academy.devdojo.maratonajava.javacore.Dconstrutores.dominio;

public class Anime {
    private String name;
    private String tipo;
    private int episodios;

    private String genero;

    private String estudio;

     public Anime(String name, String tipo, int episodios, String genero){
         this();
         this.name = name;
         this.tipo = tipo;
         this.episodios = episodios;
         this.genero = genero;
     }

    public Anime(String name, String tipo, int episodios, String genero, String estudio){
        this(name, tipo, episodios, genero);
        this.estudio = estudio;
    }

     public Anime(){
         System.out.println("Dentro do construtor sem argumentos");

     }

    public void imprime(){
        System.out.println(this.name);
        System.out.println(this.tipo);
        System.out.println(this.episodios);
        System.out.println(this.genero);
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setEpisodios(int episodios) {
        this.episodios = episodios;
    }

    public int getEpisodios(){
        return episodios;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
