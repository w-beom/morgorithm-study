package programmers.level1;

public class Q86491 {
    public static void main(String[] args) {
        int[][] sizes = {{60, 50}, {30, 70}, {60, 30}, {80, 40}};
        int solution = solution(sizes);
        System.out.println("solution = " + solution);
    }

    public static int solution(int[][] sizes) {
        int widthMax = Integer.MIN_VALUE;
        int heightMax = Integer.MIN_VALUE;

        for (int[] size : sizes) {
            widthMax = Math.max(widthMax, size[0]);
            heightMax = Math.max(heightMax, size[1]);
        }

        if (widthMax > heightMax) {
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] < sizes[i][1]) {
                    int temp = sizes[i][1];
                    sizes[i][1] = sizes[i][0];
                    sizes[i][0] = temp;
                }
            }
        } else {
            for (int i = 0; i < sizes.length; i++) {
                if (sizes[i][0] > sizes[i][1]) {
                    int temp = sizes[i][1];
                    sizes[i][1] = sizes[i][0];
                    sizes[i][0] = temp;
                }
            }
        }
        widthMax = Integer.MIN_VALUE;
        heightMax = Integer.MIN_VALUE;
        for (int[] size : sizes) {
            widthMax = Math.max(widthMax, size[0]);
            heightMax = Math.max(heightMax, size[1]);
        }

        return widthMax * heightMax;
    }
}
