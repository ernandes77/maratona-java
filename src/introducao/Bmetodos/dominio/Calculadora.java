package introducao.Bmetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros() {
        System.out.println("Rsultado da Soma " + (10 + 10));
    }

    public void subtraiDoisNumeros() {
        System.out.println("Resultado da Subtracao " + (20 - 10));
    }

    public void multiplicacao(int num, int num2) {
        System.out.println("Resultado da multiplicacao " + num * num2);
    }

    public double dividirDoisNumeros(double num, double num2) {
        if (num2 == 0) {//se num2 for igual a zero retorna 0
            return 0;
        } else {//se nao for igual a 0 retorna a soma num e num2
            return num / num2;
        }
    }
}