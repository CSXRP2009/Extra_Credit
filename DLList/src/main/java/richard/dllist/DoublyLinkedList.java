/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package richard.dllist;

/**
 *
 * @author CSXRP
 */
class Node {
   public int data;
   public Node next;
   public Node previous;

   public Node(int initialData) {
      data = initialData;
      next = null;
      previous = null;
   }
}

public class DoublyLinkedList { // class = blueprint for an object
   private Node head;
   private Node tail;
   private int size;
    
   public DoublyLinkedList() { // constructor
      head = null;
      tail = null;
      size = 0;
   }
   
   public void append(Node newNode) { // method
       // we have an empty linked list
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      size++;
   }
   
   public void prepend(Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else {
         newNode.next = head;
         head.previous = newNode;
         head = newNode;
      }
      size++;
   }
   // Prints from the head and moves to the next item after current node is printed
   public void printList() {
      Node node = head; // Has node pointing to the head
      while (node != null) {
         System.out.print(node.data + " ");
         node = node.next; // moves the pointer to the next item.
      }
      System.out.println();
   }
   
   public void reverseList(){
       Node node = tail; // has the node pointing to the tail
       while (node != null){
           System.out.print(node.data + " ");
           node = node.previous; // moves the nod to the previous item
       }
       System.out.println();
   }
   
   public void insertAfter(Node currentNode, Node newNode) {
      if (head == null) {
         head = newNode;
         tail = newNode;
      }
      else if (currentNode == tail) {
         tail.next = newNode;
         newNode.previous = tail;
         tail = newNode;
      }
      else {
         Node successor = currentNode.next;
         newNode.next = successor;
         newNode.previous = currentNode;
         currentNode.next = newNode;
         successor.previous = newNode;
      }
      size++;
   }
   
   public void remove(Node currentNode) {
       if(head == null)
           return;
       
      Node successor = currentNode.next;
      Node predecessor = currentNode.previous;
      if (successor==null && predecessor == null){
          head = null;
          tail = null;
      }
      else if(successor == null){
          predecessor.next=null;
          tail = predecessor;
      }
      else if(predecessor == null){
          successor.previous = null;
          head = successor;
      }
      else{
          successor.previous = predecessor;
          predecessor.next = successor;
      }
       currentNode.next = null;
       currentNode.previous = null;
      size--;
      /*
      if (successor != null)
         successor.previous = predecessor;
         
      if (predecessor != null)
         predecessor.next = successor;
         
      if (currentNode == head)
         head = successor;
         
      if (currentNode == tail)
         tail = predecessor;
*/
   }
    
   public int size(){
       return size;
   }
   
   public int max(){
       if(head == null)
           return -1; //return an exception for empty list
       Node node = head;
       int max = node.data;
       while(node != null){
           if(node.data > max){
               max = node.data;
           }
           node = node.next;
       }
       return max;
   }
   
   public int min(){
       if(head == null)
           return -1; //return an exception for empty list
       Node node = head;
       int min = node.data;
       while(node != null){
           if(node.data < min){
               min = node.data;
           }
           node = node.next;
       }
       return min;
   }
   
   public int[]toArray(){
       int[] arr= new int [size];
       int index = 0;
       Node current = head;
        
      while (current != null) {
         arr[index++] = current.data;
        current = current.next;
      }
      return arr;
      }
      
      public int indexOf(int x){
       
       int index = 0;
       Node current = head;
        
      while (current != null) {
         if (x==current.data)
             return index;
        current = current.next;
      index++;
      }
      
      return-1;
   }
      public int sumlast(int m ){
         Node node = tail; // has the node pointing to the tail
         int sum = 0;
         int counter = 0;
       while (node != null && m > counter){
           sum = sum + node.data;
           counter = counter + 1;
           node = node.previous; // moves the nod to the previous item
           
       }
       return sum;
      }
      

}
