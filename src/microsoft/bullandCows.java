package microsoft;

public class bullandCows {
    public String getHint(String code, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] numbers = new int[10];
        for (int i = 0; i<code.length(); i++) {
            if (code.charAt(i) == guess.charAt(i)) bulls++;
            else {
                if (numbers[code.charAt(i)-'0']++ < 0) cows++;
                if (numbers[guess.charAt(i)-'0']-- > 0) cows++;
            }
        }
        return bulls + "A" + cows + "B";

    }
}
