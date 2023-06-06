package introducao.Gassociacao.test;

import introducao.Gassociacao.dominio.Aluno;
import introducao.Gassociacao.dominio.Local;
import introducao.Gassociacao.dominio.Professor;
import introducao.Gassociacao.dominio.Seminario;

public class AssociacaoTeste01 {
    public static void main(String[] args) {

        Local local = new Local("rua");
        Aluno aluno = new Aluno("ernandes",34);
        Professor professor = new Professor("Diego","pirata");

        Aluno[]alunosSeminario={aluno};
        Seminario seminario = new Seminario("onde achar aula",alunosSeminario,local);


        Seminario[]seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);


    }
}
