package modelo;

public class Torre extends Peca {


    public Torre (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/AndersoNMN/OneDrive/Documentos/GitHub/xadrez/src/figs/TORRE"+cor+".png");
    }

    public Torre(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);      
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        int dv = linhaDestino - getLinha();
        int dh = colunaDestino - getColuna();
        if ( dv == 0 || dh == 0 ) {
            return true;
        }
        return false;
    }
    
}
