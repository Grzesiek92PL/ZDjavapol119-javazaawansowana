package com.sda.concurrency.atomics;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class AtomicsExamplee {

    public static void main(String[] args) throws InterruptedException, ExecutionException {


        AtomicInteger atomicInteger = new AtomicInteger(0);

        List<Callable<Integer>> actions = new ArrayList<>();

        for (int i = 0; i < 100; i++) {
            Callable<Integer> action = () -> atomicInteger.addAndGet(1);
            actions.add(action);
        }

        ExecutorService executor = Executors.newFixedThreadPool(5);
        List<Future<Integer>> myList = executor.invokeAll(actions);

        System.out.println(atomicInteger.get());

        System.out.println(" ");

        for (Future f : myList) {
            System.out.print(f.get() + " ");
        }
    }
}
