package Queue;

/*
class doubleendqueue{
    int arr[];
    int front;
    int rear;
    doubleendqueue(int size){
        arr=new int[size];
        front=-1;
        rear=-1;
    }
    public boolean isempty(){
        if(rear==-1 && front==-1)
            return true;
        else
            return false;
    }
    public boolean isfullfront(){
        if(front==0){
            return true;
        }
        else
            return false;
    }
    public boolean isfullrear(){
        if(rear==arr.length-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void fenqueue(int data){
        if(isfullfront())
            System.out.println("Queue Overflow");
        else if(isempty()){
            front=rear=0;
            arr[front]=data;
        }
        else{
            arr[--front]=data;
        }
    }
    public void fdequeue(){
        if(isempty())
            System.out.println("Queue Underflow");
        else {
            System.out.println(arr[front]);
            if(front==rear){
            front=rear=-1;
            }
            else{
            arr[front]=0;
            front++;
            }
        }
    }
    public void renqueue(int data){
        if(isempty()){
            front=rear=0;
            arr[rear]=data;
        }
        else if(isfullrear()){
            System.out.println("Queue Overflow");
        }
        else{
            arr[++rear]=data;
        }
    }
    public void rdequeue(){
        if(isempty()){
            System.out.println("Queue Underflow");
        }
        else{
        System.out.println("Dequed elemnet is "+arr[rear]);
             if(front==rear){


            rear--;
        }
    }
    public void display(){
        if(isempty())
            System.out.println("Queue is empty");
        else{
            int temp=front;
            while (front!=rear){
                System.out.print(arr[front]+" ");
                front++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        doubleendqueue lls=new doubleendqueue(sc.nextInt());
        for (int i = 0; i < 4; i++) {
            lls.renqueue(sc.nextInt());
        }
        lls.display();
        lls.rdequeue();
        lls.display();
    }
}

 */
