import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public String[] solution(int[][] line) {
        
         List<long[]> intersections = new ArrayList<>();

        for (int i = 0; i < line.length - 1; i++) {
            for (int j = i + 1; j < line.length; j++) {
                long a = line[i][0];
                long b = line[i][1];
                long e = line[i][2];
                long c = line[j][0];
                long d = line[j][1];
                long f = line[j][2];

                long denominator = a * d - b * c;
                if (denominator == 0) continue; // 평행 또는 일치

                long xNumerator = b * f - e * d;
                long yNumerator = e * c - a * f;

                if (xNumerator % denominator != 0 || yNumerator % denominator != 0) continue;

                long x = xNumerator / denominator;
                long y = yNumerator / denominator;

                boolean duplicate = false;
                for (long[] point : intersections) {
                    if (point[0] == x && point[1] == y) {
                        duplicate = true;
                        break;
                    }
                }
                if (!duplicate) intersections.add(new long[]{x, y});
            }
        }
    
        return drawStars(intersections);
    }
    
     public String[] drawStars(List<long[]> points) {
        long minX = Long.MAX_VALUE, maxX = Long.MIN_VALUE;
        long minY = Long.MAX_VALUE, maxY = Long.MIN_VALUE;

        // 1. min/max 찾기
        for (long[] p : points) {
            long x = p[0], y = p[1];
            minX = Math.min(minX, x);
            maxX = Math.max(maxX, x);
            minY = Math.min(minY, y);
            maxY = Math.max(maxY, y);
        }

        int width = (int)(maxX - minX + 1);
        int height = (int)(maxY - minY + 1);

        // 2. 배열 만들고 '.'으로 채우기
        char[][] board = new char[height][width];
        for (char[] row : board) {
            Arrays.fill(row, '.');
        }

        // 3. '*' 찍기 (좌표 변환)
        for (long[] p : points) {
            int x = (int)(p[0] - minX);
            int y = (int)(maxY - p[1]); // 위로 갈수록 y 줄어들어야 함
            board[y][x] = '*';
        }

        // 4. char[][] → String[] 변환
        String[] result = new String[height];
        for (int i = 0; i < height; i++) {
            result[i] = new String(board[i]);
        }

        return result;
    }
}