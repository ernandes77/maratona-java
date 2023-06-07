package introducao.Hheranca.dominio;

public class Pessoa {
    private String nome;
    private String cpf;

    private Endereco endereco;

    public void imprimi(){
        System.out.println("Nome "+this.nome);
        System.out.println("Cpf "+this.cpf);
        System.out.println("Rua "+this.endereco.getRua()+" "+"Cep "+this.endereco.getCep());
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
