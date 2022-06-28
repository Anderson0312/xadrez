package modelo;

public class Peao extends Peca {

    private boolean primeiroMovimento = true; 



    public Peao (EnumCor cor, int linha, int coluna) {
        super(cor, linha, coluna, "C:/Users/47127512021.1/Documents/GitHub/xadrez/src/figs/PEAO"+cor+".png");
    }


    public Peao(EnumCor cor, int linha, int coluna, String image) { //contutor para setar os atributos de (PEÇA)
        super(cor, linha, coluna, image);
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) { // Valida o movimento da (PEÇA) È obrigado ter esse metodo na classe, pois é fixo da (PEÇA)      
        int dv = Math.abs(linhaDestino - getLinha());
        int dh = Math.abs(colunaDestino - getColuna()); 
        Peca pecaDestino = getTabuleiro().getPeca(linhaDestino, colunaDestino);
        if (pecaDestino == null && colunaDestino != getColuna()){
            return false; //não pode mover para os lados
        }   
        if (((getLinha() - linhaDestino) == 1) && (dh == 0)) {
            return true;
        }
        return true;

    }

    public void setPrimeiroMovimento(boolean primeiroMovimento) {
        
        this.primeiroMovimento = primeiroMovimento;
    }

    
}
