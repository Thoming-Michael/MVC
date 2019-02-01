/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.concurrent.TimeUnit;
import java.lang.Runnable;
/**
 *
 * @author mthoming
 */
public class ThreadsAndRunnables {

    public static void mainOld(String[] args) {
        
        Runnable task = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println("Hello " + threadName);
        };
        
        task.run();
        task.run();
        task.run();
        
        Thread thread = new Thread(task);
        thread.start();
        Thread thread2 = new Thread(task);
        thread2.start();
        Thread thread3 = new Thread(task);
        thread3.start();
        Thread thread4 = new Thread(task);
        thread4.start(); 
        
        System.out.println("Done!");
        
        Runnable runnable = () -> {
            try {
            String name = Thread.currentThread().getName();
            System.out.println("Foo " + name);
            TimeUnit.SECONDS.sleep(2);
            System.out.println("Bar " + name);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        };

        Thread thread5 = new Thread(runnable);
        thread5.start();
    }
    
}
