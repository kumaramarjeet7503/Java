public class Counter {
    private int count = 1 ;

    public synchronized void incrementAndPrint()
    {
        System.out.println(Thread.currentThread().getName()+": "+count);
        count++ ;
    }
}
