/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 * Example from pg 57 of "Doing more with Java"
 * @author mthoming
 */
public class SimpleRunnableStarter {

    public static void mainOld(String[] args){
        for (int threadCnt = 0; threadCnt < 3; threadCnt++) {
            SimpleRunnable aSimpleRunnable =
        new SimpleRunnable();
            Thread aSimpleThread = new Thread(aSimpleRunnable);
            aSimpleThread.start();
        }
    }
    
}
