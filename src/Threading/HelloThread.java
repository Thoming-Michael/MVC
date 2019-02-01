/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 *
 * @author mthoming
 */
public class HelloThread extends Thread {

    @Override
    public void run() {
        System.out.println("This thread comes from a subclass and provides its "
                + "own implementation of run: " +Thread.currentThread().getName());
    }

    public static void mainOld(String args[]) {
        (new HelloThread()).start();
        (new HelloThread()).start();
        (new HelloThread()).start();
        (new HelloThread()).start();
        (new HelloThread()).start();
    }

}
