/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.teskerja2;
import java.io.*; 
import static java.lang.Math.*; 
/**
 *
 * @author Denny
 */
public class Narcissistic 
{ 
  
    public static void main(String args[]) 
    { 
        //Find Narcistic Number
       Narcissistic obj = new Narcissistic(); 
       int n = 1634; 
       if (obj.check(n)) 
           System.out.println("yes"); 
       else
           System.out.println("no"); 
     } 
    
// function to count digits 
int countDigit(int n) 
{ 
    if (n == 0) 
        return 0; 
   
    return 1 + countDigit(n / 10); 
} 
   
// Returns true if n is Narcissistic number 
boolean check(int n) 
{ 
    // count the number of digits 
    int l = countDigit(n); 
    int dup = n; 
    int sum = 0; 
   
    // calculates the sum of  
    //digits raised to power 
    while(dup > 0)  
    { 
        sum += pow(dup % 10, l); 
        dup /= 10; 
    } 
   
    return (n == sum); 
} 
}