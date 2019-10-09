package java_base.demo.thread.executor;

import java.util.concurrent.*;

public class ExecutorDemo{


    public static void main(String [] args){



    }

    public void executorPool(){

        /**
         *  executors first pool type
         *
         */
        ExecutorService executorService  = Executors.newFixedThreadPool(3);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        Future<?> submit = executorService.submit(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        /**
         * executors second pool type
         *
         */
        ExecutorService executorSingle = Executors.newSingleThreadExecutor();

        executorSingle.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        Future<?> result = executorSingle.submit(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        /**
         *  executors third pool type
         *
         */
        ExecutorService executorCache = Executors.newCachedThreadPool();

        Future<?> submit1 = executorCache.submit(new Runnable() {
            @Override
            public void run() {
                //todo     
            }
        });

        executorCache.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        /**
         *  executors fourth pool type
         *
         */
        ExecutorService schaduledPool = Executors.newScheduledThreadPool(5);

        schaduledPool.execute(new Runnable() {
            @Override
            public void run() {
                //todo
            }
        });

        Future submit2 = schaduledPool.submit(new Callable() {
            @Override
            public Object call() throws Exception {
                //todo
                return null;
            }
        });


    }

}






