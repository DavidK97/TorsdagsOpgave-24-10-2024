package task1;

import static java.lang.Character.isUpperCase;

public class Flows {

    public void methodOne (String input){
        if (input.length() < 4) {
            System.out.println("j");
        }else{
            System.out.println("a");
        }
    }

    public void methodTwo (boolean isJavaFun){
        if (isJavaFun){
            System.out.println("a");
            isJavaFun = false;
        }
        if (isJavaFun == false){
            System.out.println("v");
            methodOne("hejsa");
        }
    }

    public void methodThree (int number){
        if (number % 2 == 0){
            System.out.println("e");
        }else{
            System.out.println("r");
        }
    }

    public void methodFour (String input){
        methodThree(input.length());
        if (input.length() < 5) {
            System.out.println("s");
        }
        methodOne(input);   //j
        System.out.println("o");

    }

    public void methodFive (String input){
        if (input.charAt(2) == 'v') {
            System.out.println("v");
        }
        if (isUpperCase(input.charAt(0))){
            System.out.println("t");
        }
    }
}
