import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculadora {
    private JPanel panelMain;


    private JTextField txtPrimeiroValor;

    private JTextField txtSegundoValor;

    private JButton btnSomar;

    private JTextField txtResultado;

    private JButton btnLimpar;
    private JPanel getPanelMain;

    public calculadora(){
        btnSomar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Integer primeiro = Integer.valueOf(txtPrimeiroValor.getText());
                Integer segundo = Integer.valueOf(txtSegundoValor.getText());

                //processo
                Integer soma = primeiro + segundo;

                //Mandei para tela o resutado
                txtResultado.setText(soma.toString());



            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new calculadora().getPanelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
