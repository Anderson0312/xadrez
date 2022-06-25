package visao;

import javax.swing.JPanel;

import java.awt.event.MouseListener;


import modelo.Peca;
import modelo.Tabuleiro;

import java.awt.Color;
import java.awt.GridLayout;

public class JTabuleiro extends JPanel implements MouseListener {

    private Tabuleiro tabuleiro;
    
    public JTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
        this.desenhaTabuleiro();

    }

    public void desenhaTabuleiro() {
        JXadrez.painelCemiterio.removeAll();
        this.removeAll();
        this.setLayout(new GridLayout(8,8));
        for(int i = 0; i < 8; i++) {
            for(int j = 0; j < 8; j++) {
                JCelula JCelula;
                Peca peca = this.tabuleiro.getPeca(i, j);
                if (peca == null) {
                    JCelula = new JCelula(i, j);
                } else {
                    JCelula = new JCelula(new JPeca(peca));
                }
                if (( i + j) % 2 == 0) {
                    JCelula.setBackground(Color.WHITE);
                } else {
                    JCelula.setBackground(Color.BLACK);
                }
                this.add(JCelula);
                JCelula.addMouseListener(this);
            }
        }
        for(Peca pecaRemovidPeca : this.tabuleiro.getPecasForaDeJogo()) {
            JXadrez.painelCemiterio.add(new JPeca(pecaRemovidPeca));
        }
        
        this.revalidate();
    }

    public Tabuleiro getTabuleiro() {
        return this.tabuleiro;
    }

    public void setTabuleiro(Tabuleiro tabuleiro) {
        this.tabuleiro = tabuleiro;
    }


    @Override
    public void mouseClicked(java.awt.event.MouseEvent e) {
        JCelula JCelula = (JCelula) e.getSource();
        this.tabuleiro.realizaJogada(JCelula.getLinha(), JCelula.getColuna());
        this.desenhaTabuleiro();
    }

    @Override
    public void mousePressed(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseReleased(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseEntered(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void mouseExited(java.awt.event.MouseEvent e) {
        // TODO Auto-generated method stub
        
    }

}
