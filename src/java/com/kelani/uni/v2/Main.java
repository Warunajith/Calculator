package com.kelani.uni.v2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {//Kinda wrong
        //Validate the arguments before using
        if (args.length == 0) {
            System.out.println("Please provide the operation as the argument");
            return;
        }
        //Another Validation that we could do to these args
        //add,sub,mul
        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul"))) {
            System.out.println("Please provide the add, sub or mul as the operator argument.");
            return;
        }

        //read the number text file
        List<String> numbersStrs = Files.readAllLines(
                Paths.get("D:\\Software construction\\Calculator\\numbers.txt")
        );

        double number1 = Double.parseDouble(numbersStrs.get(0));
        double number2 = Double.parseDouble(numbersStrs.get(1));
        double result = 0;

        if (operator.equals("add")) {
            result = number1 + number2;
        } else if (operator.equals("sub")) {
            result = number1 - number2;
        } else if (operator.equals("mul")) {
            result = number1 * number2;
        }
        System.out.println("The rusult is " + result);
    }

}
