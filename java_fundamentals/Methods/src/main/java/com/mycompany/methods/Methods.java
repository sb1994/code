/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.methods;

import java.lang.reflect.Method;

/**
 *
 * @author Sean
 */
public class Methods {

    public static void main(String[] args) {
        System.out.println("Before Method Call");
        doSomething();
        System.out.println("After Method Call");
        
    /**
     *
     */
        static void doSomething(){
            System.out.println("This is a call inside my method");     
        }
        
        
        
    }
}
