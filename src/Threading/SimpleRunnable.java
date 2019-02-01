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
public class SimpleRunnable implements Runnable{

    public void run(){
        for (int i = 0; i < 3; i++) {
            System.out.println("Thread id: "
                +Thread.currentThread().getName());
            try {
                Thread.currentThread().sleep(100);
            }
            catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
