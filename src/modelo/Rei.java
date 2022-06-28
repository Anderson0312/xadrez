package modelo;

public class Rei extends Peca {

    public Rei (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/47127512021.1/Documents/GitHub/xadrez/src/figs/REI"+cor+".png");
    }


    public Rei(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        int dv = Math.abs(linhaDestino - getLinha());
        int dh = Math.abs(colunaDestino - getColuna()); 
        if ((dv >= 0 && dv <=1 ) && (dh >= 0 && dh <=1)) {
            return true;
        }
        return false;
    }
    
}
