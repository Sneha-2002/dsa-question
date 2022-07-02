
package functions;
import java.util.Scanner;
public class BinarySearch {
//	import java.util.Scanner;
//	public class Solution { 

	    public static int binarySearch(int[] arr, int x) {
	    	//Your code goes here
	        int start = 0;
	        int end = arr.length-1;
	        while(start<=end){
	            int mid = (start+end)/2;
	            if(x == arr[mid]){
	                return mid;
	            }else if(x >= mid){
	                start = mid+1;
	            }else{
	                end = mid-1;
	            }
	        }
	        return -1;
	    }
	    public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        int N = sc.nextInt();
	        int arr[] = new int[N];
	        for(int i = 0; i<N; i++){
	            arr[i] = sc.nextInt();
	            
	        }
	        int t = sc.nextInt();
	        for(int i =0; i<=t;i++){
	            int x = sc.nextInt();
	            int index = binarySearch(arr, x);
	            System.out.println(index);
	        }
	    }
}
//	public static int binarySearch(int[] input, int elem) {
//		
//		int start = 0;
//		int end = input.length-1;
//		while(start<=end) {
//			int mid = (start + end)/2;
//			if(elem == input[mid]) {
//				return mid;
//			}else if(elem>input[mid]) {
//				start = mid+1;
//			}else {
//				end = mid-1;
//			}
//		}
//		return -1;
//	}
//	public static void main(String[] args) {
//		int[] input = {2,4,5,8,9,15,21,28};
//		int index = binarySearch(input, 9);
//		System.out.println(index);
//		
//	}
//
//}

