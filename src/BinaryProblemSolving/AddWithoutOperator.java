  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BinaryProblemSolving;

/**
 *
 * @author user
 */
public class AddWithoutOperator {
    public static void main(String args[]){
        
        int a = 12345,b = 236145;
        
        while( b != 0){
            int carry = a & b;
            a = a ^ b;
            b = carry<<1;
        }
        
        System.out.println("The binary sum is: " + a);
    }
}

// https://www.javatpoint.com/add-two-numbers-without-using-operator-in-java#:~:text=Explanation%3A,b)%20between%20a%20and%20b.
