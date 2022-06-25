package visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

public class JCelula extends JPanel {
    
    private JPeca JPeca;
    private int linha, coluna;

    public JCelula (int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;

    }

    public JCelula (JPeca JPeca) {
        this.JPeca = JPeca;
        this.linha = JPeca.getPeca().getLinha();
        this.coluna = JPeca.getPeca().getColuna();
        this.add(JPeca);
        if ((this.JPeca.getPeca() != null) && JPeca.getPeca().isSelecionada()){
            this.setBorder(BorderFactory.createLineBorder(Color.RED, 5));
        }
    }

    public JPeca getJpeca() {
        return JPeca;
    }

    public void setJpeca(JPeca JPeca) {
        this.JPeca = JPeca;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }

}
