package Sorting;

import java.util.Scanner;

public class selectionsort {
    int arr[];
    selectionsort(int size){
        arr=new int[size];
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public void sortass(){
        int minid,t;
        for (int i = 0; i < arr.length-1; i++) {
            minid=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minid]>arr[j])
                    minid=j;
            }
            t=arr[i];
            arr[i]=arr[minid];
            arr[minid]=t;
        }
    }
    public void sortdes(){
        int minid,t;
        for (int i = 0; i < arr.length-1; i++) {
            minid=i;
            for (int j = i+1; j < arr.length ; j++) {
                if(arr[minid]<arr[j])
                    minid=j;
            }
            t=arr[i];
            arr[i]=arr[minid];
            arr[minid]=t;
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        selectionsort obj=new selectionsort(sc.nextInt());
        for (int i = 0; i < obj.arr.length; i++) {
            obj.arr[i]= sc.nextInt();
        }
        obj.display();
        obj.sortass();
        obj.display();
        obj.sortdes();
        obj.display();
    }
}
