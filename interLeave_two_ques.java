import java.util.LinkedList;
import java.util.Queue;
import java.util.*;


    public class queues {
        public static void interLeave_two_ques(Queue<Integer> q){
            Queue<Integer> firstHalf=new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size/2;i++){
                firstHalf.add(q.remove());
            }
            while(!firstHalf.isEmpty()){
                q.add(firstHalf.remove());
                q.add(q.remove());
            }
        }
        public static void main(String args[]) {
            Queue<Integer> q=new LinkedList<>();
             for(int i=1;i<=5;i++){
                 q.add(i);
             }
            interLeave_two_ques(q);
        }
    }
