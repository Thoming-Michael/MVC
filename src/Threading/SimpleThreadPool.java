/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;

/**
 *
 * @author mthoming
 */
public class SimpleThreadPool {

    public static void mainOld(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++) {
            Runnable worker = new WorkerThread("Thread: " + i);
            executor.execute(worker);
          }

        executor.shutdown();
        while (!executor.isTerminated()) {
        }

        System.out.println("Finished all threads");
               
    }
    
}
