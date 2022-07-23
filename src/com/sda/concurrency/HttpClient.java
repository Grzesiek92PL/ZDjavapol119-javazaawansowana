package com.sda.concurrency;

public class HttpClient {

    public static void main(String[] args) {
        HttpAction httpAction = new HttpAction();

        //W tym samym wątku
        httpAction.run();

        //Tworzy nowy wątek
        httpAction.start();

        //W tym samym wątku
        Runnable r = () -> System.out.println("Wątek przez klasę anonimową");
        r.run();

        //Tworzy nowy wątek
        Thread myThread = new Thread(r);
        myThread.start();
    }
}
