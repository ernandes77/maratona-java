package introducao.Dconstrutor.dominio;

public class Anime {
    private String nome;
    private String tipo;
    private int episodios;
    private String genero;

    private String sexo;

    public Anime(String nome, String tipo, int episodios, String genero){
        this();
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
        this.genero = genero;

    }

    public Anime(String nome, String tipo, int episodios, String genero,String sexo){
        this(nome, tipo, episodios, genero);
        this.sexo = sexo;
    }
    public Anime(){
        System.out.println("Dentro do construtor vazio");
    }

    public void init(String nome, String tipo, int episodios ){
        this.nome = nome;
        this.tipo = tipo;
        this.episodios = episodios;
    }
    public void init(String nome,String tipo,int episodios,String genero){
        this.init(nome,tipo,episodios);
        this.genero = genero;

    }

    public void imprimi(){
        System.out.println(this.nome);
        System.out.println((this.tipo));
        System.out.println(this.episodios);
        System.out.println(this.genero);
        System.out.println(this.sexo);

    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    public String getTipo(){
        return tipo;
    }
    public void setEpisodios(int episodios){
        this.episodios = episodios;
    }
    public int getEpisodios(int episodios){
        return episodios;
    }
    public void setGenero(String genero){
        this.genero = genero;
    }
    public String getGenero(){
        return genero;
    }

    public void setSexo(String sexo){
        this.sexo = sexo;
    }
    public String getSexo(){
        return sexo;
    }
}
