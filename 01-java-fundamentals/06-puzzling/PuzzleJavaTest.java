public class PuzzleJavaTest {

    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        int[] tenRolls = puzzle.getTenRolls();
        for(int i = 0; i < 10; i++) {
            System.out.println(tenRolls[i]);
        }

        puzzle.getNewPasswordSet(7);
    }
}
