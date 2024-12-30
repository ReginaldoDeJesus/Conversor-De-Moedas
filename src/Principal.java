import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Cotacao cotacao = null;
        int opcao = 0;
        Scanner leitor = new Scanner(System.in);

        BuscadorDeCotacoes buscador = new BuscadorDeCotacoes();
        cotacao = buscador.bucarCotacoes();
        System.out.println(cotacao.conversion_rates().BRL());


        /** MENU **/
        Menu menu = new Menu();
        do{
            menu.mostrarMenu();
            opcao = Integer.parseInt(leitor.nextLine());
            if(opcao==7) break;

            MapeadorDeOpcao mapeadorDeOpcao = new MapeadorDeOpcao(opcao);

            if(MapeadorDeOpcao.opcaoValida(opcao)){
                String converterDe = mapeadorDeOpcao.getConverterDe();
                String converterPara = mapeadorDeOpcao.getConverterPara();

                System.out.println("Digite o valor que deseja converter: ");
                double valor = Double.parseDouble(leitor.nextLine());

                Conversor conversor = new Conversor(converterDe,converterPara,valor);
                conversor.mostraConversao();
            }

        }while(opcao!=7);
    }
}
