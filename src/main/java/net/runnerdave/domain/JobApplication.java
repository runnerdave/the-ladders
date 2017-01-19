package net.runnerdave.domain;

import java.time.LocalDateTime;

/**
 * Created by davidajimenez on 19/01/2017.
 */
public class JobApplication {
    private Job job;
    private JobSeeker jobSeeker;
    private Resume resume;
    private LocalDateTime applicationDate;


    public JobApplication(Job job, JobSeeker jobSeeker, Resume resume) {
        this.job=job;
        this.jobSeeker=jobSeeker;
        this.resume=resume;
        this.applicationDate = LocalDateTime.now();
    }
}
