/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operatorprecedence;

/**
 *
 * @author Sean
 */
public class OperatorPrecedence {

    public static void main(String[] args) {
        
        int valA = 21;
        int valB = 6;
        int valC = 3;
        int valD = 1;
        
        int result1 = valA - valB / valC;
        int result2 = (valA - valB) / valC;
        
        System.out.println(result1);
        System.out.println(result2);
    }
}
