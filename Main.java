import java.util.Random;
import java.util.Scanner;

/**
 * Lab 9: Thread Barrier
 * 
 * Main class
 * 
 */
public class Main {

    private static int threadCount = 20 ;
    private static final int barrierSize = 10 ;
    private static final int sleepTime = 500 ;
	
    /**
    * Main program
    *    Create a barrier
    *    Create multiple instances of Process and run them in threads.
    *	 threadCount should be provided as command line argument when you run Main
    * @param args
    */
    public static void main(String[] args) {
		                
        // Create a random source for randomly setting the sleep time of the 
        //  process instances
        Random r = new Random() ;
 
        // Print out the number of threads
        System.out.println("Number of threads = " + threadCount);
 
        // Create the barrier
        Barrier barrier = new Barrier(barrierSize) ;

        // Create and start the process threads
        // There are threadCount threads
        
        // Add code here
        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of threads to be created");
        //Updates the number of threads to run.
        threadCount = input.nextInt();

        if (threadCount < barrierSize) {
            System.out.println("The number of threads is less than the barrier size");
            System.exit(0);
        } else {
            
        }

        //Output code
        System.out.println("Number of threads = " + threadCount);

        //Creates the processes
        for (int i = 0; i < threadCount; i++) {
            Process p = new Process(barrier, i, r.nextInt(sleepTime));
            p.run();
            // Thread t = new Thread(p);
            // t.start();
            //For debugging purposes
            System.out.println("Thread " + i + " started");
        }

        
    }
}
