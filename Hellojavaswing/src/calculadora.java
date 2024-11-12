import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

public class calculadora {
    private JPanel panelMain;

    private JTextField txtResultado;

    private JButton btnLimpar;
    private JPanel getPanelMain;
    private JButton btn01;
    private JButton btn02;
    private JButton btn03;
    private JButton btn04;
    private JButton btn05;
    private JButton btn06;
    private JButton btn07;
    private JButton btn08;
    private JButton btn09;
    private JButton btn0;
    private JTextField resultado;
    private JButton btnsubtracao;
    private JButton btndivisao;
    private JButton btnmultiplicacao;
    private JButton btnSomar;
    private JButton btnIgual;

    public calculadora(){
        btn01.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                resultado.setText(resultado.getText() + "1");



            }
        });
       // btn02.addActionListener(new ActionListener() {

      //  })
    }



    public static void main(String[] args) {
        JFrame frame = new JFrame("Minha Calculadora");
        frame.setContentPane(new calculadora().getPanelMain);
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
}
