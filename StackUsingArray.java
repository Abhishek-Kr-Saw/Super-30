public class StackUsingArray {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public StackUsingArray(int size){
        this.maxSize = size;
        this.stackArray = new int[size];
        this.top = -1;
    }

    // Function to insert element
    public void push(int val){
        if(isFull()){
            System.out.println("Stack Overflow! Can't push " + val);
            return;
        }
        stackArray[++top] = val;
    }

    // Function to delete top element
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack Underflow! Can't pop anything.");
            return -1;
        }
        return stackArray[top--];
    }

    // Method to check whether stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

    // Method to check whether stack is full
    public boolean isFull(){
        return top == maxSize - 1;
    }

    // Method to find top element
    public int peek(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return -1;
        }
        return stackArray[top];
    }

    // Method to display all elements of the stack
    public void display(){
        if(isEmpty()){
            System.out.println("Stack is empty!");
            return;
        }
        System.out.println("Stack elements are:");
        for(int i = 0; i <= top; i++){
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    // Main method
    public static void main(String[] args) {
        StackUsingArray st = new StackUsingArray(5);
        st.push(10);
        st.push(20);
        st.push(30);

        st.display();

        System.out.println("Top element: " + st.peek());
        System.out.println("Popped element: " + st.pop());

        st.display();
    }
}
