package health;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Health {

    public static void main(String[] args) {
        //Java Scanner class for taking input from user
        Scanner scanner = new Scanner(System.in);
        
        //Get weight from user
        System.out.print("Please enter your weight in pounds: ");
        double inputWeight = scanner.nextDouble();
        
        //Get height from user
        System.out.print("Please enter your height in inches: ");
        double inputHeight = scanner.nextDouble();
        
        //Create BMI object 'userBMI' using weight and height that was inputted
        BMI userBMI = new BMI(inputWeight,inputHeight);
        
        //Java DecimalFormat class to format the output to round to a tenth
        DecimalFormat df1 = new DecimalFormat("##.#");
        
        //Print results
        System.out.println("Your BMI is: " + df1.format(userBMI.getBMI()));
        System.out.println("Weight needed to have Max Underweight BMI ("+ userBMI.maxUnderweightBMI + ") is: " + df1.format(userBMI.getMaxUnderweightBMI()) + " lbs");
        System.out.println("Weight needed to have Max Normal weight BMI ("+ userBMI.maxNormalBMI + ") is: " + df1.format(userBMI.getMaxNormalBMI()) + " lbs");
        
    }
}
