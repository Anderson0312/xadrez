package modelo;

public class Bispo extends Peca {

    public Bispo (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/47127512021.1/Documents/GitHub/xadrez/src/figs/BISPO"+cor+".png");
    }

    public Bispo(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        int dv = Math.abs(linhaDestino - getLinha());
        int dh = Math.abs(colunaDestino - getColuna());
        if (dv == dh || dh == dv) {
            return true;
        }
        return false;
    }
    
}
