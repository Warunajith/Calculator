package com.kelani.uni.v5.operation;

import java.sql.SQLOutput;

public class DivOperation implements Operation {

    public Double execute(Double[] numbers) throws InvalidCalOperationExeption {

        if(numbers[1]==0){
            throw new InvalidCalOperationExeption("Do not divide by zero");
        }
        return numbers[0] / numbers[1];


    }


}
