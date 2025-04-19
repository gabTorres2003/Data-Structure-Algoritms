public class Main {
    public static void main(String[] args) throws Exception {
        Stack myStack = new Stack(10);

        myStack.getTop();
        myStack.getHeight();

        System.out.println();

        myStack.push(11);
        myStack.push(12);
        myStack.push(13);
        myStack.push(14);
        myStack.printStack();
        
        System.out.println();
        
        myStack.pop();
        myStack.printStack();

    }
}
