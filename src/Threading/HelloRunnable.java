/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *Example #3 from the PowerPoint slide
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/runthread.html
 * @author mthoming
 */
public class HelloRunnable implements Runnable {

    @Override
    public void run() {
        System.out.println("This thread uses a runnable: " +Thread.currentThread().getName());
    }

    public static void mainOld(String args[]) {
        (new Thread(new HelloRunnable())).start();
        (new Thread(new HelloRunnable())).start();
        (new Thread(new HelloRunnable())).start();
        (new Thread(new HelloRunnable())).start();
    }    
    
}
