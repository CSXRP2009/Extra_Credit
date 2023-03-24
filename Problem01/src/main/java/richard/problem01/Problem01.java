/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.problem01;

/**
 *
 * @author CSXRP
 */
public class Problem01 {
 public static long getSumOfPrimes(int n){
    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
               // The time complexity is O(n^2)
               // Space Complexity is O(1)
        int sum = 2;
        boolean prime = true;
        for (int i= 3; i <= n; i++){
            prime = true;
            for(int j = 2; j < i; j++){
                if(i % j == 0){
                  prime = false;
                  break;
                }
            }
            if (prime){
                sum += i;
            }
        }
        return sum;
    }
    
    
    public static void main(String[] args) {
      long sum = getSumOfPrimes(10);
      System.out.println(sum);
      
       long sum2 = getSumOfPrimes(20);
      System.out.println(sum2);
    }
}
