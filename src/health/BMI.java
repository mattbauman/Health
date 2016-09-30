/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package health;

/**
 *
 * @author Main
 */
public class BMI {
    public double weight;
    public double height;
    public double maxUnderweightBMI = 18.5;
    public double maxNormalBMI = 24.9;
    
    BMI( double weight, double height) {
        this.weight = weight;
        this.height = height;
    }
    
    public double getBMI() {
        double calc = (weight*703) / Math.pow(height,2);
        return calc;
    }
    
    public double getMaxUnderweightBMI () {
        double calc = (height*(height*maxUnderweightBMI)) / 703;
        return calc;
    }
    
    public double getMaxNormalBMI () {
        double calc = (height*(height*maxNormalBMI)) / 703;
        return calc;
    }
    
}
