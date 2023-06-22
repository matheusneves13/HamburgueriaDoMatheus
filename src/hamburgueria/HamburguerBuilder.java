package hamburgueria;

public interface HamburguerBuilder {
    void escolherPao(String pao);
    void escolherCarne(String carne);
    void escolherFrango(String frango);
    void adicionarIngrediente(String ingrediente);
    void adicionarQueijo();
    void adicionarAlface();
    void adicionarTomate();
    void adicionarCatupiry();
    Hamburguer getHamburger();
}
