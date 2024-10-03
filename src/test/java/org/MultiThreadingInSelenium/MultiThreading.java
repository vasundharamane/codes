package org.MultiThreadingInSelenium;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;


public class MultiThreading {

    private static final int NUM_THREADS = 5;
    private static final ExecutorService executor = Executors.newFixedThreadPool(NUM_THREADS);

    @Test
    public void LoginGoogle() {
        executor.execute(() -> {
            System.out.println("Login google " + Thread.currentThread().getName());
        });
    }

    @Test
    public void LoginAmazon() {
        executor.execute(() -> {
            System.out.println("login to amazon " + Thread.currentThread().getName());
        });
    }

    @AfterClass
    public void TearDown() throws InterruptedException {
        executor.shutdown();
        if (executor.awaitTermination(1, TimeUnit.MINUTES)) {
            System.out.println("All processes closed");
        } else {
            System.out.println("All processes could closed");
        }
    }
}
