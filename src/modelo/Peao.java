package modelo;

public class Peao extends Peca {

    private boolean primeiroMovimento = true; 



    public Peao (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/AndersoNMN/OneDrive/Documentos/GitHub/xadrez/src/figs/PEAO"+cor+".png");
    }


    public Peao(EnumCor cor, int linha, int coluna, String image) { //contutor para setar os atributos de (PEÇA)
        super(cor, linha, coluna, image);
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) { // Valida o movimento da (PEÇA) È obrigado ter esse metodo na classe, pois é fixo da (PEÇA)      
        Peca pecaDestino = getTabuleiro().getPeca(linhaDestino, colunaDestino);
        if (pecaDestino == null && colunaDestino != getColuna()) {
            return false; //não pode mover para os lados
        }
        return true;
    }

    public void setPrimeiroMovimento(boolean primeiroMovimento) {
        this.primeiroMovimento = primeiroMovimento;
    }

    
}
