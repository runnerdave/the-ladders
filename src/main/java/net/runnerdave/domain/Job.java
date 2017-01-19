package net.runnerdave.domain;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by davidajimenez on 19/01/2017.
 */
public class Job {
    private Integer id;
    private Employer employer;
    private JobType type;
    private List<JobSeeker> jobSeekerList;
    public Job(Integer id, Employer employer, JobType type, List<JobSeeker> jobSeekerList) {
        this.id = id;
        this.employer = employer;
        this.type = type;
        this.jobSeekerList = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    List<JobSeeker> listJobSeekers() {
        List<JobSeeker> safeJobSeekerList = new ArrayList<JobSeeker>(this.jobSeekerList);
        return safeJobSeekerList;
    }

    public void addJobSeeker(JobSeeker jobSeeker) {
        jobSeekerList.add(jobSeeker);
    }

    public boolean requiresResume() {
        return type.requiresResume();

    }
}
