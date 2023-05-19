package introducao.Fmodificadorestatico.dominio;

public class Carro {
    private String nome;
    private int velocidadeMaxima;
    private int velocidadeLimite = 250;

    public Carro(String nome, int velocidadeMaxima, int velocidadeLimite) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;
        this.velocidadeLimite = velocidadeLimite;
    }

    public void imprimi(){
        System.out.println("--------------");
        System.out.println("Nome"+this.nome);
        System.out.println("velocidadeMaxima"+this.velocidadeMaxima);
        System.out.println("velocidadeLimite"+this.velocidadeLimite);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(int velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }

    public int getVelocidadeLimite() {
        return velocidadeLimite;
    }

    public void setVelocidadeLimite(int velocidadeLimite) {
        this.velocidadeLimite = velocidadeLimite;
    }
}
