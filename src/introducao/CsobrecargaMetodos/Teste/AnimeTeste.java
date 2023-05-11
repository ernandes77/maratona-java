package introducao.CsobrecargaMetodos.Teste;

import introducao.CsobrecargaMetodos.dominio.Anime;

public class AnimeTeste {
    public static void main(String[] args) {
        Anime anime  = new Anime();
        anime.init("goku","Luta",12,"açao");
        anime.imprimi();
    }


}
