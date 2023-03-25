import java.lang.reflect.Array;
import java.util.Scanner;

public class ClassTopper {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Registration Number : ");

        String registrationNumber = scan.nextLine();

        int sumOfOddDigits = 0;
        int sumOfEvenDigits = 0;


        char[] numberArray = registrationNumber.toCharArray();

        for(int iterator = 0 ; iterator < numberArray.length ; iterator++){
            if(numberArray[iterator] % 2 == 0){
                sumOfEvenDigits = sumOfEvenDigits + Character.getNumericValue(numberArray[iterator]);
            }
            else{
                sumOfOddDigits = sumOfOddDigits + Character.getNumericValue(numberArray[iterator]);
            }
        }

        if(sumOfEvenDigits == sumOfOddDigits){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

        }

}