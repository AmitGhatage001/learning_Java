package Heaps;
import java.util.*;
public class minimumHeap {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int num = obj.nextInt();
        // Declare minimum_Heap here
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a-b);
        System.out.println("Enter the elements into the heap ");
        for(int i=0;i<num;i++){
            int element=obj.nextInt();
            minHeap.offer(element);
        }
        System.out.println("Minimum element in heap is "+minHeap.poll());
    }
}
