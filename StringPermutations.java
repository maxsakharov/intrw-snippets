public class Permutation {

	public  static void permutation(String s) { 
		permutation("", s); 
	}

    private static void permutation(String prefix, String s) {
        int n = s.length();
        if (n == 0) {
        	System.out.println(prefix);
        } else {
            for (int i = 0; i < n; i++)
               permutation(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1));
        }
	}
}