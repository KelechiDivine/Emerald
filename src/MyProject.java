import java.util.Scanner;

public class MyProject {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


//
//        if (number1 < number2) {
//            System.out.print("The smallest number is:");
//
//        }
//        if (number1 > number2){
//            System.out.println(number2);
//        }
//        if (number2 > number3) {
//            System.out.println(number3);
//
//        }
//        if (number2 < number3){
//            System.out.println(number2);
//
//        }
//
//        if (number4 < number5) {
//            System.out.println(number4);
//
//        }
//        if (number4 > number5){
//            System.out.println(number5);
//
//        }
//        if (number5 > number1) {
//            System.out.println(number1);
//        if (number3 < number1){
//            System.out.println(3);
//        }

        int maximumNumber;
        int comparedNumber ;

        System.out.println("Enter first number:");
        maximumNumber = sc.nextInt();

        System.out.println("Enter second number: ");
        comparedNumber= sc.nextInt();

        if(comparedNumber < maximumNumber){
            maximumNumber= comparedNumber;
        }

        System.out.println("Enter third number: ");
        comparedNumber = sc.nextInt();

        if(comparedNumber < maximumNumber){
            maximumNumber = comparedNumber;
        }

        System.out.println("Enter fourth number: ");
        comparedNumber = sc.nextInt();

        if(comparedNumber > maximumNumber)

        System.out.println("Enter fifth number: ");
        comparedNumber = sc.nextInt();

        if(comparedNumber > maximumNumber){
            maximumNumber = comparedNumber;
        }
        System.out.println(maximumNumber);

    }

}