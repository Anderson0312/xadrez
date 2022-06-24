package modelo;

public class Tabuleiro {

    private Peca[][] pecas;
    private Peca pecaSelecionada = null;
    private EnumCor vez = EnumCor.BRANCO;

    public static final int TEMPO_JOGADA = 10000;

    public Tabuleiro(int linhas, int colunas) {
        this.pecas = new Peca[linhas][colunas];
    }

    public Peca getPeca(int linha, int colunas) {
        return this.pecas[linha][colunas];
    }

    public void adicionaPeca(Peca peca) {
        this.pecas[peca.getLinha()][peca.getColuna()] = peca;
        peca.setTabuleiro(this);
    }

    public void selecionaPeca(Peca peca) {
        if (peca.isSelecionada()) { // caso a peça esteva selecionada, ele desmarca
            peca.setSelecionada(false);
            this.pecaSelecionada = null;
        } else { // caso a peça não estar selecionada, ele marca a peça
            peca.setSelecionada(true);
            this.pecaSelecionada = peca;
        }
    }

    public void movePeca(Peca peca, int novaLinha, int novaColuna) {
        
    }

}
