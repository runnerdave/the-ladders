package net.runnerdave.domain;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by davidajimenez on 19/01/2017.
 */
public class Employer {
    private String name;
    private Integer id;
    private Map<Integer, Job> jobs;

    public Employer(String name, Integer id, Map<Integer, Job> jobs) {
        this.name = name;
        this.id = id;
        this.jobs = new HashMap<>();
    }

    void postJob(Job job) {
        jobs.put(job.getId(), job);
    }

    List<Job> listJobs() {
        List<Job> listOfJobs = new ArrayList<>();
        jobs.forEach((k,v)->{
            listOfJobs.add(v);
        });
        return listOfJobs;
    }
}
