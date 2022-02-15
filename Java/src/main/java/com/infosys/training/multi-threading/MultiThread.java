public class MultiThread extends Thread {

    public static void main(String[] args) throws InterruptedException {
        MultiThread T1 = new MultiThread(); // Initiating a Thread class and creating a thread 
        MultiThread T2 = new MultiThread();
        System.out.println(T1.getState());// NEW
        T1.start();
        T1.join(); // thread class will wait until another thread completes its execution.
        T2.start();
        System.out.println(T2.getState()); // It Shows Running State
        try {
            T1.sleep(2000);
        } catch (Exception e) {

            e.printStackTrace();
        }
        System.out.println(T1.getState()); // Terminated
    }
    @Override
    public void run() {
    	try {
		    Thread.sleep(1000);
	   } catch (InterruptedException e) {
			e.printStackTrace();
		}
    	for (int i=0; i<=10; i++) {
    	System.out.println(i);
    	}
    	System.out.println( "State of thread - ");
    }

  }