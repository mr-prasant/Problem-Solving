class MyQueue {
    Stack<Integer> stack1, stack2;

    public MyQueue() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        while (!stack2.isEmpty()) stack1.push(stack2.pop());
        stack1.push(x);
    }

    public int pop() {
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
        return stack2.pop();
    }

    public int peek() {
        while (!stack1.isEmpty()) stack2.push(stack1.pop());
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
}