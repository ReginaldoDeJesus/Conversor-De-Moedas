package domain.Conversores;

import domain.BuscadorDeCotacoes;
import domain.Cotacao;

public abstract class Conversor {

    private double valor;
    private double valorConvertido;
    private String converterDe;
    private String converterPara;


    public Conversor(String converterDe, String converterPara, double valor){
        this.converterDe = converterDe;
        this.converterPara = converterPara;
        this.valor = valor;
        this.valorConvertido = this.converter();
    }

    public abstract double converter();


    public void mostraConversao() {
        System.out.println(this.getValor()+" "+ this.getConverterDe()+" corresponde a "
                +this.getValorConvertido()+" "+ this.getConverterPara());
    }

    public double getValor() {
        return valor;
    }

    public String getConverterDe() {
        return converterDe;
    }

    public String getConverterPara() {
        return converterPara;
    }

    public double getValorConvertido() {
        return valorConvertido;
    }

}
