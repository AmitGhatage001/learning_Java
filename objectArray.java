package Pair;
import java.util.*;
public class objectArray {

    // class attributes
    private String name;
    private int bankbalance;

    // Constructor
    objectArray(String name,int bankbalance){
        this.name=name;
        this.bankbalance=bankbalance;
    }
    // getters
    public String getname(){
        return name;
    }
    public int getbankbalance(){
        return bankbalance;
    }

    public static void main(String[] args) {
        // declaring Object array
        objectArray[] arr = new objectArray[3];

        // scanner object
         Scanner obj = new Scanner(System.in);
        System.out.println("Enter 3 Names with their bank Balance");

        // scanning for object attributes > passing it to class via constrctor > storing in objectarray
         for(int j=0;j<3;j++){
             arr[j] = new objectArray(obj.next(),obj.nextInt());
         }
         // iterating and printing objects in array of objects
        for(int i=0;i<arr.length;i++){
            objectArray obj1= arr[i];
            System.out.println(obj1.getname());
            System.out.println(obj1.getbankbalance());
        }

    }

}
