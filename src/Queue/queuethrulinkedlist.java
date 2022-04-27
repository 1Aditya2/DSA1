package Queue;
public class queuethrulinkedlist{
    node front;
    node rear;
    static class node{
        int data;
        node next;
        node(int d){
            data=d;
            next=null;
        }
    }
    public void enqueue(int data){
        node nnd=new node(data);
        if(front==null && rear==null){
            front=rear=nnd;
        }
        else{
            rear.next=nnd;
            rear=nnd;
        }
    }
    public void dequeue(){
        if(front==null){
            System.out.println("queue underflow");
        }
        else{
            System.out.println(front.data);
            front=front.next;
        }
    }

    public boolean isEmpty(){
        if(front==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void display(){
        node temp=front;
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
}