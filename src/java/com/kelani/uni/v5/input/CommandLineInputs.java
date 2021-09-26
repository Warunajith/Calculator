package com.kelani.uni.v5.input;

public class CommandLineInputs implements Inputs{

    private final String[] args;

    public CommandLineInputs(String[] arguments) {
        this.args = arguments;

    }

    public String getOperator() throws InvalidInvaliException {

        //Validate the arguments before using
        if (args.length == 0) {

            throw new InvalidInvaliException("Please provide the operation as an argument");
        }
        //Another Validation that we could do to these args
        //add,sub,mul
        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") ||operator.equals("div"))) {
            throw new InvalidInvaliException("Please provide the operation as an argument");
        }
        return operator;
    }
}
