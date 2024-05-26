/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bodymassindex;
import javax.swing.JOptionPane;
/*
This is a program that calculates and displays a person’s body mass index (BMI). The BMI is 
often used to determine whether a person with a sedentary lifestyle is overweight or under
weight for his or her height. A person’s BMI is calculated with the following formula:
 BMI = 5 Weight 3 703 / Height2
where weight is measured in pounds and height is measured in inches. 
The program displays a message indicating whether the person has optimal weight, is underweight, or is 
overweight. A sedentary person’s weight is considered optimal if his or her BMI is between 
18.5 and 25. If the BMI is less than 18.5, the person is considered underweight. If the BMI 
value is greater than 25, the person is considered overweight.
 */
public class BodyMassIndex {

    public static void main(String[] args) {
        double height;
        double weight;
        double BMI; //Body Mass Index
        String input;
        
        input = JOptionPane.showInputDialog("Enter your weight in pounds");
        weight = Double.parseDouble(input);
        
        input = JOptionPane.showInputDialog("Enter your height in inches");
        height = Double.parseDouble(input);
        
        BMI = weight * 703/(height*height);
        
        if(BMI > 25)
        {
            JOptionPane.showMessageDialog(null, "Based on your BMI you are overweight");
        }
        
        else if(BMI < 18.5)
        {
            JOptionPane.showMessageDialog(null, "Based on your BMI you are underweight");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "Based on your BMI your weight is optimal");
        }
    
    
    }
}
