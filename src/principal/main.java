package principal;

import java.util.Scanner;

import hamburgueria.ConcreteHamburguerBuilder;
import hamburgueria.Hamburguer;
import hamburgueria.HamburguerBuilder;
import hamburgueria.HamburguerDirector;

public class main {

	public static void main(String[] args) {
        HamburguerBuilder builder = new ConcreteHamburguerBuilder();
        HamburguerDirector director = new HamburguerDirector(builder);

        Hamburguer hamburguer = director.construct();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou o Hambúrguer de Frango");
                    System.out.println("Pão: " + hamburguer.getPao());
                    System.out.println("Frango: " + hamburguer.getFrango());
                    System.out.println("Ingredientes: " + hamburguer.getIngredientes());
                    System.out.println("Queijo: " + hamburguer.isQueijo());
                    System.out.println("Alface: " + hamburguer.isAlface());
                    System.out.println("Tomate: " + hamburguer.isTomate());
                    break;
                case 2:
                    System.out.println("Você selecionou o Hambúrguer de Carne");

                    System.out.println("Pão: " + hamburguer.getPao());
                    System.out.println("Carne: " + hamburguer.getCarne());
                    System.out.println("Ingredientes: " + hamburguer.getIngredientes());
                    System.out.println("Queijo: " + hamburguer.isQueijo());
                    System.out.println("Alface: " + hamburguer.isAlface());
                    System.out.println("Tomate: " + hamburguer.isTomate());
                    break;
                case 3:
                    System.out.println("Você selecionou o Hambúrguer de Frango e catupiry");
                    System.out.println("Pão: " + hamburguer.getPao());
                    System.out.println("Frango: " + hamburguer.getFrango());
                    System.out.println("Ingredientes: " + hamburguer.getIngredientes());
                    System.out.println("Queijo: " + hamburguer.isQueijo());
                    System.out.println("Alface: " + hamburguer.isAlface());
                    System.out.println("Tomate: " + hamburguer.isTomate());
                    System.out.println("Catupiry: " + hamburguer.isCatupiry());
                    break;                    
                case 4:
                    System.out.println("Saindo do sistema...");
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha uma opção válida.");
                    break;
            }
        }



	}
	
    public static void exibirMenu() {
        System.out.println("Menu:");
        System.out.println("1 - Hambúrguer de Frango");
        System.out.println("2 - Hambúrguer de Carne");
        System.out.println("3 - Hambúrguer de Frango e catupiry");
        System.out.println("4 - Sair do sistema");
        System.out.print("Escolha uma opção: ");
    }

}
