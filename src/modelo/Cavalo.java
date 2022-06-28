package modelo;

public class Cavalo extends Peca {

    public Cavalo (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/47127512021.1/Documents/GitHub/xadrez/src/figs/CAVALO"+cor+".png");
    }


    public Cavalo(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        int dv = Math.abs(linhaDestino - getLinha());
        int dh = Math.abs(colunaDestino - getColuna());
        if ((dv == 1 && dh == 2 ) || (dv == 2 && dh == 1)){
            return true;
        }
        return false;
    }
    
}
