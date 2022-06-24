package modelo;

public class Peao extends Peca {

    private boolean primeiroMovimento = true; 

    public Peao(EnumCor cor, int linha, int coluna, String image) { //contutor para setar os atributos de (PEÇA)
        super(cor, linha, coluna, image);
    }

    @Override
    public boolean validaMovimento(int linhaDestino, int colunaDestino) { // Valida o movimento da (PEÇA) È obrigado ter esse metodo na classe, pois é fixo da (PEÇA)      
        return true;
    }

    
    
}
