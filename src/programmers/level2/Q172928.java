package programmers.level2;

public class Q172928 {
    static class Robot {
        int x;
        int y;

        public Robot(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return this.x;
        }

        public int getY() {
            return this.y;
        }

        public void move(String direction, int moveIndex) {
            switch (direction) {
                case "W":
                    this.y -= moveIndex;
                    break;
                case "N":
                    this.x -= moveIndex;
                    break;
                case "E":
                    this.y += moveIndex;
                    break;
                case "S":
                    this.x += moveIndex;
                    break;
            }
        }
    }

    public static void main(String[] args) {
        String[] park = {"OSO", "OOO", "OXO", "OOO"};
        String[] routes = {"E 2", "S 3", "W 1"};
        int[] answer = solution(park, routes);
        System.out.println(answer[0] + " " + answer[1]);
    }

    private static int[] solution(String[] park, String[] routes) {
        char[][] parkMatrix = new char[50][50];
        int startX = 0;
        int startY = 0;
        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                char point = park[i].charAt(j);
                if (point == 'S') {
                    startX = i;
                    startY = j;
                }
                parkMatrix[i][j] = point;
            }
        }

        Robot robot = new Robot(startX, startY);

        // 이동하기
        for (String route : routes) {
            String[] moveArray = route.split(" ");
            String direction = moveArray[0];
            int index = Integer.parseInt(moveArray[1]);

            boolean isMove = true;
            for (int i = 0; i < index; i++) {
                if (cantMove(parkMatrix, direction, robot.getX(), robot.getY())) {
                    isMove = false;
                    break;
                }
            }
            if (isMove) {
                robot.move(direction, index);
            }
        }


        int[] answer = {robot.getX(), robot.getY()};
        return answer;
    }

    private static boolean cantMove(char[][] parkMatrix, String direction, int x, int y) {
        switch (direction) {
            case "W":
                y -= 1;
                break;
            case "N":
                x -= 1;
                break;
            case "E":
                y += 1;
                break;
            case "S":
                x += 1;
                break;
        }
        return parkMatrix[x][y] == 'X' || parkMatrix[x][y] == '0';
    }
}
