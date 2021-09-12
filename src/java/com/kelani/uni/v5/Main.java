package com.kelani.uni.v5;

import com.kelani.uni.v5.input.CommandLineInputs;
import com.kelani.uni.v5.input.Inputs;
import com.kelani.uni.v5.operation.Operation;
import com.kelani.uni.v5.operation.OperationFactory;
import com.kelani.uni.v5.repository.FileNumberRepository;
import com.kelani.uni.v5.repository.NumberRepository;
import com.kelani.uni.v5.ui.CmdLineUI;
import com.kelani.uni.v5.ui.UI;

import java.io.IOException;

public class Main {
  //Dependancy Inversion Principle
    public static void main(String[] args) throws IOException {//Kinda wrong

        //Main class is coordinator

        Inputs inputs = new CommandLineInputs(args);
        NumberRepository numberRepository = new FileNumberRepository();
        OperationFactory operationfactory= new OperationFactory();
        UI ui=new CmdLineUI();

        CalculatorApp app=new CalculatorApp(inputs, numberRepository, operationfactory, ui);
        app.execute();
    }

}
