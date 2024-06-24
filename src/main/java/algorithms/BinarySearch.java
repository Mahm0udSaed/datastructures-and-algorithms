package algorithms;

public class BinarySearch {
    /**
     * complexity O(log n) as we will not loop through all items in the array
     * initiate low=0, high=arr.len-1
     * while low <= high search for the element
     * calculate mid (low+high/2)
     * if arr[mid]==k, return mid /  if (arr[mid]>key) high=mid-1 / else low=mid+1;
     * @return**/
    public int binarySearch(int [] arr, int key){
int low=0,high= arr.length-1;
while (low<=high){
    int mid=(low+high)/2;
    if (arr[mid]==key){
        return mid;
    }else if (arr[mid]>key){
        high=mid-1;
    }else {
        low=mid+1;
    }
}
        return -1;
    }
    public static void main(String...args){
        int[] arrTest={1,2,3,4,5};
        BinarySearch binarySearch=new BinarySearch();
        System.out.println("Found Element at Index "+binarySearch.binarySearch(arrTest,6));
    }
}
