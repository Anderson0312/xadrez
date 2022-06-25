package controle;

import java.lang.Runnable;

import javax.swing.JOptionPane;


import modelo.Tabuleiro;
import visao.JTabuleiro;

public class ControlaTempo implements Runnable {


    private JTabuleiro jTabuleiro;

    private int tempoGasto = 0;
    
    public ControlaTempo(JTabuleiro jTabuleiro) {
        super();
        this.jTabuleiro = jTabuleiro;
    }

    @Override
    public void run() {
        while (true) {
            
            try {
                Thread.sleep(1000);
                tempoGasto += 1000;
                if (tempoGasto >= Tabuleiro.TEMPO_JOGADA) {
                    JOptionPane.showMessageDialog(null,"O jogador " + jTabuleiro.getTabuleiro().getVez() + " Perdeu a vez");
                    
                    if (jTabuleiro.getTabuleiro().getPecaSelecionada() != null) {
                        jTabuleiro.getTabuleiro().getPecaSelecionada().setSelecionada(false);
                        jTabuleiro.getTabuleiro().setPecaSelecionada(null);  
                    }
                    jTabuleiro.getTabuleiro().inverteVez();
                    jTabuleiro.desenhaTabuleiro();
                    tempoGasto = 0;

                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }  
}
