package com.kelani.uni.v3;

import com.kelani.uni.v3.operation.AddOperation;
import com.kelani.uni.v3.operation.MulOperation;
import com.kelani.uni.v3.operation.SubOperation;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {//Kinda wrong

        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader filereader = new FileReader();
        Double[] numbers = filereader.getNumbers();


        double result = 0;

        if (operator.equals("add")) {

            AddOperation addoperation = new AddOperation();
            result = addoperation.execute(numbers);

        } else if (operator.equals("sub")) {

            SubOperation suboperation = new SubOperation();
            result = suboperation.execute(numbers);

        } else if (operator.equals("mul")) {

            MulOperation muloperation = new MulOperation();

            result = muloperation.execute(numbers);
        }
        System.out.println("The rusult is " + result);
    }

}
