package Queue;
class circqueue {
    int arr[];
    int front;
    int rear;
    circqueue(int size){
        arr=new int[size];
        front=rear=-1;
    }
    public boolean isempty(){
        if(rear==-1)
            return true;
        else
            return false;
    }
    public boolean isfull(){
        if(rear==arr.length-1 && front==0)
            return true;
        else if(rear+1==front)
            return true;
        else
            return false;
    }
    public void enqueue(int d){
        if(isfull())
            System.out.println("Overflow");
        else if(isempty()) {
            front = rear = 0;
            arr[rear]=d;
        }
        else{
            if(rear==arr.length-1){
                rear=0;
                arr[rear]=d;
            }
            else{
                arr[++rear]=d;
            }
        }
    }
    public void dequeue(){
        if(isempty())
            System.out.println("Queue is empty");
        else{
            System.out.println(arr[front]);
            if(front==arr.length-1)
                front=0;
            else if(front==rear)
                front=rear=-1;
            else
                front++;
        }
    }

}
