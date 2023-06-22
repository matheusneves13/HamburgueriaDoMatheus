package hamburgueria;

import java.util.List;

public class Hamburguer {

	private String pao;
	private String carne;
	private String frango;
	private List<String> ingredientes;
	private boolean queijo;
	private boolean alface;
	private boolean tomate;
	private boolean catupiry;


	public Hamburguer(String pao, String carne,String frango, List<String> ingredientes, boolean queijo, boolean alface, boolean tomate, boolean catupiry) {
        this.pao = pao;
        this.carne = carne;
        this.frango = frango;
        this.ingredientes = ingredientes;
        this.queijo = queijo;
        this.alface = alface;
        this.tomate = tomate;
        this.catupiry = catupiry;
    }


	public String getPao() {
		return pao;
	}


	public String getCarne() {
		return carne;
	}


	public String getFrango() {
		return frango;
	}


	public List<String> getIngredientes() {
		return ingredientes;
	}


	public boolean isQueijo() {
		return queijo;
	}


	public boolean isAlface() {
		return alface;
	}


	public boolean isTomate() {
		return tomate;
	}


	public boolean isCatupiry() {
		return catupiry;
	}
	
	

}
