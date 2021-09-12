package com.kelani.uni.v4;

import com.kelani.uni.v4.operation.*;

import java.io.IOException;
import java.sql.SQLOutput;

public class Main {
// Liskov Substitution Principle
    public static void main(String[] args) throws IOException {//Kinda wrong

        //Main class is coordinator
        CommandLineInputs inputs = new CommandLineInputs(args);
        String operator = inputs.getOperator();

        FileReader filereader = new FileReader();
        Double[] numbers = filereader.getNumbers();

        OperationFactory operationfactory= new OperationFactory();
        Operation operation= operationfactory.getInstance(operator);

        Double result=operation.execute(numbers);


        UI ui=new UI();
        ui.showMessege("The rusult is "+ result);
    }

}
