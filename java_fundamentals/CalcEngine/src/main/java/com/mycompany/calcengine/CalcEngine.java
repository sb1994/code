/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calcengine;

/**
 *
 * @author Sean
 */
public class CalcEngine {

    public static void main(String[] args) {
        
        double[] leftVals = {100.0d,25.0d,225.0,11.0d};
        double[] rightVals = {50.0d,92.0d,17.0d,3.0d};
        char[] opCodes = {'d','a','s','m'};
        double[] results = new double[opCodes.length];
        
       
        
        
       
        //switch
        for (int i = 0; i < opCodes.length; i++) {
            switch (opCodes[i]) {
                case 'a':
                    results[i] = leftVals[i] + rightVals[i];
                    break;
                case 's':
                    results[i] = leftVals[i] - rightVals[i];
                    break;
                case 'm':
                    results[i] = leftVals[i] * rightVals[i];
                    break;
                case 'd':
                    //conditional assignment
                    results[i] = rightVals[i] != 0 ? leftVals[i] /rightVals[i]:0.0d;
                    break;
                default:{
                    System.out.println("Invalid OpCode: " + opCodes[i]);

                    results[i] = 0.0d;
                }
                break;
            }
        }
        
        System.out.println(results);
    
            
         
        for (double currentResult: results) {
            
            System.out.println(currentResult);
        }
        
        
    }
}
