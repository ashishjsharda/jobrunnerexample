package org.example;

import org.jobrunr.configuration.JobRunr;
import org.jobrunr.scheduling.BackgroundJob;
import org.jobrunr.storage.InMemoryStorageProvider;

public class Main {
    public static void main(String[] args) {

        JobRunr.configure().useStorageProvider
                (new InMemoryStorageProvider()).useBackgroundJobServer().useDashboard().initialize();
        BackgroundJob.enqueue(() -> System.out.println("Hello World!"));
    }
}