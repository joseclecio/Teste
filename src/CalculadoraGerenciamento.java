public class CalculadoraGerenciamento {
    private float value, keep;
    private int toDo;


    public void CalculadoraGerenciamento(){ // construtor
        value = keep=0;
    }

    void Operacao(int op, String tela){ //operação da calculadora para exibir na tela
        keep = Float.parseFloat(tela);
        toDo = op;
    }

    float Display(String tela){
        value = Float.parseFloat(tela);
        switch(toDo){
            case 0: return keep+value;
            case 1: return keep-value;
            case 2: return keep*value;
            case 3: return keep/value;
        }
        return 0;
    }
}
