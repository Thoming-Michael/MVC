/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 * from pg 59 of "Doing more with Java"
 * The code works, but it seems to hang at the end and never finishes
 * @author mthoming
 */
public class SimpleThreadPool2 {

    public static void mainOld(String[] args) {
        Executor anExecutor = Executors.newCachedThreadPool();
        for(int threadCnt = 0; threadCnt < 3; threadCnt++){
            SimpleRunnable aSillyRunnable =
                new SimpleRunnable();
            anExecutor.execute(aSillyRunnable);
        }

        try {
            Thread.sleep(5000);
            System.out.println("Done Sleeping");
            for(int threadCnt = 0; threadCnt < 3; threadCnt++){
                SimpleRunnable aSimpleRunnable =
                    new SimpleRunnable();
                anExecutor.execute(aSimpleRunnable);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    } 
}
