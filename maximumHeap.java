package Heaps;
import java.util.*;
public class maximumHeap {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Number of elements");
        int num = obj.nextInt();
        System.out.println("Enter the elements into heap");
        // Declared priority Queue i.e maxheap
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>((a,b) -> b-a);
        System.out.println("Size of heap is "+maxHeap.size());
        for(int i=0;i<num;i++){
            int element=obj.nextInt();
            maxHeap.offer(element);
        }
        System.out.println("Maximum element in Heap is "+maxHeap.poll());

    }
}
