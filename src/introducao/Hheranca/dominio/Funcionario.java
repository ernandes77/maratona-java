package introducao.Hheranca.dominio;

public class Funcionario extends Pessoa {


    private double salario;
    public void imprimi(){
        super.imprimi();//chama o objeto
        System.out.println(this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
