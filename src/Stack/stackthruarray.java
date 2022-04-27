package Stack;
import java.util.Scanner;
class stack{
    int arr[];
    int top;
    stack(int n){
        arr=new int[n];
        top=1;
    }
    public boolean isfull(){
        if(top==arr.length-1) {
            System.out.println("Stack is full");
            return true;
        }
        else{
            return false;
        }
    }
    public boolean isempty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    public void peek(){
        if(isempty()==true){
            System.out.println("Stack is empty");
        }
        else{
            System.out.println(arr[top]);
        }
    }
    public void delete(){
        arr=null;
    }
    public void push(int val){
        if(isfull()==true){
            return;
        }
        else{
            arr[++top]=val;
            System.out.println("Successfully inserted");
        }
    }
    public void pop(){
        if(isempty()==true)
            System.out.println("Stack underflow error");
        else{
            System.out.println(arr[top--]);
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        stack obj=new stack(sc.nextInt());
        obj.push(sc.nextInt());
        obj.peek();
    }
}
