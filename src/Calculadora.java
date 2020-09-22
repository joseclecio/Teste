import javax.swing.*;
import java.awt.*;

public class Calculadora extends JFrame {

    private JButton [] b0p = new JButton[4]; //botão de operações da calculadora
    private JButton [] b = new JButton[10]; //botão dos dígitos
    private JButton bponto, bresult, blimpa, bexit; //botão de saída
    private JTextField tela; //tela da calculadora

    CalculadoraGerenciamento gerencia = new CalculadoraGerenciamento();

    public Calculadora(){ //construtor
        inicializar();
        eventos();
    }

    public void inicializar(){

        setTitle("Calculadora");
        setBounds(200,200,300,400);
        setBackground(new Color(150,150,150));

        // Adicionando os botões dos dígitos da calculadora
        b[0] = new JButton("0");
        b[0].setBounds(50,250,50,25);
        add(b[0]);

    }

    public void eventos(){

    }


}
