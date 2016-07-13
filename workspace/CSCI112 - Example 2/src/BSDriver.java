
public class BSDriver {

	public static void main(String[] args) {
		int[] nums = (1, 2, 3, 4 ,5 ,6 ,7 ,8 ,9 , 10, 11, 12, 13); 
			// index  0, 1, 2, 3, 4, 5, 6, 7, 8,   9, 10, 11, 12
		int index = BSearch(nums, 11); // to get your high/low variable, you must have an index and the index must be sorted first if it is not already
		if (index == 1){
			System.out.println("The value was found");
		}
		else System.out.println("The value wasn't found");
		
	}
	public static int BSearch(int[] array, int value){
		int low = 0;
		int high = array.length - 1;  // subtract 1 from the length because you start at 0
		while(high >= low){		//
			int mid = (low + high)/2; // find the mid point by adding the low point and high point, then dividing by 2. From there it assigns the midpoint the name "mid"
		if(array[mid] == value){
			return 1;
		}
		else if(value > array[mid]){
			low = mid + 1; // moves to the right on the array if the value of the array is less than the midpoint
		}
		else (
				high = mid - 1);				}
		
	}
		return 0;
}
}