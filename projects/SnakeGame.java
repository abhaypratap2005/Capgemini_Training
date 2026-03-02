package projects;

import java.util.*;

public class SnakeGame {

    static final int SIZE = 10;
    static int[][] board = new int[SIZE][SIZE];


    static ArrayList<int[]> snake = new ArrayList<>();

    static int headRow = 0, headCol = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        // Initialize snake
        snake.add(new int[]{0, 0});
        board[0][0] = 1;

        placeFood();

        while (true) {
            printBoard();

            System.out.println("\n1-Up  2-Down  3-Left  4-Right");
            int choice = sc.nextInt();

            int newRow = headRow;
            int newCol = headCol;

            if (choice == 1) newRow--;
            else if (choice == 2) newRow++;
            else if (choice == 3) newCol--;
            else if (choice == 4) newCol++;
            else continue;

            // Boundary check
            if (newRow < 0 || newRow >= SIZE || newCol < 0 || newCol >= SIZE) {
                System.out.println("Game Over! Hit wall.");
                break;
            }

            // Self collision
            if (board[newRow][newCol] == 1) {
                System.out.println("Game Over! Hit yourself.");
                break;
            }

            // Add new head at index 0
            snake.add(0, new int[]{newRow, newCol});

            if (board[newRow][newCol] == 2) {
                placeFood(); // grow snake
            } else {
                // Remove tail
                int[] tail = snake.remove(snake.size() - 1);
                board[tail[0]][tail[1]] = 0;
            }

            headRow = newRow;
            headCol = newCol;
            board[headRow][headCol] = 1;
        }

        System.out.println("Final Snake Length: " + snake.size());
    }

    static void placeFood() {
        Random rand = new Random();
        int r, c;

        while (true) {
            r = rand.nextInt(SIZE);
            c = rand.nextInt(SIZE);

            if (board[r][c] == 0) {
                board[r][c] = 2;
                break;
            }
        }
    }

    static void printBoard() {
        System.out.println("\n--------------------");
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (board[i][j] == 1)
                    System.out.print(" S ");
                else if (board[i][j] == 2)
                    System.out.print(" F ");
                else
                    System.out.print(" . ");
            }
            System.out.println();
        }
    }
}
