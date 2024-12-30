package domain.Conversores;

import domain.BuscadorDeCotacoes;
import domain.Cotacao;

public class ConversorDolarRealBrasileiro extends Conversor {
    public ConversorDolarRealBrasileiro(String converterDe, String converterPara, double valor) {
        super(converterDe,converterPara,valor);
    }

    @Override
    public double converter() {
        BuscadorDeCotacoes buscador = new BuscadorDeCotacoes();
        Cotacao cotacao = buscador.bucarCotacoes();
        if(this.getConverterDe().equalsIgnoreCase("USD")) {
            return cotacao.conversion_rates().BRL() * this.getValor();
        }
        return  this.getValor()/cotacao.conversion_rates().BRL();
    }
}
