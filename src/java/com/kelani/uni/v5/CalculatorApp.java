package com.kelani.uni.v5;

import com.kelani.uni.v5.input.Inputs;
import com.kelani.uni.v5.input.InvalidInvaliException;
import com.kelani.uni.v5.operation.InvalidCalOperationExeption;
import com.kelani.uni.v5.operation.Operation;
import com.kelani.uni.v5.operation.OperationFactory;
import com.kelani.uni.v5.repository.NumberRepository;
import com.kelani.uni.v5.repository.NumberRepositoryException;
import com.kelani.uni.v5.ui.UI;
import java.io.IOException;

public class CalculatorApp {

    private final Inputs inputs;
    private final NumberRepository numberRepository;
    private final OperationFactory operationfactory;
    private final UI ui;

    public CalculatorApp(Inputs inputs, NumberRepository numberRepository, OperationFactory operationfactory, UI ui) {


        this.inputs = inputs;
        this.numberRepository = numberRepository;
        this.operationfactory = operationfactory;
        this.ui = ui;
    }

    public void execute()  {


        try {
            String operator = inputs.getOperator();
            Double[] numbers = numberRepository.getNumbers();
            Operation operation= operationfactory.getInstance(operator);
            Double result = operation.execute(numbers);
            ui.showMessege("The result is"+ result);


        } catch (InvalidInvaliException | NumberRepositoryException | InvalidCalOperationExeption e) {
            ui.showMessege("Error Occurred! "+ e.getMessage());

        }




    }
}
