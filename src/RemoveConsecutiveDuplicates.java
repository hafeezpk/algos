public class RemoveConsecutiveDuplicates {
	
	static int[] a = {0,1,1,3,3,5,0,0,6,6};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dest = 1;
		
		for (int i = 1; i < a.length; i++) {
			if (a[i] != a[i-1])
				a[dest++] = a[i];
		}
		
		for (int i = 0; i < dest; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
