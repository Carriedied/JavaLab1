package course.lab01;

public class TextTasks {
    public static void reverse(String input) {
        String result = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            result += input.charAt(i);
        }

        System.out.println(result);
    }

    public static void palindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        boolean isPalindrome = true;

        while (left < right) {
            char leftChar = input.charAt(left);
            char rightChar = input.charAt(right);

            if (!Character.isLetterOrDigit(leftChar)) {
                left++;
                continue;
            }

            if (!Character.isLetterOrDigit(rightChar)) {
                right--;
                continue;
            }

            if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
                isPalindrome = false;
                break;
            }

            left++;
            right--;
        }

        System.out.println(isPalindrome);
    }
}
