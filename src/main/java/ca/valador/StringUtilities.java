package ca.valador;

public class StringUtilities {

    public String reverse(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }

}