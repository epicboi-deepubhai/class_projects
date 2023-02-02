package class_projects.queue;
interface queueInterface {
    void disp();
    void enqueue(int n);
    int dequeue();
}

class FixedQueue implements queueInterface{
    int front = -1;
    int rear = -1;
    int q[] = new int[5];

    public void enqueue(int n){
        if(rear==q.length-1){
            System.out.println("Queue Overflowed!!");
        }else if(front==-1&&rear==-1){
            front = 0;
            rear = 0;
            q[rear] = n;
        }else{
            rear++;
            q[rear] = n;
        }
    }

    public int dequeue(){
        if(front==-1||front>rear){
            System.out.println("Queue Underflowed!!");
            return -1;
        }
        int i = q[front++];
        return i;
    }

    public void disp(){
        if(front==-1||front>rear){
            System.out.println("Queue is empty!!");
            return;
        }
        System.out.println("Front: "+ front);
        for (int i = front; i <= rear; i++) {
            System.out.print(q[i]+" ");
        }System.out.println("Rear: "+rear);
    }
}

class circularQueue implements queueInterface{
    int front = -1;
    int rear = -1;
    int q[] = new int[5];

    public void enqueue(int n){
        if((rear+1)%q.length==front){
            System.out.println("Queue Overflowed!!");
        }else if(front==-1&&rear==-1){
            front = 0;
            rear = 0;
            q[rear] = n;
        }else{
            rear=(rear+1)%q.length;
            q[rear] = n;
        }
    }

    public int dequeue(){
        if(front==-1){
            System.out.println("Queue Underflowed!!");
            return -1;
        }else if(front==rear){
            int i = q[front];
            front = -1; 
            rear = -1;
            return i;
        }
        int i = q[front];
        front = (front+1)%q.length;
        return i;
    }

    public void disp(){
        if(front==-1){
            System.out.println("Queue is empty!!");
            return;
        }
        System.out.println("Front: "+front);
        int i = front;
        do{
            System.out.print(q[i]+" ");
            i = (i+1)%q.length;
        }while(i!=(rear+1)%q.length);
        System.out.println();
        System.out.println("Rear: "+rear);
    }
}



public class queueImpliment {
    public static void main(String[] args) {

    }
}