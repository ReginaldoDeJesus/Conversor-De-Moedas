public class Conversor {

    private double valor;
    private String converterDe;
    private String converterPara;


    public Conversor(String converterDe, String converterPara, double valor){
        this.converterDe = converterDe;
        this.converterPara = converterPara;
        this.valor = valor;
    }

    public void mostraConversao() {
        System.out.println();
    }
}
