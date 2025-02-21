import java.util.Scanner;

public class RestauranteApp {
    public static void main(String[] args) {
        String[] menuComidas = {
            "Hambúrguer", "Pizza", "Lasanha", "Sushi", "Taco", 
            "Macarrão", "Frango Assado", "Salada Caesar", "Bife", "Peixe Grelhado",
            "Risoto", "Strogonoff", "Feijoada", "Churrasco", "Pasta Alfredo",
            "Burrito", "Falafel", "Paella", "Carne de Panela", "Panqueca",
            "Cuscuz", "Escondidinho", "Yakissoba", "Ravioli", "Quiche"
        };

        double[] precosComidas = {
            15.00, 20.00, 18.00, 25.00, 12.00,
            14.00, 16.00, 13.00, 22.00, 19.00,
            17.00, 18.50, 20.50, 25.00, 16.50,
            14.50, 12.50, 22.00, 17.50, 10.00,
            11.00, 13.50, 15.50, 18.00, 14.00
        };

        String[] menuBebidas = {
            "Água", "Refrigerante", "Suco de Laranja", "Suco de Uva", "Chá Gelado",
            "Cerveja", "Vinho Tinto", "Vinho Branco", "Milkshake", "Café",
            "Capuccino", "Chá Verde", "Energético", "Licor", "Whisky",
            "Caipirinha", "Coquetel Mojito", "Smoothie", "Leite", "Chocolate Quente",
            "Água de Coco", "Refrigerante Diet", "Suco Natural", "Cerveja Artesanal", "Espumante"
        };

        double[] precosBebidas = {
            2.00, 5.00, 6.00, 6.00, 4.00,
            8.00, 25.00, 24.00, 10.00, 3.00,
            5.00, 4.00, 7.00, 12.00, 30.00,
            10.00, 12.00, 8.00, 3.00, 7.00,
            5.00, 6.00, 7.00, 12.00, 20.00
        };

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo ao Restaurante App!");
        System.out.println("\nMenu de Comidas:");
        for (int i = 0; i < menuComidas.length; i++) {
            System.out.printf("%d. %s - R$ %.2f\n", (i + 1), menuComidas[i], precosComidas[i]);
        }

        System.out.print("\nEscolha o número da comida desejada: ");
        int escolhaComida = scanner.nextInt();
        while (escolhaComida < 1 || escolhaComida > menuComidas.length) {
            System.out.print("Opção inválida! Por favor, escolha um número válido: ");
            escolhaComida = scanner.nextInt();
        }
        String comidaEscolhida = menuComidas[escolhaComida - 1];
        double precoComida = precosComidas[escolhaComida - 1];

        System.out.println("\nMenu de Bebidas:");
        for (int i = 0; i < menuBebidas.length; i++) {
            System.out.printf("%d. %s - R$ %.2f\n", (i + 1), menuBebidas[i], precosBebidas[i]);
        }

        System.out.print("\nEscolha o número da bebida desejada: ");
        int escolhaBebida = scanner.nextInt();
        while (escolhaBebida < 1 || escolhaBebida > menuBebidas.length) {
            System.out.print("Opção inválida! Por favor, escolha um número válido: ");
            escolhaBebida = scanner.nextInt();
        }
        String bebidaEscolhida = menuBebidas[escolhaBebida - 1];
        double precoBebida = precosBebidas[escolhaBebida - 1];

        double total = precoComida + precoBebida;

        System.out.println("\nResumo do Pedido:");
        System.out.printf("Comida: %s - R$ %.2f\n", comidaEscolhida, precoComida);
        System.out.printf("Bebida: %s - R$ %.2f\n", bebidaEscolhida, precoBebida);
        System.out.printf("Total: R$ %.2f\n", total);

        System.out.println("\nObrigado por usar o Restaurante App! Volte sempre!");

        scanner.close();
    }
}