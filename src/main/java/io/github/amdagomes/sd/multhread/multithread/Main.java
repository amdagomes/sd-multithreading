package io.github.amdagomes.sd.multhread.multithread;

import io.github.amdagomes.sd.multhread.multithread.buffer.Buffer;
import io.github.amdagomes.sd.multhread.multithread.buffer.BufferBlockQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        Buffer buffer = new BufferBlockQueue();

        executorService.execute(new Produtor(buffer));
        executorService.execute(new Consumidor(buffer));

        executorService.shutdown();
    }
}
