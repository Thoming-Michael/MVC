/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threading;

/**
 * example from https://www.callicoder.com/java-executor-service-and-thread-pool-tutorial/
 * @author mthoming
 */
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorExample {
    public static void mainOld(String[] args) {
        System.out.println("Inside : " + Thread.currentThread().getName());

        System.out.println("Creating Executor Service...");
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        System.out.println("Creating a Runnable...");
        Runnable runnable = () -> {
            System.out.println("Inside : " + Thread.currentThread().getName());
        };

        System.out.println("Submit the task specified by the runnable to the executor service.");
        executorService.submit(runnable);
        
        System.out.println("Shutting down the executor");
        executorService.shutdown();
    }
}
