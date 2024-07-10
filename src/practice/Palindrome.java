package practice;

public class Palindrome {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String s = String.valueOf(x);
        int left=0;
        int right = s.length()-1;
        while(left<right){
            if (s.charAt(left) != s.charAt(right)) {

                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {

    }
}