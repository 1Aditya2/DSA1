package Searching;
import java.util.Scanner;

public class searching {
    int arr[];
    searching(int size){
        arr=new int[size];
    }
    public void display(){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
    public int search(int n){
        int i;
        for ( i = 0; i < arr.length; i++) {
            if(arr[i]==n)
                break;
        }
        return i;
    }
    public int binsearch(int n){
        int key,t;
        for (int i = 1; i < arr.length; i++) {
            key=arr[i];
            for (int j = i-1; j >=0 ; j--) {
                if(key<arr[j]){
                    t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
        int beg=0,end= arr.length,mid;
        while (true){
            mid=(beg+end)/2;
            if(n<arr[mid]){
                end=mid-1;
            }
            else if(n>arr[mid]){
                beg=mid+1;
            }
            else if(arr[mid]==n)
                break;
            else if(beg>end){
                mid=-1;
                break;
            }
        }
        return mid;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        searching obj=new searching(sc.nextInt());
        for (int i = 0; i <obj.arr.length; i++) {
            obj.arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element to search");
        System.out.println(obj.search(sc.nextInt()));
        System.out.println("Enter the element to search");
        System.out.println(obj.binsearch(sc.nextInt()));
    }
}