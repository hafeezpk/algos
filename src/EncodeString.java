
public class EncodeString {
	
	static String enc_string = "aaaabbbcccc";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dest = 0;
		int cnt = 1;
		
		for (int i = 1; i < enc_string.length(); i++) {
			if (enc_string.charAt(i) == enc_string.charAt(dest)) {
				cnt++;
			} else {
				System.out.print(enc_string.charAt(dest) + "" +cnt);
				dest = i;
				cnt = 1;
			}
		}
		System.out.print(enc_string.charAt(dest) + "" +cnt);
	}

}
