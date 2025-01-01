import java.util.Scanner;











public class Calculator {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("This is an Calculator!!");
        System.out.println("DO as follows :- ");
        System.out.println("Addition = Type Add ");
        System.out.println("Subtraction = Type Sub");
        System.out.println("Divition = Type Div");
        System.out.println("Multiplication = Type Mul");
        String opi = x.next();
        String InOpi = "";
        if(opi.equals("Mul")) {
            InOpi = "Multiplication";
        } else if(opi.equals("Sub")) {
            InOpi = "Subtraction";
        } else if(opi.equals("Add")) {
            InOpi = "Addition";
        } else if(opi.equals("Div")) {
            InOpi = "Division";
        } else {
            System.out.println("This is a wrong input. Please try with the correct one.");
            return; 
        }
        System.out.printf("Ok So we are going with %s \n", InOpi);
        System.out.println("Please Enter Your First Number: ");
        int n1 = x.nextInt();
        System.out.println("Please Enter Your Second Number: ");
        int n2 = x.nextInt();
        if(opi.equals("Mul")){
            long result = (n1*n2);
            System.out.printf("Your Answer is: %d" , result);   
        }else if(opi.equals("Div")){
            int result = (n1/n2);
            System.out.printf("Your Answer is: %d" , result);   
        }else if(opi.equals("Add")){
            int result = (n1+n2);
            System.out.printf("Your Answer is: %d" , result);   
        }else if(opi.equals("Sub")){
            int result = (n1-n2);
            System.out.printf("Your Answer is: %d" , result);   
        }else{
            System.out.println("Invalid \n Please recheck");
        }       
 x.close();
    }
}
