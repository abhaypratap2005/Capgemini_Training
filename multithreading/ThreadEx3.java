package multithreading;

class Add extends Thread {

    int[][] arr;
    int[][] arr2;
    int[][] res;

    // Constructor
    Add(int[][] arr, int[][] arr2, int[][] res) {
        this.arr = arr;
        this.arr2 = arr2;
        this.res = res;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);

            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    res[i][j] = arr[i][j] + arr2[i][j];
                }
            }

            System.out.println("Addition Completed");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class ThreadEx3 {

    public static void main(String[] args) throws InterruptedException {

        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] res = new int[3][3];

        Add t1 = new Add(arr, arr2, res);

        t1.start();   // Start thread
        t1.join();    // Wait for thread to finish

        // Print result
        for (int[] row : res) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}