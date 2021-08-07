package com.kelani.uni;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Cal {

    public void add(int x,int y)
    {
        System.out.println(x + y);
    }
    public void sub(int x,int y)
    {
        System.out.println(x - y);
    }
    public void mul(int x,int y)
    {
        System.out.println(x * y);
    }
    public void div(int x,int y)
    {
        System.out.println((float)x / (float)y);
    }
    public static void main(String[] args) throws FileNotFoundException {


        File obj=new File("D:\\Software construction\\Calculator\\src\\java\\com\\kelani\\uni\\numbers.txt");
        Scanner scan=new Scanner(obj);
            int a=scan.nextInt();
            int b=scan.nextInt();
            scan.close();
          System.out.println("Enter the Operation");
          System.out.print("Addition=> 1 \nSubstraction=> 2 \nDivition=> 3\nMultification=> 4\n");

         Scanner sc=new Scanner(System.in);
         int c=sc.nextInt();
          Cal obj1=new Cal();

          if(c==1)
          {
                  obj1.add(a,b);
          }
          else if(c==2)
          {
                obj1.sub(a,b);
          }
          else if(c==3) {
                obj1.mul(a,b);
          }
          else if(c==4)
          {
                obj1.div(a,b);
          }
          else
          {
              System.out.println("Entered Number is not valid");
          }
    }

}
