import domain.Conversores.Conversor;
import domain.Conversores.ConversorDolarPesoArgentino;
import domain.Conversores.ConversorDolarPesoColombiano;
import domain.Conversores.ConversorDolarRealBrasileiro;
import domain.Cotacao;
import domain.Menu;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cotacao cotacao = null;
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);

        try {
            /** MENU **/
            Menu menu = new Menu();
            do {
                menu.mostrarMenu();
                opcao = Integer.parseInt(leitor.nextLine());
                if (opcao == 7) break;

                System.out.println("Digite o valor que deseja converter: ");
                double valor = Double.parseDouble(leitor.nextLine());

                Conversor conversor = null;
                switch (opcao) {
                    case 1:
                        conversor = new ConversorDolarPesoArgentino("USD", "ARS", valor);
                        break;
                    case 2:
                        conversor = new ConversorDolarPesoArgentino("ARS", "USD", valor);
                        break;
                    case 3:
                        conversor = new ConversorDolarRealBrasileiro("USD", "BRL", valor);
                        break;
                    case 4:
                        conversor = new ConversorDolarRealBrasileiro("BRL", "USD", valor);
                        break;
                    case 5:
                        conversor = new ConversorDolarPesoColombiano("USD", "COP", valor);
                        break;
                    case 6:
                        conversor = new ConversorDolarPesoColombiano("COP", "USD", valor);
                        break;
                    default:
                        System.out.println("Opção inválida!!");
                }

                conversor.mostraConversao();

            } while (opcao != 7);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
