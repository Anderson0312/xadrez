package modelo;

public class Cavalo extends Peca {

    public Cavalo (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/AndersoNMN/OneDrive/Documentos/GitHub/xadrez/src/figs/CAVALO"+cor+".png");
    }


    public Cavalo(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        int dv = linhaDestino - getLinha();
        int dh = colunaDestino - getColuna();
        if ((dv == 2 && dh == -1 ) || (dv == 2 && dh == 1) || (dv == -2 && dh == -1) || (dv == -2 && dh == 1)){
            return true;
        }
        return false;
    }
    
}
