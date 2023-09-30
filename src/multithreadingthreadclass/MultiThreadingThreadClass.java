/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreadingthreadclass;

/**
 *
 * @author Akim Nyoni
 */
public class MultiThreadingThreadClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        for(int j=1;j<=4;j++){
            MultiThreads t = new MultiThreads(j);
            t.start();
            //t.join();
        }
        
        
    }
    
}
