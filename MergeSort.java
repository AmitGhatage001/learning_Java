package Sorting;
import java.util.*;
public class MergeSort {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        System.out.println("Array 1 size: ");
        int s1=obj.nextInt();
        int[] arr1 = new int[s1];
        System.out.println("Enter array elements");
        for(int i=0;i<s1;i++){
            arr1[i]=obj.nextInt();
        }

        System.out.println("Array 2 size: ");
        int s2=obj.nextInt();
        int[] arr2 = new int[s2];
        System.out.println("Enter array elements");
        for(int i=0;i<s2;i++){
            arr2[i]=obj.nextInt();
        }

        // Sorting both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        // Merge sort algorithm
        // TC - O(N+M)
        // SC - O(1)
        int[] arr3 = new int[s1+s2];

        int P1=0;
        int P2=0;
        int P3=0;
        // 1 2 3 4 5 6 7
        // 2 4 5 6 7

        // 1 2 2 3 4 3 4 4 6 6 7 7

        while(P1<arr1.length && P2<arr2.length){
            if(arr1[P1]<arr2[P2]){
                arr3[P3]=arr1[P1];
                P1++;
                P3++;
            }
            else{
                arr3[P3]=arr2[P2];
                P2++;
                P3++;
            }
        }

        while(P1<arr1.length){
            arr3[P3]=arr1[P1];
            P1++;
            P3++;
        }
        while(P2<arr2.length){
            arr3[P3]=arr2[P2];
            P2++;
            P3++;
        }


        for(int i=0;i<arr3.length;i++){
            System.out.println(arr3[i]);
        }


    }
}
