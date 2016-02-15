package com.asku.thread;
import java.util.concurrent.TimeUnit;

/**
 * Java Program to demonstrate how to stop a thread in Java.
 * There is a stop() method in Thread class but its deprecated 
 * because of deadlock and other issue, but its easy to write
 * your own stop() method to stop a thread in Java. 
 * 
 * @author java67
 */

public class ThreadStopDemo {

    public static void main(String args[]) throws InterruptedException {
        Server myServer = new Server();

        Thread t1 = new Thread(myServer, "T1");
        t1.start();
        
        
        TimeUnit.MILLISECONDS.sleep(50);
        
        //Now, let's stop our Server thread
        System.out.println(Thread.currentThread().getName() + " is stopping Server thread");
        myServer.stop();
        
        //Let's wait to see server thread stopped 
        TimeUnit.MILLISECONDS.sleep(50);
        
        System.out.println(Thread.currentThread().getName() + " is finished now");
        
        
    }
}

class Server implements Runnable{
    private volatile boolean exit = false;
    
    public void run() {
        while(!exit){
        	System.out.println("exit======="+exit);
            System.out.println("Server is running.....");
        }
        
        System.out.println("Server is stopped....");
    }
    
    public void stop(){
    	System.out.println("Server.stop()======called");
        exit = true;  //original
        //exit = false;  //asku done
    }
}


