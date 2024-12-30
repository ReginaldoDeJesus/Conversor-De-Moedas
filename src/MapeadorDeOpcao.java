public class MapeadorDeOpcao {
    private int opcao;
    private String converterDe;
    private String converterPara;

    public MapeadorDeOpcao(int opcao){
        this.opcao = opcao;
    }

    public static boolean opcaoValida(int opcao) {
        if(opcao ==1 | opcao==2 | opcao==3 | opcao==4 |opcao==5 |opcao==6){
            return true;
        }
        return false;
    }


    public String getConverterDe() {
        return converterDe;
    }

    public void setConverterDe(String converterDe) {
        this.converterDe = converterDe;
    }

    public String getConverterPara() {
        return converterPara;
    }

    public void setConverterPara(String converterPara) {
        this.converterPara = converterPara;
    }
}
