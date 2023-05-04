/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.extracredit;

/**
 *
 * @author CSXRP
 */
public class ExtraCredit {
  public static double ratio(int[]array){
         int max1 = array[0];
         int max2 = array[0];
         int min1 = array[0];
         int min2 = array[0];
         for(int i=0; i < array.length; ++i){
             if(array[i] >= max1){
                 max2=max1;
                 max1=array[i];
             }
             else if(array[i]>=max2){
                 max2=array[i];
             }
              if(array[i] <= min1){
                 min2=min1;
                 min1=array[i];
             }
             else if(array[i]<=min2){
                 min2=array[i];
             }
         }
         return (double)(max1+max2)/(min1+min2);
       }
    public static void main(String[] args) {
      int[] a={3,5,12,450,1,1,5,6,23,6,8,9,321,2,3};
      double r = ratio(a);
      System.out.println(r);
      
      int[] a2={55, 876, 99, 789, 26, 32, 45, 61, 89};
      double r2 = ratio(a2);
      System.out.println(r2);
      
    }
}
