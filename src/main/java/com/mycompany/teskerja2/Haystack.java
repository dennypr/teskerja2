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
public class Haystack {
    public static void main(String[] argv) {
        String haystack = "java in java learn";
        char needle = 'a';
        System.out.println(countOccurrences(haystack, needle));
    }/*from  w  w  w
    
    */
    
    public static int countOccurrences(String haystack, char needle) {
        int iCount = 0;
        for (char c : haystack.toCharArray()) {
            if (c == needle) {
                iCount++;
            }
        }
        return iCount;
    }
}
