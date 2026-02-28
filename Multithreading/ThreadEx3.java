package Multithreading;

class add extends Thread{
   public void run(){
       try {
           Thread.sleep(2000);
           System.out.println("res" + );
       } catch (InterruptedException e) {
           e.printStackTrace();
       }
       add(int[][] arr, int[][] arr2, int[][] res){
           for(int i=0;i<3;i++){
               for(int j=0;j<3;j++){
                   res[i][j] = arr[i][j] + arr2[i][j];
               }
           }
       }
   }

}


public class ThreadEx3 {

    public static void main(String[] args) throws InterruptedException {
        int[][] arr = {{1, 2,3}, {4, 5, 6}, {7, 8, 9}};
        int[][] arr2 = {{1, 2,3}, {4, 5, 6}, {7, 8, 9}};


        int [][] res = new int[3][3];

        add t1 = new add( arr,  arr2,  res);

        for(int[] i : res){
            i.join();
        }

    }
}
