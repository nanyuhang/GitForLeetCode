public class LC007 {
    public int reverse(int x) {
        // char[] data = ("" + x).toCharArray();
        // int length = data.length;
        // double temp = 0;
        // if (x < 0) {
        // for (int i = 0; i < length - 1; i++) {
        // // temp = temp + (data[i] - '0') * Math.pow(10, i - 1);
        // temp = temp * 10 + (data[length - i - 1] - '0');
        // }
        // temp = 0 - temp;
        // } else {
        // for (int i = 0; i < length; i++) {
        // temp = temp * 10 + (data[length - i - 1] - '0');
        // // temp = temp + (data[i] - '0') * Math.pow(10, i);
        // }
        // }
        // if (temp < 0) {
        // if (temp < 0 - Math.pow(2, 31))
        // return 0;
        // else
        // return (int) temp;
        // } else {
        // if (temp > Math.pow(2, 31) - 1)
        // return 0;
        // else
        // return (int) temp;
        // }
        double result = 0;
        while (x != 0) {
            int a = x % 10;
            result = result * 10 + a;
            x /= 10;
        }
        return (int) result == result ? (int) result : 0;

    }
}
