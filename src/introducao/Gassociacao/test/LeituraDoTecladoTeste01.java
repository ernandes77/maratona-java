package introducao.Gassociacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTeste01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Qual se nome ");
        String nome = input.nextLine();
        System.out.println(nome);

        System.out.println("Digite sua idade");
        int idade =input.nextInt();
        if(idade >=18){
            System.out.println("Voce e maior de idade");
        }else{
            System.out.println("Voce e de menor");
        }
        System.out.println(idade+" Anos");

        System.out.println("Digite seu sexo");
        char sexo = input.next().charAt(0);
        if(sexo == 'm') {
            System.out.println("Mulher");
        {if (sexo =='h'){
            System.out.println("Homem");
        }

            }
        }
        System.out.println(sexo);
    }
}
