package lambdas.threads;

public class Threads {
    public static void main(String[] args) {

        Runnable t1 = new Trabalho1();
        Runnable t2 = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Tarefa #02 " + i);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
            }
        };

        Runnable t3 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("Tarefa #03 " + i);
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        };

       Thread trabalho1 = new Thread(t1);
       Thread trabalho2 = new Thread(t2);
       Thread trabalho3 = new Thread(t3);

       trabalho1.start();
       trabalho2.start();
       trabalho3.start();
    }
}
