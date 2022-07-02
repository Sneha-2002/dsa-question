package arrays;

public class pushZeroAtEnd {
	
	public static void pushZeroAtEnd(int[] arr) {
		for(int i = 0; i< arr.length-1; i++){
            for(int j = 0; j< arr.length-1;j++){
                if(arr[j] != 0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
	public static void main(String args[]) {
		int arr[] = {2,0,0,1,3,0,0};
		pushZeroAtEnd(arr);
		for(int i = 0; i<)
	}

}
