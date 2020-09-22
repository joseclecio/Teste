public class CalculadoraGerenciamento {
    private float value, keep;
    private int toDo;

    void CalculadoraGerenciamento(){ // construtor
        value = keep=0;
    }

    void Operacao(int op, String tela){
        keep = Float.parseFloat(tela);
        toDo = op;
    }
}
