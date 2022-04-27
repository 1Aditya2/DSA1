package Stack;
class node{
    int data;
    node next;
    node(int d){
        data=d;
    }
}
class linkedlist{
    node head;
}
public class Stackbylls {
    node top;
    public void Main(){
        top=null;
    }
    public boolean isempty(){
        return top==null;
    }
    public void push(int data){
        node nnd=new node(data);
        if(isempty()){
            top=nnd;
        }
        else {
            nnd.next=top;
            top=nnd;
        }
    }
    public int pop(){
        if(isempty()){
            System.out.println("List is empty");
            return -1;
        }
        else{
            int ans=top.data;
            top=top.next;
            return ans;
        }
    }
}