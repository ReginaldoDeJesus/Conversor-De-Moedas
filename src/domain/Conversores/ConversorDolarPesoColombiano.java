package domain.Conversores;

import domain.BuscadorDeCotacoes;
import domain.Cotacao;

public class ConversorDolarPesoColombiano extends Conversor {
    public ConversorDolarPesoColombiano(String converterDe, String converterPara, double valor) {
        super(converterDe,converterPara,valor);
    }

    @Override
    public double converter() {
        BuscadorDeCotacoes buscador = new BuscadorDeCotacoes();
        Cotacao cotacao = buscador.bucarCotacoes();
        if(this.getConverterDe().equalsIgnoreCase("USD")) {
            return cotacao.conversion_rates().COP() * this.getValor();
        }
        return  this.getValor()/cotacao.conversion_rates().COP();
    }
}
