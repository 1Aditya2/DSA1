package Sorting;

import java.util.Scanner;

public class mergesort {
    int arr[];
    mergesort(int size){
        arr=new int[size];
    }
    public void merge(int a[], int low, int mid, int hig){
        int i,j,k=low;
        i=low;
        j=mid+1;
        int b[]=new int[hig+1];
        while(i<=mid && j<=hig){
            if(a[i]<a[j]){
                b[k]=a[i];
                i++;
            }
            else if(a[j]<a[i]){
                b[k]=a[j];
                j++;
            }
            k++;
        }
        while(i<=mid){
            b[k]=a[i];
            k++;
            i++;
        }
        while(j<=hig){
            b[k]=a[j];
            k++;
            j++;
        }
        for (int l = low; l <=hig; l++) {
            arr[l]=b[l];
        }
    }
    public void display(){
        for (int i = 0; i < arr.length ; i++) {
            System.out.print(arr[i]+"   ");
        }
        System.out.println();
    }
    public void ms(int a[],int low,int hig){
        int mid;
        if(low<hig){
            mid=(low+hig)/2;
            ms(a,low,mid);
            ms(a,mid+1,hig);
            merge(a,low,mid,hig);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        mergesort obj=new mergesort(n);
        for (int i = 0; i < n; i++) {
            obj.arr[i]= sc.nextInt();
        }
        obj.display();
        obj.ms(obj.arr,0,n-1);
        obj.display();

    }
}





























