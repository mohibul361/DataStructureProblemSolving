/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DynamicProgramming;

/**
 *
 * @author user
 */
public class FibonacciWithoutdp1 {
    
    public static int printFibonacci(int n){
        if(n <= 1){
            return n;
        }
        
        return printFibonacci(n-1)+printFibonacci(n-2);
    }
    
    public static void main(String args[]){
        int n = 5;
        
        for(int i = 0; i < n; i++){
            System.out.println(printFibonacci(i));
        }

    }
    
//    public static void main(String args[]){
//        int n = 5;
//        
//        int num = 0, num1 = 1;
//        
//        for(int i =0; i <=n; i++){
//            System.out.println(num+ " " );
//            
//            int num3 = num + num1;
//            num = num1;
//            num1 = num3;
//        }
//    }
    
    
}
