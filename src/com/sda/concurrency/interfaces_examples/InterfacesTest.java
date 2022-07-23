package com.sda.concurrency.interfaces_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class InterfacesTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<Integer> myComputation = () -> (int) (100 * Math.random());
        FutureTask<Integer> someTask = new FutureTask<>(myComputation);

        Thread thread = new Thread(someTask);
        thread.start();

        int result = someTask.get();

        System.out.println(result);

        List<Future<Integer>> futureResults = new ArrayList<>();

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            Callable<Integer> integerCallable = () -> (int) (100 * Math.random());
            FutureTask<Integer> newTask = new FutureTask<>(integerCallable);
            Thread newThread = new Thread(newTask);
            newThread.start();
            futureResults.add(newTask);
            sum += newTask.get();
        }
        System.out.println(sum + "\n");

        for (Future<Integer> f : futureResults) {
            System.out.print(f.get() + " ");
        }

        List<Callable<Integer>> callableList = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            Callable<Integer> integerCallable = () -> (int) (100 * Math.random());
            callableList.add(integerCallable);
        }

        ExecutorService numberService = Executors.newCachedThreadPool();
        futureResults = numberService.invokeAll(callableList);

        sum = 0;
        for (Future<Integer> f : futureResults) {
           sum += f.get();
        }
        System.out.println("\n" + "\n" + sum + "\n");

        for (Future<Integer> f : futureResults) {
            System.out.print(f.get() + " ");
        }
    }

}
