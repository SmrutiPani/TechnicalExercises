import java.util.stream.IntStream;

public class Exercise1 {
	
	public static boolean isPalindrome(String originalString) {

        String tempString = originalString.replaceAll("\\s+", "").toLowerCase();
        return IntStream.range(0, tempString.length() / 2)
            .noneMatch(i -> tempString.charAt(i) != tempString.charAt(tempString.length() - i - 1));

    }
	public static void main(String[] args) {

        //Check if 'geeksforgeeks' is Palindrome
        System.out.println("Is geeksforgeeks a Palindrome? - " + isPalindrome("geeksforgeeks")); //false

        //Check if 'radar' is Palindrome
        System.out.println("Is radar a Palindrome? - " + isPalindrome("radar")); //true
    }
}
