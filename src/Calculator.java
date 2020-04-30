import java.util.Scanner;

public class Calculator {

    public static void main(String[] args){
        //Init variable to handle menu options
        int options = 0;
        Scanner sc;

        do {
            //Printing out Menu Options
            System.out.println("\n");
            System.out.println("MY FIRST JAVA CALCULATOR");
            System.out.println("*** **MY FIRST JAVA CALCULATOR** ***");

            System.out.println("1. Sum");
            System.out.println("2. Rest");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("6. Out");
            System.out.print("Enter one of the given options: ");

            sc = new Scanner(System.in);
            options = Integer.parseInt(sc.nextLine());

            if (options < 0 || options > 4){
                System.out.println("Invalid!");
            }else if (options != 0){
                System.out.println("\n");
                ///The two values we use to do the operation
                float operator1, operator2;
                ///First value
                System.out.print("Enter first value: ");
                operator1 = Float.parseFloat(sc.nextLine());

                System.out.print("Enter second value: ");
                operator2 = Float.parseFloat(sc.nextLine());

                switch (options){
                    case 1: //Sum
                         System.out.println("The result is: " + (operator1 + operator2));
                         break;
                    case 2: //Sum
                        System.out.println("The result is: " + (operator1 - operator2));
                        break;
                    case 3: //Sum
                        System.out.println("The result is: " + (operator1 * operator2));
                        break;
                    case 4: //Sum
                        System.out.println("The result is: " + (operator1 / operator2));
                        break;
                }
            }
        } while (options != 0);

        sc.close();

        System.out.println("CALCULATOR JUST FINISHED ***");
    }
}
