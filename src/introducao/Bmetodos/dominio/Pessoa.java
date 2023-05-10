package introducao.Bmetodos.dominio;

public class Pessoa {
//Modificador de acesso privado so vai poder ser acesssado pelo objeto
    private String nome;
    private int idade;

    public void imprimi(){
        System.out.println(this.nome);//usa-se ao inves de chama get e set chamando pelo metodo
        System.out.println(this.idade);
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return nome;
    }
    public void setIdade(int idade){//metodo idade menor que a idade
        if(idade < 0){
            System.out.println("idade invalida");
        }
        this.idade = idade;
    }
    public int getIdade(){
        return idade;
    }
}
