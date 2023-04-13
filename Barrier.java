
/**
 * Lab 9: Thread Barrier
 * Barrier Class
 *
 * Processes join the barrier and are held until barrierSize processes have
 * joined.
 *
 *
 */
public class Barrier {

    /**
     * Size of the barrier, which is the minimum number of processes to proceed.
     */
    private int barrierSize;

    /**
     * Current Number of processes added to the barrier
     */
    private int currentCount;

    public synchronized void incrementCount() {
        this.currentCount++;
    }

    /**
     * Create a barrier of a given size
     *
     * @param size
     */
    public Barrier(int size) {
        barrierSize = size;
        System.out.println("Barrier size = " + barrierSize);
    }

    /**
     * Processes join at barrier and either wait or are allowed past.
     *
     * @param p The process joining
     */

    public synchronized void waitProcess()  throws InterruptedException{
        
        //Until barrier breaks
        while (currentCount < barrierSize) {
            wait();
        }

        //Opens barrier becuase all processes are notified to continue running.
        notifyAll();
    }

    public void joinBarrier(Process p) throws InterruptedException {
        //output and stuff
        System.out.println(p.getName() + " waiting on barrier");
        //Syncronized increment
        incrementCount();
        //hold all processes until barrier breaks
        waitProcess();
        
        //Output code
        System.out.println(p.getName() + " passed the barrier");

        
    }
}
