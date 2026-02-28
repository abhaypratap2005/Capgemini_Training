package Multithreading;

import java.util.*;

class Downloader extends Thread{
    private String images;

    Downloader(String images){
        this.images = images;
    }

        public void run(){
            try {
                Thread.sleep(2000);
                System.out.println("Downloading" + images);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
       
    }


public class ThreadEx2 {

    public static void main(String[] args) throws  InterruptedException{
        String images[] = {"image1", "image2", "image3"};
        List<Thread> list = new ArrayList<>();

        for(int i=0;i<images.length;i++){
            Downloader loader = new Downloader(images[i]);
            list.add(loader);
            loader.start();
        }


        for(Thread t: list){
            t.join();
        }
    }
}
