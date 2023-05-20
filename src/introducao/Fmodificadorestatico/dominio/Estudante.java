package introducao.Fmodificadorestatico.dominio;

public class Estudante {

    private String nome;
    private static int idade =18;

    public Estudante(String nome) {
        this.nome = nome;
    }

    public void imprimi(){
        System.out.println("---------------");
        System.out.println("Nome"+this.nome);
        System.out.println("idade"+Estudante.idade);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
