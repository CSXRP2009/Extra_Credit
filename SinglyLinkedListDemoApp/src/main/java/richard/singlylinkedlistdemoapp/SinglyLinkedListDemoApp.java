/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.singlylinkedlistdemoapp;

import java.util.Scanner;

/**
 *
 * @author CSXRP
 */
public class SinglyLinkedListDemoApp {
 public static void main(String[] args) {
      LinkedList numList = new LinkedList();
      Scanner scanner = new Scanner(System.in);
      System.out.print("Enter n: ");
      int n = scanner.nextInt();
      
      numList.append(new Node(2));
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
                numList.append(new Node(i));
            }
        }
      numList.printList();
      
      LinkedList numList3 = new LinkedList();
      Node node = numList.getNode(0);
      Node prev = null;
      
      while(node != null){
          int data = node.data;
          String dataString = String.valueOf(data);
          if(dataString.contains("3")){
              numList3.append(new Node(node.data));
              numList.removeAfter(prev);
              node = prev.next;
          }
          else{
             prev = node;
             node = node.next;  
          }
         
      }
      numList.printList();
      numList3.printList();
      
      node = numList3.getNode(0);
      int sum = 0;
      while(node != null){
          sum += node.data;
          node = node.next;
      }
      System.out.println("Sum: " + sum);
     
   }
}
