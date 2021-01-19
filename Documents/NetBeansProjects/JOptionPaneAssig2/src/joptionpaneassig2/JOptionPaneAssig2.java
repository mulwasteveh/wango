/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package joptionpaneassig2;

import javax.swing.*;
public class JOptionPaneAssig2 {

  
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,"Enter a Quadratic equation inform of: (ax2+bx+c)");//This method creates and return a new parentless JDialog with the specified title “Enter a Quadratic equation inform of: ax2 + bx + c”.
         String a = JOptionPane.showInputDialog("Enter the value of a");
         double j = Integer.parseInt(a);//This method parses a String method argument a into an double object j
         String b = JOptionPane.showInputDialog("Enter the value of b");
          double k = Integer.parseInt(b);// parses a String method argument b into a double object k
         String c = JOptionPane.showInputDialog("Enter the value of c");
          double l = Integer.parseInt(c);// parses a String method argument c into a double object l
         
        double x1, x2;
        x1 = (-k + (Math.sqrt(Math.pow(k, 2)-4*j*l)))/2*j;// The positive root
        x2 = (-k - (Math.sqrt(Math.pow(k, 2)-4*j*l)))/2*j; // The negative root
        
        if(x1 == 0.0) {       
            Object[] root1 = null;//initialize root1 to be null
        JOptionPane.showMessageDialog(null, String.format("There is one root at: %.4f", root1), "Roots:", JOptionPane.INFORMATION_MESSAGE);//this pops up a JOptionPane that will show that there in no root to that quadratic equation.
                    }
                else {
            if(x1 > 0.0) {       

            JOptionPane.showMessageDialog(null, String.format("There are two real roots at: %.4f and %.4fnn", x1, x2), "Roots:", JOptionPane.INFORMATION_MESSAGE);

 
           
                if(x1 < 0.0) {    
                        JOptionPane.showMessageDialog(null, String.format("There are two imaginary roots at: %.4fi and %.4finn", x1, x2), "Roots:", JOptionPane.INFORMATION_MESSAGE);

                }
    
                

            
            }

        }

        System.exit(0);//The function allows a program to suspend its execution temporarily in order to run another program to completion.



        JOptionPane.showMessageDialog(null, "The roots are : \n" + "root1 : " + x1 + "\n" + "root2 :" + x2);
        
        
       
        
        
      
        
    }
    
}

