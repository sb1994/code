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
            results[i]=execute(opCodes[i], leftVals[i], rightVals[i]);
        }
        
//        System.out.println(results);
    
            
         
        for (double currentResult: results) {
            
            System.out.println(currentResult);
        }
        
        
    }
    static double execute(char opCode,double leftVal,double rightVal){
        double result;
        
        switch (opCode) {
            case 'a':
                result = leftVal + rightVal;
                break;
            case 's':
                result = leftVal - rightVal;
                break;
            case 'm':
                result = leftVal * rightVal;
                break;
            case 'd':
                //conditional assignment
                result = rightVal != 0 ? leftVal /rightVal:0.0d;
                break;
            default:{
                System.out.println("Invalid OpCode: " + opCode);

                result = 0.0d;
            }
            break;
        }
        return result;
    }
}
