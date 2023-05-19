/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistinsert;

import java.util.ArrayList;

public class ArrayListInsert {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList<String> nameList = new ArrayList<String>();
        
        nameList.add("james");
        nameList.add("Bob");
        nameList.add("Bill");
        
        for(int index = 0; index < nameList.size(); index++ ){
            
            System.out.println("Index: " + index + " Name: " + nameList.get(index)); // get method
            
        }
            nameList.add(1, "Mary");  // inserts mary into index 1
            System.out.println("Mary was added at index 1. " + "Here are the new items now.");
            
            for(int index = 0; index < nameList.size(); index++){
                
                System.out.println("Index: " + index + " Name: " + nameList.get(index));
                
            }
        
    }
    
}
