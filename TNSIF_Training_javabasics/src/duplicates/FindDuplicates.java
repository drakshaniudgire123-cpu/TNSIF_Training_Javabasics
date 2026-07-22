package duplicates;

public class FindDuplicates {

	public static void main(String[] args) {
	
		    
		        int[] arr = {10, 20, 30, 20, 40, 50, 10, 60};

		        System.out.println("Duplicate elements are:");

		        for (int i = 0; i < arr.length; i++) {
		            for (int j = i + 1; j < arr.length; j++) {
		                if (arr[i] == arr[j]) {
		                    System.out.println(arr[i]);
		                    break; // Prevents printing the same duplicate multiple times
		                }
		            }
		        }
		    }
		// TODO Auto-generated method stub

	}


