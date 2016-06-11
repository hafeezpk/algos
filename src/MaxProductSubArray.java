
public class MaxProductSubArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int start_max = 0;
		int end_max = 0;
		
		int start_current_max = 0;
		int end_current_max = 0;
		
		int arr[] = {-1, -3, -10, 0, 60};
		
		int max_prod = arr[0];
		
		int max_prod_current = arr[0];
		
		boolean flag = true;

		for (int i = 1; i < arr.length; i++) {
			max_prod_current = max_prod_current * arr[i];

			if (max_prod_current > max_prod) {
				max_prod = max_prod_current;
				start_max = start_current_max;
				end_max = end_current_max = i;
			} else if (max_prod_current < max_prod && flag) {
				start_current_max = i;
				end_current_max = i;
				max_prod_current = arr[i];
				flag = false;
			}
			
		}
		
		System.out.println(start_max + " " + end_max);

	}

}
