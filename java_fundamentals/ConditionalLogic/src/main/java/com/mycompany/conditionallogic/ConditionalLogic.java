/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conditionallogic;

/**
 *
 * @author Sean
 */
public class ConditionalLogic {

    public static void main(String[] args) {
        int value1 = 10;
        int value2 = 40;
        if (value1 > value2) {
            System.out.println("Value 1 is bigger");
        } else {
            System.out.println("Value 2 is Bigger");
        }
        
        //chaining if-else
        if (value1 > value2) {
            System.out.println("Value 1 is bigger");
        } else if(value1 < value2) {
            System.out.println("Value 1 is less");
        }
        else{
            System.out.println("Value1 and Value 2 are equal");
        }



        
    }
}
