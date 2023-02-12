/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arrays;

/**
 *
 * @author Sean
 */
public class Arrays {

    public static void main(String[] args) {
        float[] theVals = {10.0f,20.0f,15.0f};
        
        float sum = 0.0f;
        
        
        for (int i = 0; i < theVals.length; i++) {
            sum += theVals[i];
            System.out.println("Current Total: " + sum);
        }
        System.out.println("\n\n\n Ending Total: "+sum);
        
    }
}
