package introducao.Hheranca.dominio;

public class Funcionario extends Pessoa {


    private double salario;

    static{
        System.out.println("Dentro do bloco statico de Funcionario");
    }
    {
        System.out.println("Dentro do bloco de inicializacao Funcionario 1");
    }
    {
        System.out.println("Dentro do bloco de inicializacao Funcionario 2");
    }

    public Funcionario(String nome)
    {
        super(nome);
        System.out.println("Dentro do construtor Funcionario");
    }
    public void imprimi(){
        super.imprimi();//super.imprimi e mesma coisa de sobrecarga de metodo ela importa o objeto mesma
        //coisa de this.Pessoa importa direto do objeto
        System.out.println(this.salario);
    }
    public void relatorioDePagamentos(){
        System.out.println("Eu"+this.nome+"recebi o salario"+this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
