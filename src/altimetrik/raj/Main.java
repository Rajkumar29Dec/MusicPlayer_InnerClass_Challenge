package altimetrik.raj;

import java.util.Scanner;

public class Main {

    private static Scanner  scanner=new Scanner(System.in);
    public static void main(String[] args) {
        int choice=0;
        Calculator calculator=new Calculator(52,85);
        boolean PoweredOrNot=calculator.checkisPowerOn();
        if (!PoweredOrNot){
            System.out.println("0 : ADD"+
                    "1 : SUB"+
                    "2 : MULTIPLY"+
                    "3 : DIVIDE");
            System.out.println("Enter Choice..");
            choice=scanner.nextInt();
            switch (choice){
                case 0:
                    calculator.calculatorWorking.add(52,85);
                    break;
                case 1:
                    calculator.calculatorWorking.sub(45,45);
                    break;
                case 2:
                    calculator.calculatorWorking.Prod(10,2);
                    break;
                case 3:
                    calculator.calculatorWorking.div(45,0);
                    break;
            }

        }







//        Albums albums=new Albums("ARR");
//        System.out.println("Altimetrik Music Player");
//        System.out.println("=========================");
//        System.out.println("Enter Choice");
//        System.out.println("0 : Display Choice"+
//                "1 : Display Albums"+
//                "2 : Play Songs"+
//                "3 : Play Next Song"+
//                "4 : Play Previous Song");
//        int choice=0;
//        switch (choice){
//            case 0:
//                System.out.println("Choices are");
//                System.out.println("0 : Display Choice"+
//                        "1 : Display Albums"+
//                        "2 : Play Songs"+
//                        "3 : Play Next Song"+
//                        "4 : Play Previous Song");
//                break;
//            case 1:
//
//        }


    }
}
