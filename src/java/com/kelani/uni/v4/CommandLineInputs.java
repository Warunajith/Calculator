package com.kelani.uni.v4;

public class CommandLineInputs {

    private final String[] args;

    public CommandLineInputs(String[] arguments) {
        this.args = arguments;

    }

    public String getOperator() {

        //Validate the arguments before using
        if (args.length == 0) {
            System.out.println("Please provide the operation as the argument");
            return "";
        }
        //Another Validation that we could do to these args
        //add,sub,mul
        String operator = args[0];

        if (!(operator.equals("add") || operator.equals("sub") || operator.equals("mul") ||operator.equals("div"))) {
            System.out.println("Please provide the add, sub or mul as the operator argument.");
            return "";
        }
        return operator;
    }
}
