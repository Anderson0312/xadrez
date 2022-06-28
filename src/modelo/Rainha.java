package modelo;

public class Rainha extends Peca {

    public Rainha (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/47127512021.1/Documents/GitHub/xadrez/src/figs/RAINHA"+cor+".png");
    }


    public Rainha(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        int dv = Math.abs(linhaDestino - getLinha());
        int dh = Math.abs(colunaDestino - getColuna()); 
        if (( dv == dh) || ( dv == 0) || (dh == 0)) {
            return true;
        }
        return false;
    }
    
}
