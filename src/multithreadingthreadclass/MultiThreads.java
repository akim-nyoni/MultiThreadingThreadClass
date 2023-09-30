/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreadingthreadclass;

/**
 *
 * @author Akim Nyoni
 */
public class MultiThreads extends Thread {

    private final int nameT;
    public MultiThreads(int nameT){
        this.nameT = nameT;
    }
    public void run(){
        for(int i=1; i<=5; i++){
            System.out.println("Document "+i+ " Printed by Thread: " + nameT);
        }
    }
    
}
