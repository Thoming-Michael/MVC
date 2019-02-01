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
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class WorkerPool {

  public static void mainOld(String args[]) throws InterruptedException{

      //RejectedExecutionHandler implementation
      RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();

      //Get the ThreadFactory implementation to use
      ThreadFactory threadFactory = Executors.defaultThreadFactory();

      //creating the ThreadPoolExecutor
      ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);

      //start the monitoring thread
      MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);
      Thread monitorThread = new Thread((Runnable) monitor);
      monitorThread.start();

      //submit work to the thread pool
      for(int i=0; i<10; i++){
          executorPool.execute(new WorkerThread("cmd"+i));
      }

      Thread.sleep(30000);

      //shut down the pool
      executorPool.shutdown();

      //shut down the monitor thread
      Thread.sleep(5000);
      monitor.shutdown();

   }   
}
