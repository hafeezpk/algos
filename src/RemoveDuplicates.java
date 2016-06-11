
public class RemoveDuplicates {
	
	static String test = "Analysis";
	static int[] cnt = new int[128];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < test.length(); i++) {
			if (cnt[test.charAt(i)] == 0) {
				cnt[test.charAt(i)] = 1;
				System.out.print(test.charAt(i));
			}
		}
	}

}
