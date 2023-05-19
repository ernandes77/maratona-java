package introducao.Fmodificadorestatico.teste;

import introducao.Fmodificadorestatico.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro c1 = new Carro(" Bmw",320,230);
        Carro c2 = new Carro(" mercedes",320,230);
        Carro c3 = new Carro(" Posch",330,280);

        c1.imprimi();
        c2.imprimi();
        c3.imprimi();
    }
}
