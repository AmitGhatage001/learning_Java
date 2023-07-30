package Arrays;
import java.util.*;
public class basic {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);

        // Static Initialization
        int[] arr0 = {1,2,3,4,5};

        // Dynamic initialization
        int[] arr1 = new int[5];
        arr1[0]=10;
        arr1[1]=12;
        arr1[2]=13;
        arr1[3]=12;
        arr1[4]=45;

        // Using new Keyword
        int[] arr3 = new int[]{1,3,2,5,6,7,8,35};

        // Multidimensional Arrays

        int[][] arr4 = {{1,2,3,4} , {1,2,3,4} , {12,34,56,83} , {83,35,47,57}};

        // Java Array has default values

        int[] arr5 = new int[5];
        for(int i=0;i<arr5.length;i++){
            System.out.println(arr5[i]);
        }

        // Some methods of copying array

        // arrayCopy Method
        int[] sourceArray = {1,2,3,4,5};
        int[] destinationArray = new int[sourceArray.length];
        System.arraycopy(sourceArray,0,destinationArray,0,sourceArray.length);
        for(int i=0;i<destinationArray.length;i++){
            System.out.println(destinationArray[i]);
        }
    }
}
