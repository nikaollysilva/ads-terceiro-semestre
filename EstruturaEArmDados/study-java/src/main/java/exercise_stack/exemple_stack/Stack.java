package exercise_stack.exemple_stack;

public class Stack {
    int top;
    int[] stack;

    public Stack(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
    }

//    Returns if stack is empty
    public boolean isEmpty(){
        return top == -1;
    }

//    Returns os stack is full
    public boolean isFull(){
        return top == (stack.length - 1);
    }

//    Add the element 'info' in stack
    public void push(int info){
        if(!isFull()){
            this.stack[++top] = info;
        }else{
            System.out.println("Stack is full!");
        }
    }

//    Returns the element in the top of stack and after remove the element
    public int pop(){
        if (isEmpty()){
            return stack[top--];
        }
        return -1;
    }

//   Just returns the element in the top of stack
    public int peek(){
        if(!isEmpty()){
            return stack[top];
        }
        return -1;
    }

//    Show the list elements
    public void show(){
        if(!isEmpty()){
            for (int i = 0; i <= top; i++){
                System.out.println(stack[i]);
            }
        }else{
            System.out.println("Stack is empty!");
        }
    }
}
