class Volatilekeyword {
    // Declaring the variable as volatile
    private static volatile boolean flag = false;

    
    static class Thread1 extends Thread {
        public void run() {
            try {
                Thread.sleep(1000); 
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            flag = true; 
            System.out.println("Thread1: flag set to true");
        }
    }


    static class Thread2 extends Thread {
        public void run() {
            while (!flag) {
                
            }
            System.out.println("Thread2: Detected flag change, flag is true");
        }
    }

    public static void main(String[] args) throws InterruptedException {
        
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();

        
        t1.start();
        t2.start();

       
        t1.join();
        t2.join();
    }
}
