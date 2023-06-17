package Jun.Day16;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String s_lower = s.toLowerCase();

        s_lower = s_lower.replaceAll("[^A-Za-z0-9]+","");
        String s_rev = new StringBuffer(s_lower).reverse().toString();

        // System.out.println(s_lower);

        return s_lower.equals(s_rev);
    }
}
