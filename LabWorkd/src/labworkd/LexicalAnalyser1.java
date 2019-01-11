package labworkd;

import java.util.ArrayList;
import java.util.Scanner;

public class LexicalAnalyser1 {

    public static void main(String[] args) {

        ArrayList<String> keyWord = new ArrayList<>();
        ArrayList<String> identifier = new ArrayList<>();
        ArrayList<String> mathOperator = new ArrayList<>();
        ArrayList<String> logicalOperator = new ArrayList<>();
        ArrayList<String> numericalValue = new ArrayList<>();
        ArrayList<String> other = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the line number: ");
        String[] input = new String[s.nextInt()];  //no of lines -- formating an array
        s.nextLine();

        String strArr = "";

        System.out.println("Enter your program");
        for (int i = 0; i < input.length; i++) {
            input[i] = s.nextLine();
            strArr = strArr + input[i];
        }

        String output[] = strArr.split(" ");
        int count = 0;

        int id=0, token=0;
        for (int i = 0; i < output.length; i++) {
            //System.out.println(output[i]);

            if (null != output[i]) {

                switch (output[i]) {
                    case "String":
                    case "int":
                    case "float":
                    case "double":
                    case "long":
                    case "char":
                    case "if":
                    case "else":
                    case "continue":
                    case "break":
                    case "for":
                    case "while":
                    case "return":
                    case "switch":
                    case "case":
                    case "void":
                    case "default":
                    case "do":
//                        keyWord.add(output[i]);
                        token++;
                        System.out.println("Key :" + output[i]);
                        break;

//                    case "a":
//                    case "b":
//                    case "c":
//                    case "d":
//                    case "e":
////                        identifier.add(output[i]);
//                        token++;
//                        System.out.println("iden :" + output[i]);
//                        break;

                    case "+":
                    case "-":
                    case "*":
                    case "/":
                    case "=":
                    case "%":
//                        mathOperator.add(output[i]);
                        token++;
                        System.out.println("oper :" + output[i]);
                        break;

//                    case "<":
//                    case ">":
//                    case "<=":
//                    case ">=":
//                    case "==":
//                    case "!=":
//                    case "!":
////                        logicalOperator.add(output[i]);
//                        token++;
//                        System.out.println("logic :" + output[i]);
//                        break;

                    case "1":
                    case "2":
                    case "3":
                    case "4":
                    case "5":
                    case "6":
                    case "7":
                    case "8":
                    case "9":
                    case "0":
//                        numericalValue.add(output[i]);
                        token++;
                        System.out.println("num :" + output[i]);
                        break;

                    case "(":
                    case ")":
                    case "{":
                    case "}":
                    case "[":
                    case "]":
                    case ";":
                    case ",":
//                        if (count == 0) {
//                            other.add(output[i]);
//                            count++;
//                        } else if(count != 0) {
//                            for (String pt1 : other) {
//                                if (output[i] != pt1) {
//                                    other.add(output[i]);
//                                }
//                            }
//                        }
//                        other.add(output[i]);
                        token++;
                        System.out.println("other :" + output[i]);
                        break;

//                    default:
//                        System.out.println("Unknown");
//                        break;
                }
            }
        }

//        System.out.println("Keywords: " + keyWord);
//        System.out.println("Identifiers:​ " + identifier);
//        System.out.println("Math Operators: " + mathOperator);
//        System.out.println("Logical Operators: " + logicalOperator);
//        System.out.println("Numerical Values: " + numericalValue);
//        System.out.println("Others: " + other);
    }
}
