/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package nonzeronumber;

import java.util.Scanner;

/**
 *
 * @author erik.hernandez
 */
public class NonzeroNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double number;
        Scanner InDate=new Scanner(System.in);
        do{
            System.out.println("Enter number  greater than zero");
            number=InDate.nextInt();
            
        }while(number<=0);
        System.out.println("The number entered is : "+number);
        
    }
    
}
