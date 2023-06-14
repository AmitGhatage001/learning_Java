package Heaps;
import java.util.*;
public class Heap_of_Objects {

    String name;
    int age;
    Heap_of_Objects(String name,int age){
        this.name=name;
        this.age=age;
    }

    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);

        System.out.println("Enter number of people");
        int count=obj.nextInt();

        System.out.println("Please Enter Data of people , name followed by age each time");

        // Declared Heap of Objects here
        PriorityQueue<Heap_of_Objects> maxHeap = new PriorityQueue<Heap_of_Objects>((a,b) -> b.age-a.age);

        for(int i=0;i<count;i++){
            String name=obj.next();
            int age=obj.nextInt();
            // This line is creating objects in each loop
            Heap_of_Objects object = new Heap_of_Objects(name,age);
            // This line stores the object in Heap
            maxHeap.offer(object);
        }
//        System.out.println(maxHeap.poll().name+" has maximum age of "+maxHeap.poll().age);
//        System.out.println(maxHeap.poll().name+"has 2nd maximum age of "+maxHeap.poll().age);
//        System.out.println(maxHeap.poll().name+"has 3rd maximum age of "+maxHeap.poll().age);
        Heap_of_Objects first = maxHeap.poll();
        Heap_of_Objects second = maxHeap.poll();
        Heap_of_Objects third = maxHeap.poll();

        System.out.println(first.name + " has the maximum age of " + first.age);
        System.out.println(second.name + " has the second maximum age of " + second.age);
        System.out.println(third.name + " has the third maximum age of " + third.age);
    }
}
