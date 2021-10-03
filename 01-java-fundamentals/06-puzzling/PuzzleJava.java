import java.util.Random;
public class PuzzleJava {
    Random rng = new Random();

    public int[] getTenRolls() {       
        int[] x = new int[10];
        for(int i = 0; i < 10; i++) {
            x[i] = rng.nextInt(20) + 1;
        }
        return x;
    }

    public char getRandomLetter() {
        char[] x = new char[26];
        for(int i = 0; i < 26; i++) {
            x[i] = (char) (rng.nextInt(26) + 97);
        }
        return x[rng.nextInt(26)];
    }

    public String generatePassword() {
        String x = "";
        for(int i = 0; i < 8; i++) {
            x += getRandomLetter();
        }
        return x;
    }

    public void getNewPasswordSet (int length) {
        String[] x = new String[length];
        for(int i = 0; i < length; i++) {
            x[i] = generatePassword();
            //System.out.println(x[i]); Uncomment to Test
        }
    }
}