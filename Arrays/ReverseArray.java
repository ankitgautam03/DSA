package Arrays.LB450;
import java.util.*;
/*
Reverse An Array
Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}
*/

/*Implement in both approaches i.e. Iterative and Recursive Approaches respectively */

// Iterative Approach (My Code)
/* public class ReverseArray {
    public static void main(String[] args) {
        System.out.println("Enter the size of array:- ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] Arr = new int[n];
        for(int i=0;i<n;i++){
            Arr[i] = sc.nextInt();
        }
        System.out.println("Entered Array is:- ");
        for(int i=0;i<n;i++){
            System.out.println(Arr[i]+" ");
        }
        System.out.println("Reversed Array is:- ");
        for(int i=n-1;i>=0;i--){
            System.out.println(Arr[i]+" ");
        }
    }
}*/
/* GFG logic(Iterative)
// Iterative java program to reverse an
// array
public class ReverseArray {

 Function to reverse arr[] from
	start to end
static void rvereseArray(int arr[],
                         int start, int end)
{
    int temp;

    while (start < end)
    {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    }
}

    Utility that prints out an
    array on a line
    static void printArray(int arr[],int size)
    {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {

        int arr[] = {1, 2, 3, 4, 5, 6};
        printArray(arr, 6);
        rvereseArray(arr, 0, 5);
        System.out.print("Reversed array is \n");
        printArray(arr, 6);

    }
}

// This code is contributed by Sam007
*/


// Recursive Approach
public class ReverseArray {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter Size of the Array:- ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array Before Reversal:- ");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i]+" ");
        }
        RevArr(arr,0,n-1);
        System.out.println("Array After Reversal:- ");
        for(int i=0;i<n;i++) {
            System.out.println(arr[i] + " ");
        }
    }
    public static void RevArr(int arr[] ,int start,int end ){
        int temp;
        if(start >= end){
            return;
        }
        else{
            temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            RevArr(arr,start+1,end-1);
        }
    }
}

