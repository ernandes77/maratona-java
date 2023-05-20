package introducao.Fmodificadorestatico.teste;

import introducao.Fmodificadorestatico.dominio.Estudante;

public class EstudanteTeste1 {
    public static void main(String[] args) {
        Estudante e1 = new Estudante("Isadora");
        Estudante e2 = new Estudante("Manuella");


        e1.imprimi();
        e2.imprimi();
    }
}
