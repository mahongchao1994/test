package kuaishou;

public class kuaishou4 {
    public int GetMaxStaffs(char[][] pos) {
        int row = pos.length;
        int col = pos[0].length;
        int count = 0;
        if (pos[0][0] == '.') {
            count++;
        }
        if (pos[0][col - 1] == '.') {
            count++;
        }
        if (pos[row - 1][0] == '.') {
            count++;
        }
        if (pos[row - 1][col - 1] == '.') {
            count++;
        }
        for (int i = 1; i < row; i++) {
            for (int j = 1; j < col; j++) {
                if (pos[i][j] == '.' && pos[i - 1][j] != '.' && pos[i + 1][j] != '.' && pos[i][j - 1] != '.' && pos[i][j + 1] != '.') {
                    count++;
                }
            }
        }
        return count;
    }
}
