package hamburgueria;

import java.util.ArrayList;
import java.util.List;

public class ConcreteHamburguerBuilder implements HamburguerBuilder {

	private String pao;
	private String carne;
	private String frango;
	private List<String> ingredientes;
	private boolean queijo;
	private boolean alface;
	private boolean tomate;
	private boolean catupiry;
	
	public ConcreteHamburguerBuilder() {
		 ingredientes = new ArrayList<>();
	}
	@Override
	public void escolherPao(String pao) {
		this.pao = pao;
	}

	@Override
	public void escolherCarne(String carne) {
		this.carne = carne;
	}

	@Override
	public void escolherFrango(String frango) {
		this.frango = frango;
	}

	@Override
	public void adicionarIngrediente(String ingrediente) {
		 ingredientes.add(ingrediente);
	}

	@Override
	public void adicionarQueijo() {
		queijo = true;
	}

	@Override
	public void adicionarAlface() {
		alface = true;
	}

	@Override
	public void adicionarTomate() {
        tomate = true;

	}

	@Override
	public void adicionarCatupiry() {
		catupiry = true;
	}

	@Override
	public Hamburguer getHamburger() {
        return new Hamburguer(pao, carne, frango, ingredientes, queijo, alface, tomate, catupiry);
	}

}
