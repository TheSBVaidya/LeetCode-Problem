import java.util.HashMap;

public class RomanToInteger {

    public static int romanToInt(String s) {
        int n = s.length();
        int result = 0;

        HashMap<Character , Integer> romanNo = new HashMap<>();
        romanNo.put('I', 1);
        romanNo.put('V', 5);                                                                                               
        romanNo.put('X', 10);
        romanNo.put('L', 50);
        romanNo.put('C', 100);
        romanNo.put('D', 500);
        romanNo.put('M', 1000);

        for(int i = 0; i<n; i++) {
            int value = romanNo.get(s.charAt(i));

            if (i + 1 < n&& value < romanNo.get(s.charAt(i + 1))) {
                result -= value;
            } else {
                // Otherwise, add the current value
                result += value;
            }

        }
        return result;
    }
    public static void main(String[] args) {
        
        String s = "MCMXCIV";

        int result = romanToInt(s);

        System.out.println(result);
    }
}
