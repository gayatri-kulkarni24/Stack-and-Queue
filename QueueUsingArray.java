import java.util.*;
public class queues {
            //Queues using arrays
        static class Queue {
            int arr[];
            int size;
            int rear;
            int front; //for circular queue

            public Queue(int n) {
                arr = new int[n];
                size = n;
                rear = -1;
                 front=-1;//for circular queue
            }

            public boolean isEmpty() {
                // return rear == -1;
                return rear==-1 && front==-1; //for circular queue
            }
            public boolean isFull(){
                return (rear+1)%size==front;
            }

            public void add(int data) {
                // if (rear == size - 1) {
                //     System.out.println("The queue is full");
                //     return;
                // }
                // rear = rear + 1;
                // arr[rear] = data;
                
                //for circular queue
                if(isFull()){
                    System.out.println("queue is full");
                    return;
                }
                if(front==-1){
                    front=0;
                }
                rear=(rear+1)%size;
                arr[rear]=data;

            }

            public int remove() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }

                // int front = arr[0];
                // for (int i = 0; i < rear; i++) {
                //     arr[i] = arr[i + 1];
                // }
                // rear = rear - 1;
                // return front;

                //for circular queue
                int res=arr[front];
                if(front==rear){
                    front=rear=-1;
                }else{
                front=(front+1)%size;
               }
            return res;
            }

            public int peek() {
                if (isEmpty()) {
                    System.out.println("Queue is empty");
                    return -1;
                }
                //return arr[0];
                //for circular queue
                return arr[front];
            }
        }
        public static void main(String args[]) {

            
        }
}
