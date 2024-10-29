import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainForm {
    private JPanel mainPanel;

    public mainForm(){
        btnValidar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nomeDigitado = txtNome.getText();
                txtNome.setText(nomeDigitado);
            }
        }
        );

    }

    private JTextField txtNome;
    private JButton btnValidar;
    private JLabel jtxtresultado;

    public static void main(String[] args) {
       //Cria a minha tela(TV)
        JFrame frame = new JFrame("Minha primeira tela ");
       //Mostra qual painel vai ser assistido
        frame.setContentPane(new mainForm().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //ajusta a tela no tamanho do meu painel
        frame.pack();
        frame.setSize(800, 500);
        //liga a tv
        frame.setVisible(true);



    }
}
