public class Main {
    public static void main(String[] args) {
        DoublyLinkedList myDLL = new DoublyLinkedList(0);
        
        myDLL.append(1);
        myDLL.append(2);
        myDLL.append(3);
        myDLL.append(4);
        
        myDLL.printList();
        System.out.println();
        myDLL.set(3,50);
        System.out.println();
        myDLL.printList();
        
        System.out.println("\n" + myDLL.get(3).value + "\n");
        
        myDLL.insert(3,40);
        myDLL.printList();
        
   }
}
