import java.util.HashSet;

class Solution {
    public boolean isValidSudoku(char[][] board) {

        // 1. Check rows
        for (int row = 0; row < 9; row++) {

            HashSet<Character> set = new HashSet<>();

            for (int col = 0; col < 9; col++) {

                char ch = board[row][col];

                if (ch == '.') {
                    continue;
                }

                if (set.contains(ch)) {
                    return false;
                }

                set.add(ch);
            }
        }

        // 2. Check columns
        for (int col = 0; col < 9; col++) {

            HashSet<Character> set = new HashSet<>();

            for (int row = 0; row < 9; row++) {

                char ch = board[row][col];

                if (ch == '.') {
                    continue;
                }

                if (set.contains(ch)) {
                    return false;
                }

                set.add(ch);
            }
        }

        // 3. Check 3 × 3 boxes
        for (int boxRow = 0; boxRow < 9; boxRow += 3) {

            for (int boxCol = 0; boxCol < 9; boxCol += 3) {

                HashSet<Character> set = new HashSet<>();

                for (int row = boxRow; row < boxRow + 3; row++) {

                    for (int col = boxCol; col < boxCol + 3; col++) {

                        char ch = board[row][col];

                        if (ch == '.') {
                            continue;
                        }

                        if (set.contains(ch)) {
                            return false;
                        }

                        set.add(ch);
                    }
                }
            }
        }

        return true;
    }
}