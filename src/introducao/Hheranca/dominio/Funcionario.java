package introducao.Hheranca.dominio;

public class Funcionario extends Pessoa {


    private double salario;
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
