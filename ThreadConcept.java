import Counter ;

import CounterThread ;

public class ThreadConcept {
    public static void main(String[] args) {
        
        Counter counter = new Counter() ;
        CounterThread thread1 = new CounterThread(counter) ;
        CounterThread thread2 = new CounterThread(counter) ;

        thread1.start();
        thread2.start();
        System.out.println("done");

    }
}
