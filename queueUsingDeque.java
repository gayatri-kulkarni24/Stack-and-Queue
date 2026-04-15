import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


    public class queues {
                //implement queue using deque
        static class QueueUsingDEQUE{
            Deque<Integer> dq=new LinkedList<>();
            public void add(int data){
                dq.addLast(data);
            }
            public int pop(){
                return dq.removeFirst();
            }
            public int peek(){
                return dq.getFirst();
            }
        }

        public static void main(String args[]) {
              //implement queue using deque
              QueueUsingDEQUE qdq=new QueueUsingDEQUE();
              qdq.add(1);
              qdq.add(2);
              qdq.add(3);
              System.out.println(qdq.peek());
              System.out.println(qdq.pop());
              System.out.println(qdq.pop());
        }

    }
