import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public List<String> fizzBuzz(int n) {
        // loop through n
        // if n divided by 3
        // if n divided / 5
        // if n dividded by none return string
        ArrayList<String> ans = new ArrayList<String>();

        for (int i = 1; i <= n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                ans.add("FizzBuzz");
            } else if (i % 3 == 0) {
                ans.add("Fizz");
            } else if (i % 5 == 0) {
                ans.add("Buzz");
            } else {
                String num = String.valueOf(i);
                ans.add(num);
            }
        }

        return ans;
    }
}

// was able to complete on own
