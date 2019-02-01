/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 * Example from pg 56 of "Doing more with Java"
 * @author mthoming
 */
public class SillyThread extends Thread {

    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread id: "
                +Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(1000);
                }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void mainOld(String[] args){
        for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
            SillyThread aSillyThread = new SillyThread();
            aSillyThread.start();
        }
    }
    
}
