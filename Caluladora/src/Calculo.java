import java.sql.SQLOutput;

public class Calculo {
    private float num1;
    private float num2;
    private float resultado;
    private String operacao;

//    public Calculo (float num1, float num2, String operacao){
//        this.num1 = num1;
//        this.num2 = num2;
//        this.operacao= operacao;
//
//    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public String getOperacao(){
        return operacao;
    }

    public void setNum1(float num){

    }

    public void setNum2(float num){
        this.num2 = num2;

    }
    public void setOperacao(String operacao ){
        this.operacao = operacao;

    }


    public float Calcular(float a, float b, String d){
        a = num1;
        b = num2;
        d = operacao;
        resultado = 0;
        if (operacao == "+"){
            resultado = num1+num2;
        } else if (operacao == "-") {
            resultado = num1-num2;
        } else if (operacao == "*") {
            resultado = num1*num2;
        } else if (operacao == "/") {
            if (num2 == 0){
                System.out.println("nao é possível dividir por 0");
            }
            else {resultado =num1/num2;}
        }
        else {
            System.out.println("Digite uma operação válida");
        }
        return resultado;
    }


}
