package introducao.Bmetodos.teste;


import introducao.Bmetodos.dominio.Calculadora;

public class CalculadoraTeste1 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando aqui");
        calculadora.subtraiDoisNumeros();

    }
}
