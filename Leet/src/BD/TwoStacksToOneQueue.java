package BD;

import java.util.Stack;

public class TwoStacksToOneQueue {
    /** Initialize your data structure here. */
    Stack<Integer> inStack;
    Stack<Integer> outStack;
    public TwoStacksToOneQueue() {
        inStack = new Stack();
        outStack = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(outStack.isEmpty()){
            inToOut();
        }
        return outStack.pop();
    }

    /** Get the front element. */
    public int peek() {
        if(outStack.isEmpty()){
            inToOut();
        }
        return outStack.peek();
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        if(outStack.isEmpty()){
            inToOut();
        }
        return outStack.isEmpty();
    }

    private void inToOut(){
        while (!inStack.isEmpty()){
            outStack.push(inStack.pop());
        }
    }
}
