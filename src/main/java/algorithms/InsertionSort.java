package algorithms;
import java.util.Arrays;
public class InsertionSort {

    /**
     * Selection sort works by taking the smallest element in an unsorted array and bringing it to the front.
     * You'll go through each item (from left to right) until you find the smallest one.
     * Time complexity O(N^2)
     * **/
    public int[] sort(int[] arr){
        for (int x=0;x< arr.length;x++){
            int minIndex=x;
            for (int y=x+1;y<arr.length;y++){
                if (arr[minIndex]>arr[y]){
                    minIndex=y;
                }

            }
                if (minIndex!=x){
                    //swap the min element with the first element
                    int temp=arr[x];
                    arr[x]=arr[minIndex];
                    arr[minIndex]=temp;
                }
        }
        return arr;
    }
    public static void main(String...args){
        InsertionSort insertionSort=new InsertionSort();
    int[] unSortedArray= {8,6,9,4,5,7};
    int[] sorted=insertionSort.sort(unSortedArray);
        System.out.println("Array after sorting : " + Arrays.toString(sorted));
    }
}
