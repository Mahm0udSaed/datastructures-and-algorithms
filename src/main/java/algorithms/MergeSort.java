package algorithms;

import java.util.Arrays;

public class MergeSort {
    /**create merge sort
     * read arr , start, end
     * terminate if the end < start
     * calculate mid point = start + end / 2
     * devide the array into 2 new arrays
     * call this method twice one for left and one for right
     * merge two arrays
     * **/
    public  void mergeSort(int arr[],int start, int end){
        if (end>start){
            int midPoint=(start+end)/2;
            mergeSort(arr,start,midPoint);
            mergeSort(arr,midPoint+1,end);
            merge(arr,start,midPoint,end);
        }
    }
    /**
     * merge
     * read arr, start, mid, end
     * create 2 new arrays for each side
     * compare all items in the arrays and sort it in the original array
     * least item will be removed to the new array
     * move remain items in the array to the original array
     *
     * **/
    public  void merge(int arr[],int start,int mid, int end){
        int leftIndex=0,rightIndex=0, arrIndex=start;
        int leftLength=(mid-start)+1;
        int rightLength=end-mid;
        int leftArray[]=new int[leftLength];
        int rightArray[]=new int[rightLength];
        for (int x=0;x<leftLength;x++){
            leftArray[x]=arr[start+x];
        }
        for (int x=0;x<rightLength;x++){
            rightArray[x]=arr[(mid+1)+x];
        }
        while (leftIndex<leftLength&&rightIndex<rightLength){
            if (leftArray[leftIndex]<=rightArray[rightIndex]){
                arr[arrIndex]=leftArray[leftIndex];
                leftIndex++;
            }else {
                arr[arrIndex]=rightArray[rightIndex];
                rightIndex++;
            }
            arrIndex++;
        }
        while (leftIndex<leftLength){
            arr[arrIndex]=leftArray[leftIndex];
            leftIndex++;
            arrIndex++;
        }
        while (rightIndex<rightLength){
            arr[arrIndex]=rightArray[rightIndex];
            rightIndex++;
            arrIndex++;
        }
        System.out.println("Array : "+ Arrays.toString(arr));
    }
    public static void main(String[] args){
        MergeSort mergeSort=new MergeSort();
        mergeSort.mergeSort(new int[]{8,6,10,9,12},0,4);
    }
}
