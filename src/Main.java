import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        magicBox(7);
        System.out.println();
        pyramid(7);
//        double[] pos = {0,0};
//        double[] speeds = {-1, -1};
//        if (Math.min (pos[0], pos[1])<=-2225){
//            speeds[0] = Math.max(0, speeds[0]);
//            speeds[1] = Math.max(0, speeds[0]);
//        }
//        System.out.println(Arrays.toString(speeds));
    }
    public static void magicBox(int x) {
        int[][] arr = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                int a = Math.min(i+1, j+1);
                int b =Math.min(x-i, x-j);
                b = Math.abs(b);
                arr[i][j] = Math.min(a, b)-1;
            }
        }
        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }
    public static void pyramid(int x) {
        int[][] arr = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                int a = Math.min(i, j);
                arr[i][j] = a;
            }
        }
        for (int[] row : arr)
            System.out.println(Arrays.toString(row));
    }
}