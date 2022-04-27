package Queue;

class node{
    node next;
    int data;
    int priority;
    node(int d,int pr){
        data=d;
        priority=pr;
    }
}
class priorityqueue{
    node front;
    node rear;
    priorityqueue(){
        front=null;
        rear=null;
    }
    public boolean isempty(){
        if(rear==null){
            return true;
        }
        else{
            return false;
        }
    }
    public void enqueue(node nnd){
        if(isempty()){
            front=rear=nnd;
        }
        else if(nnd.priority<front.priority){
            nnd.next=front;
            front=nnd;
        }
        else{
            node temp=rear;
            while (temp.next!=null && temp.next.priority<=nnd.priority){
                temp=temp.next;
            }
            nnd.next=temp.next;
            temp.next=nnd;
        }
    }
    public void dequeue(){

    }
    public void display(){
        node temp=front;
        while (temp!=null){
            System.out.println(temp.data+" "+ temp.priority);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        node n1=new node(15,4);
        node n2=new node(10,3);
        node n3=new node(20,3);
        priorityqueue pll=new priorityqueue();
        pll.enqueue(n1);
        pll.display();
    }
}
