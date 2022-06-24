package modelo;

public class Rei extends Peca {

    public Rei(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        return true;
    }
    
}
