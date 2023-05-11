package introducao.Dconstrutor.teste;


import introducao.Dconstrutor.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime  = new Anime("ernandes","programador",286,"ti","Masculino");

       // anime.init("goku","Luta",12,"açao");
        anime.imprimi();
    }


}
