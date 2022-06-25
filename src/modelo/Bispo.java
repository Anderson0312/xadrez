package modelo;

public class Bispo extends Peca {

    public Bispo (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/AndersoNMN/OneDrive/Documentos/GitHub/xadrez/src/figs/BISPO"+cor+".png");
    }


    public Bispo(EnumCor cor, int linha, int coluna, String image) {
        super(cor, linha, coluna, image);
        
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) {
        
        return true;
    }
    
}
