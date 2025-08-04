import java.util.Scanner;
public class Calculator {
    public static void main(String[] args)  {
     Scanner scanner=new Scanner(System.in);
     System.out.println("Enter First Number: ");
     double a=scanner.nextDouble();
     System.out.println("Enter Second Number: ");
     double b=scanner.nextDouble();
    
    while(true){
     
    System.out.println("Choose any number from 1-4 for calculation :");
    System.out.println("1. Addtion");
    System.out.println("2. Subtraction");
    System.out.println("3. Multiplication");
    System.out.println("4. Divison");
    System.out.println("5. Exit");
     
    int choice=scanner.nextInt();
   
     double result=0;
     switch(choice){
        case 1:
            result=addition(a,b);
            break;
        case 2:
            result=subtraction(a,b);
            break;
        case 3:
            result=multiplication(a, b);
            break;
        case 4:
            result=division(a,b);
            break;    
            
     }

      if(choice==5){
        System.out.println("Exiting Calculator");
        break;
       }

     System.out.println("Result: "+result);
     System.out.println();
     System.out.println();

    }
     scanner.close();
    }


    public static double addition(double a,double b){
        return a+b;
    }
    public static double subtraction(double a,double b){
        return a-b;
    }
    public static double multiplication(double a,double b){
        return a*b;
    }
    public static double division(double a,double b){
        if(b==0)
        {
            System.out.println("Error: Division by zero is not allowed");
             return 0;
        }
        else
        {
        return a/b;
        }
       
    }

}
