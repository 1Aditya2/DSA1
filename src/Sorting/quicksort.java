package Sorting;

import java.util.Scanner;

public class quicksort {
    int arr[];
    quicksort(int size){
        arr=new int[size];
    }
    public int partition(int a[],int start,int end){
        int pivot=end;
        int j;
        int i=start-1;
        int t;
        for ( j = start; j <=end ; j++) {
            if(a[j]<=a[pivot]){
                i++;
                t=arr[i];
                arr[i]=arr[j];
                arr[j]=t;
            }
        }
        return i;
    }
    public void quicksort(int a[],int start,int end){
        if(start<end){
            int pivot=partition(a,start,end);
            quicksort(a,start,pivot-1);
            quicksort(a,pivot+1,end);
        }
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n= sc.nextInt();
        quicksort obj=new quicksort(n);
        for (int i = 0; i < n; i++) {
            obj.arr[i]= sc.nextInt();
        }
        obj.display();
        obj.quicksort(obj.arr,0,n-1 );
        obj.display();
    }
}




























