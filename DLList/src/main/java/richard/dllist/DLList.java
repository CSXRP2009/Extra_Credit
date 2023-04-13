/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package richard.dllist;

/**
 *
 * @author CSXRP
 */
public class DLList {

    public static void main(String[] args) {
           DoublyLinkedList numList = new DoublyLinkedList(); // instantiates a new DoublyLinkedList object
      Node nodeA = new Node(14);
      Node nodeB = new Node(2);
      Node nodeC = new Node(20);
      Node nodeD = new Node(31);
      Node nodeE = new Node(16);
      Node nodeF = new Node(55);

      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeC);   // Add 20, make the tail
      
      

      numList.prepend(nodeD);  // Add 31, make the head

      numList.insertAfter(nodeB, nodeE);  // Insert 16 after 2
      numList.insertAfter(nodeC, nodeF);  // Insert 55 after tail, 55 becomes new tail

      // Output list
      System.out.print("List after adding nodes: ");
      numList.printList();
      
       System.out.println(numList.size());

      // Remove the tail node, then the head node
      numList.remove(nodeF);
      numList.remove(nodeD);
      
      // Output final list
      System.out.print("List after removing nodes: ");
      numList.printList();
      numList.append(nodeA);   // Add 14
      numList.append(nodeB);   // Add 2, make the tail
      numList.append(nodeC);
      System.out.println(numList.size());
      
       System.out.println("Printing in reverse");
       //numList.reverseList();
       
       System.out.println("The maximum of the list: " + numList.max());
       
       System.out.println("The minimum of the list: " + numList.min());
       System.out.println("The size of my linked lise:" + numList.size());
       int[] myTestArr= numList.toArray();
       for(int i=0; i<myTestArr.length;i++){
           System.out.println(myTestArr[i]);
           System.out.println("The size of my linked lise:" + numList.indexOf(2));
           
       }
       numList.sumlast(5);
        System.out.println("The sum of the last 2 items is:" + numList.sumlast(2));
    }
}
