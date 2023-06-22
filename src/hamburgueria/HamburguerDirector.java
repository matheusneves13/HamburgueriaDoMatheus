package hamburgueria;

public class HamburguerDirector {
	private HamburguerBuilder builder;

    public HamburguerDirector(HamburguerBuilder builder) {
        this.builder = builder;
    }

    public Hamburguer construct() {
        builder.escolherPao("Pão de hambúrguer");
        builder.escolherCarne("Carne bovina");
        builder.escolherFrango("Peito de Frango");
        builder.adicionarIngrediente("Cebola");
        builder.adicionarIngrediente("Molho especial");
        builder.adicionarQueijo();
        builder.adicionarAlface();
        builder.adicionarTomate();
        builder.adicionarCatupiry();
        return builder.getHamburger();
    }
}
