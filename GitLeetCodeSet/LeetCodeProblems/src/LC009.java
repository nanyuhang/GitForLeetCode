public class LC009 {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        int reverse = 0;
        int orgin = x;
        while (x != 0) {
            reverse = reverse * 10 + x % 10;
            x /= 10;
        }
        if (reverse == orgin)
            return true;
        return false;
    }
}
