package com.kelani.uni.v2;

public class Main {

    public static void main(String[] args) {

        if(args.length==0)
        {
            System.out.println("Please provide the operation as the argument");
            return;
        }
        //System.out.println(args[0]);
        String operator=args[0];

        if(!(operator.equals("add")|| operator.equals("sub")|| operator.equals("mul")))
        {
            System.out.println("Please provide the add, sub or mul as the operator argument.");
            return;
        }

        System.out.println(args[0]);

    }

}
