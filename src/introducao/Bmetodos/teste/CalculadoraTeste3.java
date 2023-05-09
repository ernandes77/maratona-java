package introducao.Bmetodos.teste;

import introducao.Bmetodos.dominio.Calculadora;

public class CalculadoraTeste3 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividirDoisNumeros(20,10);

        System.out.println(result);
    }
}
