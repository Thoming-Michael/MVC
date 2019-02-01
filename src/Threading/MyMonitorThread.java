/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

import java.util.concurrent.ThreadPoolExecutor;

/**
 * Example 2 from the PowerPoint slide
 * section #2 on the site, but can't get it working
 * https://www.javacodegeeks.com/2013/01/java-thread-pool-example-using-executors-and-threadpoolexecutor.html
 *
 * @author mthoming
 */
public class MyMonitorThread {

    private final ThreadPoolExecutor executor;

    private final int seconds;

    private boolean run=true;

    public MyMonitorThread(ThreadPoolExecutor executor, int delay)

    {
        this.executor = executor;
        this.seconds=delay;
    }

    public void shutdown(){
        this.run=false;
    }

    //@Override
    public void run()
    {
        while(run){
                System.out.println(
                    String.format("[monitor] [%d/%d] Active: %d, Completed: %d, Task: %d, isShutdown: %s, isTerminated: %s",
                        this.executor.getPoolSize(),
                        this.executor.getCorePoolSize(),
                        this.executor.getActiveCount(),
                        this.executor.getCompletedTaskCount(),
                        this.executor.getTaskCount(),
                        this.executor.isShutdown(),
                        this.executor.isTerminated()));
                try {
                    Thread.sleep(seconds*1000);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                 }
         }

    }
    
}
