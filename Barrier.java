
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
    public void joinBarrier(Process p) {
        System.out.println(p.getName() + " waiting on barrier");

        // add code here

        System.out.println(p.getName() + " passed the barrier");
    }
}
