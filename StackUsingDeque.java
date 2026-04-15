import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


    public class queues {
        implement stack using deque
        static class StackUsingDEQUE{
            Deque<Integer> dq=new LinkedList<>();
            public void push(int data){
                dq.addLast(data);
            }
            public int pop(){
                return dq.removeLast();
            }
            public int peek(){
                return dq.getLast();
            }
        }
          public static void main(String args[]) {
                    // stack using deque
            StackUsingDEQUE sdq=new StackUsingDEQUE();
            sdq.push(1);
            sdq.push(2);
            sdq.push(3);
            System.out.println(sdq.peek());
            System.out.println(sdq.pop());
            System.out.println(sdq.pop());
            System.out.println(sdq.pop());
          }

    }
