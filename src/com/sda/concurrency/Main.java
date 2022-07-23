package com.sda.concurrency;

public class Main {

    public static void main(String[] args) {

        Runnable r = () -> {
            Lotto lotto_1 = new Lotto();
            lotto_1.startLotto(50);
        };
        Thread thread = new Thread(r);
        thread.start();


        Thread thread1 = new Thread(
                () -> {
                    Lotto lotto_1 = new Lotto();
                    lotto_1.startLotto(50);
                });
        thread1.start();

        Lotto lotto = new Lotto();
        lotto.startLotto(50);


    }
}
