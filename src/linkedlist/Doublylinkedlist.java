package linkedlist;

import java.util.Scanner;

public class Doublylinkedlist {
    node head;
    static class node{
        int data;
        node prev;
        node next;
        node(int d){
            data=d;
        }
    }
    public void delete(int pos){
        node temp=head;
        int c=0;
        while (temp!=null){
            temp=temp.next;
            c++;
        }
        temp=head;
        if(pos==1){
            head=head.next;
            head.prev=null;
        }
        else if(pos>c){
            System.out.println("No node here");
        }
        else{
            int i=2;
            while (i<pos){
                temp=temp.next;
                i++;
            }
            if(pos==c){
                temp.next=null;
            }
            else{
                temp.next.next.prev=temp;
                temp.next=temp.next.next;
            }
        }
    }
    public void insertAt(int pos,int data){
        node temp=head;
        int c=0;
        while (temp!=null){
            temp=temp.next;
            c++;
        }
        temp=head;
        if(pos==1){
            addAtStart(data);
        }
        else if(pos==c+1){
            addAtLast(data);
        }
        else if(pos>c+1){
            System.out.println("Invalid position");
        }
        else{
            node nnd=new node(data);
            int i=2;
            while(i<pos){
                temp=temp.next;
                i++;
            }
            nnd.next=temp.next;
            temp.next.prev=nnd;
            nnd.prev=temp;
            temp.next=nnd;
        }
    }
    public void addAtStart(int data){
        node nnd=new node(data);
        head.prev=nnd;
        nnd.next=head;
        head=nnd;
    }
    public void addAtLast(int data){
        node nnd=new node(data);
        node temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        temp.next=nnd;
        nnd.prev=temp;
    }
    public void display(){
        node temp=head;
        while (temp.next!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println(temp.data);
        while (temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Doublylinkedlist lls=new Doublylinkedlist();
        lls.head=new node(1);
        node sec=new node(2);
        node third=new node(3);
        node fourth=new node(4);
        lls.head.next=sec;
        sec.prev= lls.head;
        sec.next=third;
        third.prev=sec;
        third.next=fourth;
        fourth.prev=third;
//        lls.insertAt(sc.nextInt(), sc.nextInt());
        lls.delete(sc.nextInt());
        lls.display();
    }
}


