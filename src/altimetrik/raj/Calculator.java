package altimetrik.raj;

public class Calculator {
    private int a,b;
    private boolean Poweron=false;

    public Calculator(int a, int b) {
        this.a = a;
        this.b = b;
    }
    CalculatorWorking calculatorWorking=new CalculatorWorking(a,b);

    public boolean checkisPowerOn(){
        if (Poweron){
            return true;
        }
        else{
            return false;
        }
    }

    public  class CalculatorWorking{
        int number1,number2;

        public CalculatorWorking(int number1, int number2) {
            this.number1 = number1;
            this.number2 = number2;
        }

        public void add(int number1,int number2){
            System.out.println("ADD :"+(number1+number2));
        }
        public void sub(int number1,int number2){
            System.out.println("SUB :"+(number1-number2));
        }
        public void Prod(int number1,int number2){
            System.out.println("MULTIPLY :"+(number1*number2));
        }
        public void div(int number1,int number2){
            if (number2==0)
                System.out.println("Error number2 Can't be Zero");
            else
            System.out.println("DIVIDE :"+(number1/number2));
        }

    }
}
