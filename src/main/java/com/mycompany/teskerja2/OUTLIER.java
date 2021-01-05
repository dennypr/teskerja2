/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teskerja2;

/**
 *
 * @author Denny
 */
import java.util.ArrayList;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.math.BigInteger; 

public class OUTLIER 
 { 
    /* Function to get parity of number n. 
    It returns 1 if n has odd parity, and 
    returns 0 if n has even parity */
    static boolean getParity(int n) 
    { 
        boolean parity = false; 
        while(n != 0) 
        { 
            parity = !parity; 
            n = n & (n-1); 
        } 
        return parity; 
          
    } 
      
    /* Driver program to test getParity() */
    public static void main (String[] args) 
    { 
        int n = 12; 
        System.out.println("Parity of no " + n + " = " + 
                         (getParity(n)? "odd": "even"));  
    } 
} 