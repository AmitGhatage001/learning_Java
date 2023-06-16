package Sorting;
import java.util.*;
public class SelctionSort {

    public static void swap(int[] arr,int i,int minIndex){
        int c=arr[i];
        arr[i]=arr[minIndex];
        arr[minIndex]=c;
        return;
    }

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter array size");
        int num = obj.nextInt();

        int[] arr = new int[num];

        System.out.println("Enter array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=obj.nextInt();
        }

        // selection sort
        // 12 , 22 , 23 , 23 ,32 ,44 98
        // TC - O(N^2)
        // SC - O(1)

        for(int i=0;i<arr.length;i++){
            int min=arr[i];
            int minIndex=i;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<min){
                    min=arr[j];
                    minIndex=j;
                }
            }
            swap(arr,i,minIndex);
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
}
