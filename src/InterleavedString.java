
public class InterleavedString {
	
	static String A = "ABC";
	
	static String B = "DCE";
	static String C = "DCEAB";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isInterLeaved(A, B, C));
	}

	private static boolean isInterLeaved(String a, String b, String c) {
		// TODO Auto-generated method stub
		return isInterLeavedUtil(0, 0, 0);
	}

	private static boolean isInterLeavedUtil(int a, int b, int c) {
		// TODO Auto-generated method stub
		try {
		if ((a == A.length()) && (b == B.length()))
			return true;
		if (c == C.length())
			return false;
		return ( ((C.charAt(c) == A.charAt(a)) && isInterLeavedUtil(a+1, b, c+1))
				|| ((C.charAt(c) == B.charAt(b)) && isInterLeavedUtil(a, b+1, c+1)));
		} catch (Exception e) {
			System.out.println(e);
		}
		return false;
	}

}
