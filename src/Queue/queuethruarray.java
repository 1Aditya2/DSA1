package Queue;
import java.util.Scanner;

class queuethruarray{
    int arr[];
    int front;
    int rear;
    queuethruarray(int size){
        arr=new int[size];
        front=rear=-1;
    }
    public boolean isfull(){
        if(rear==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isempty(){
        if(front==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(int data){
        if(isfull()==true){
            System.out.println("Queue overflow");
        }
        else if(isempty()==true){
            front=rear=0;
            arr[rear]=data;
        }
        else{
            arr[++rear]=data;
        }
    }
    public void dequeue(){
        if(isempty()==true){
            System.out.println("Queue underflow");
        }
        else{
            System.out.println(arr[front]);
            arr[front]=0;
            front=front+1;
        }
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of queue");
        queuethruarray lls=new queuethruarray(sc.nextInt());
        for (int i = 0; i < lls.arr.length; i++) {
            lls.enqueue(sc.nextInt());
        }
        lls.dequeue();
        lls.dequeue();
        lls.display();
    }
}

























