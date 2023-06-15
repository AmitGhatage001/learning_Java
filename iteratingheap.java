package Heaps;
import java.util.*;

public class iteratingheap {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        PriorityQueue<Integer> minHeap = new PriorityQueue<>((a,b) -> a-b);

        System.out.println("Enter elements in Heap");
        for(int i=0;i<6;i++){
            int num=obj.nextInt();
            minHeap.offer(num);
        }
        System.out.println("iteration result is below");
        // iterating minheap
        Iterator<Integer> iterator = minHeap.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
