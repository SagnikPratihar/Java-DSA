package StackAndQueues.Questions;
import java.util.Stack;
public class QueueUsingStack {
    private Stack<Integer> first;
    private Stack<Integer> second;

    public QueueUsingStack() {
        first = new Stack<>();
        second = new Stack<>();
    }
    //insert efficient
    public void add(int item) {
        first.push(item);
    }


    //remove efficient
//    public void add(int item){
//        while (!first.isEmpty()) {
//            second.push(first.pop());
//        }
//        first.push(item);
//        while (!second.isEmpty()) {
//            first.push(second.pop());
//        }
//    }


    //insert efficient
    public int remove() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }
        int removed = second.pop();
        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return removed;
    }

    //remove efficient
//    public int remove() throws Exception {
//        return first.pop();
//    }

    //insert efficient
    public int peek() throws Exception {
        while (!first.isEmpty()) {
            second.push(first.pop());
        }

        int peeked = second.peek();

        while (!second.isEmpty()) {
            first.push(second.pop());
        }
        return peeked;
    }

    //remove efficient
//    public int peek() throws Exception {
//        return first.peek();
//    }
    public boolean isEmpty() {
        return first.isEmpty();
    }
}
