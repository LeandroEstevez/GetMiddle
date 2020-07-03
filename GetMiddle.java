/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package getmiddle;

import java.util.Scanner;

/**
 *
 * @author leandroestevez
 */
public class GetMiddle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input  = new Scanner(System.in);
        
        System.out.print("Please enter a word: ");
        
        String word = input.next();
        
        System.out.println();
        
        String middle;
        int length;
        int index;
        
        if(word.length() % 2 == 1) {
            
            index = word.length() / 2;
            
            length = 1;
            
        } else {
            
            index = word.length() / 2 - 1;
            
            length = 2;
            
        }
        
        middle = word.substring(index, index + length);
        
        System.out.print(middle);
        
    }
    
}
