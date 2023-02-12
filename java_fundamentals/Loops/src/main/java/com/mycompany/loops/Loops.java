/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.loops;

/**
 *
 * @author Sean
 */
public class Loops {

    public static void main(String[] args) {
        
//        While loop
        int someValue = 4;
        int factorial = 1;
        
        while(someValue >1){
            factorial *= someValue;
            someValue--;
            
        }
        System.out.println(factorial);

        
        // do while
        int iVal = 80;
        
        do{
            System.out.println(iVal);
            System.out.println("* 2 = ");
            iVal *= 2;
            System.out.println(iVal);
        }
        while(iVal < 25);
        
        
        
        //for loops
        System.out.println("\n\n");
        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }
    }
}
