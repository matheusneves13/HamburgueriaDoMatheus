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

        Hamburguer hamburger = director.construct();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            exibirMenu();
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Você selecionou o Hambúrguer de Frango");
                    System.out.println("Pão: " + hamburger.getPao());
                    System.out.println("Frango: " + hamburger.getFrango());
                    System.out.println("Ingredientes: " + hamburger.getIngredientes());
                    System.out.println("Queijo: " + hamburger.isQueijo());
                    System.out.println("Alface: " + hamburger.isAlface());
                    System.out.println("Tomate: " + hamburger.isTomate());
                    break;
                case 2:
                    System.out.println("Você selecionou o Hambúrguer de Carne");

                    System.out.println("Pão: " + hamburger.getPao());
                    System.out.println("Carne: " + hamburger.getCarne());
                    System.out.println("Ingredientes: " + hamburger.getIngredientes());
                    System.out.println("Queijo: " + hamburger.isQueijo());
                    System.out.println("Alface: " + hamburger.isAlface());
                    System.out.println("Tomate: " + hamburger.isTomate());
                    break;
                case 3:
                    System.out.println("Você selecionou o Hambúrguer de Frango e catupiry");
                    System.out.println("Pão: " + hamburger.getPao());
                    System.out.println("Frango: " + hamburger.getFrango());
                    System.out.println("Ingredientes: " + hamburger.getIngredientes());
                    System.out.println("Queijo: " + hamburger.isQueijo());
                    System.out.println("Alface: " + hamburger.isAlface());
                    System.out.println("Tomate: " + hamburger.isTomate());
                    System.out.println("Catupiry: " + hamburger.isCatupiry());
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
