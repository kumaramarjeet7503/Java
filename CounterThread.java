import Counter ;
public class CounterThread extends Thread {

    private Counter counter ;

    public CounterThread(Counter counter)
    {
        this.counter = counter ;
    }

    @Override
    public void run() {

            for (int i = 0; i < 5; i++) {
                counter.incrementAndPrint();
            }
        
      

        
    }
    
}
