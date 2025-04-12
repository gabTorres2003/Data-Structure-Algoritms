public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(7);
        
        myDLL.getHead();
        myDLL.getTail();
        myDLL.getLength();
        myDLL.printList();
        
        System.out.println();
        myDLL.append(8);
        myDLL.printList();
        myDLL.getLength();
        
        System.out.println();
        myDLL.removeLast();
        myDLL.printList();
        myDLL.getLength();
        
        System.out.println();
        myDLL.prepend(6);
        myDLL.printList();
        myDLL.getLength();
   }
}
