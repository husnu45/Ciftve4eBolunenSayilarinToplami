import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner getNumber = new Scanner(System.in);

        int sum = 0;

        while(true){

            System.out.print("Please Enter a Number (Enter 0 for Exit Program) : ");

            int number =  getNumber.nextInt();

            if(number == 0){

                break;

            }

            if(number % 2 == 0 && number % 4 == 0){

                sum += number;

            }

        }

        System.out.println("Total of Entered Even Number and Numbers which multiple of 4 is : " + sum);



    }

}
