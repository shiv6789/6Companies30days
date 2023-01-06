public class BullsandCows {
    public String getHint(String secret, String guess) {
        int secretCount[] = new int[10];
        int guessCount[] = new int[10];

        int bullCount = 0;
        int cowCount = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bullCount++;
            } else {
                secretCount[Integer.parseInt(String.valueOf(secret.charAt(i)))]++;
                guessCount[Integer.parseInt(String.valueOf(secret.charAt(i)))]++;
            }
        }
        
        for (int i = 0; i < 10; i++) {
            cowCount += Math.min(secretCount[i], guessCount[i]);
        }

        return bullCount + "A" + cowCount + "B";
    }
}
