import java.util.HashMap;
import java.util.Map;

public class LC013 {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] sChar = s.toCharArray();
        int result = map.get(sChar[0]);

        for (int i = 1; i < sChar.length; i++) {
            if (map.get(sChar[i]) > map.get(sChar[i - 1])) {
                result = result + map.get(sChar[i]) - 2 * map.get(sChar[i - 1]);
            } else {
                result = result + map.get(sChar[i]);
            }
        }

        // for (int i = 0; i < sChar.length;) {
        // int temp = map.get(sChar[i]);
        // if (i == sChar.length - 1) {
        // return result + temp;
        // }
        // if (map.get(sChar[i]) < map.get(sChar[i + 1])) {
        // temp = map.get(sChar[i + 1]) - temp;
        // result = result + temp;
        // i = i + 2;
        // } else if (temp > map.get(sChar[i + 1])) {
        // result = result + temp;
        // i++;
        // }
        // }
        return result;
    }
}
// for (int i = 0; i < sChar.length;) {
// int temp = map.get(sChar[i]);
// if (i == sChar.length - 1) {
// return result + temp;
// }
// if (map.get(sChar[i]) < map.get(sChar[i + 1])) {
// temp = map.get(sChar[i + 1]) - temp;
// result = result + temp;
// i = i + 2;
// } else if (temp > map.get(sChar[i + 1])) {
// result = result + temp;
// i++;
// } else if (temp == map.get(sChar[i + 1])) {
// if (i + 2 >= sChar.length) {
// result = result + temp * 2;
// return result;
// } else {
// if (temp < map.get(sChar[i + 2])) {
// result = result + map.get(sChar[i + 2]) - 2 * temp;
// i = i + 3;
// } else if (temp == map.get(sChar[i + 2])) {
// result = result + 3 * temp;
// i = i + 3;
// } else if (temp > map.get(sChar[i + 2])) {
// result = result + 2 * temp;
// i = i + 2;
// }
// }
// }

// }