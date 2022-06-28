package modelo;

public class Torre extends Peca {


    public Torre (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/47127512021.1/Documents/GitHub/xadrez/src/figs/TORRE"+cor+".png");
    }

    public Torre(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);      
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        int dv = Math.abs(linhaDestino - getLinha());
        int dh = Math.abs(colunaDestino - getColuna());

        if ( dv == 0 || dh == 0 ) {
            return true;
        }
        Peca pecaDestino = getTabuleiro().getPeca(linhaDestino, colunaDestino);
        for (int i = 0; getLinha() < linhaDestino; i++) {
            for (int j = 0; getColuna() < colunaDestino; j++) {
                if (null != pecaDestino && null != pecaDestino) {
                    return false;
                }
            }
        }


        return false;
    }
    
}
