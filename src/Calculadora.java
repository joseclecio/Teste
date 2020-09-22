import javax.swing.*;

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

    }

    public void eventos(){

    }


}
