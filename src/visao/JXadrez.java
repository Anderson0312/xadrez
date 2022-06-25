package visao;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controle.ControlaTempo;
import modelo.EnumCor;
import modelo.Tabuleiro;

public class JXadrez extends JFrame {

    private static JLabel lbVez;

    private Tabuleiro tabuleiro;
    private JTabuleiro jTabuleiro;
    public static JPanel painelCemiterio = new JPanel();
    private JButton btReiniciarJogo;

    public JXadrez (){
        setTitle("Jogo de Xadrez");
        this.setLayout(new BorderLayout());

        this.tabuleiro = new Tabuleiro();
        this.jTabuleiro = new JTabuleiro(tabuleiro);
        this.add(new JTabuleiro(tabuleiro), BorderLayout.CENTER);


        JPanel pnTop = new JPanel();
        lbVez = new JLabel("VEZ DE: BRANCO");
        pnTop.add(lbVez);
        this.add(pnTop, BorderLayout.NORTH);


        final JPanel pnLateral = new JPanel();
        pnLateral.setLayout(new GridLayout(10, 1));


        btReiniciarJogo = new JButton("Reiniciar Jogo");
        pnLateral.add(btReiniciarJogo);

        btReiniciarJogo.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent ev) {
                reiniciaJogo();
            }
        });
        this.add(pnLateral, BorderLayout.WEST);

        //painelCemiterio.setLayout(new FlowLayout());
        this.add(painelCemiterio, BorderLayout.SOUTH);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // final ControlaTempo controleTempo = new ControlaTempo(jTabuleiro); 
        // Thread threadTempo = new Thread(controleTempo);
        // threadTempo.start();

        this.pack();
        this.setVisible(true);
    }

    private void reiniciaJogo() {
        this.tabuleiro = new Tabuleiro();
        this.jTabuleiro.setTabuleiro(this.tabuleiro);
        this.jTabuleiro.desenhaTabuleiro();
        setVez(tabuleiro.getVez());
        
    }

    public static void setVez(EnumCor corVez) {
        lbVez.setText("VEZ DE: " + corVez);
    }

    public static void main(String args[]) {
        new JXadrez();
    }

}
