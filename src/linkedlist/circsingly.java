package linkedlist;

import java.util.Scanner;

public class circsingly {
    node head;

    static class node {
        int data;
        node next;

        node(int data) {
            this.data = data;
        }
    }

    public void delete(int pos) {
        node temp = head;
        int c = 1;
        while (temp.next != head) {
            temp = temp.next;
            c++;
        }
        temp = head;
        if (pos > c) {
            System.out.println("No node at here");
        } else {
            if (pos == 1) {
                while (temp.next != head) {
                    temp = temp.next;
                }
                head = head.next;
                temp.next = head;
            } else {
                temp = head;
                int i = 2;
                while (i < pos) {
                    temp = temp.next;
                    i++;
                }
                temp.next = temp.next.next;
            }
        }
    }

    public void InsertAfter(int pos, int data) {
        node temp = head;
        int c = 1;
        while (temp.next != head) {
            temp = temp.next;
            c++;
        }
        temp = head;
        if (pos == 1) {
            addAtStart(data);
        } else if (pos == c + 1) {
            addAtLast(data);
        } else if (pos > c + 1) {
            System.out.println("Position is invalid");
        } else {
            node nnd = new node(data);
            int i = 2;
            while (i < pos) {
                temp = temp.next;
                i++;
            }
            nnd.next = temp.next;
            temp.next = nnd;
        }
    }

    public void addAtStart(int data) {
        node nnd = new node(data);
        node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        nnd.next = head;
        head = nnd;
        temp.next = head;
    }

    public void addAtLast(int data) {
        node nnd = new node(data);
        node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }
        temp.next = nnd;
        nnd.next = head;
    }

    public void display() {
        node temp = head;
        while (temp.next != head) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print(temp.data);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circsingly cll = new circsingly();
        cll.head = new node(1);
        node sec = new node(2);
        node third = new node(3);
        node fourth = new node(4);
        cll.head.next = sec;
        sec.next = third;
        third.next = fourth;
        fourth.next = cll.head;
        cll.display();
//        cll.InsertAfter(sc.nextInt(), sc.nextInt());
//        cll.delete(sc.nextInt());

        cll.addAtStart(sc.nextInt());
        cll.display();
//        cll.display();
    }
}
