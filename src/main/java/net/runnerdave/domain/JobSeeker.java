package net.runnerdave.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by davidajimenez on 19/01/2017.
 */
public class JobSeeker {
    private Integer id;
    private String name;
    private Map<Integer, Job> interestingJobs;
    private Map<Integer, JobApplication> applications;
    private Map<Integer, Resume> resumes;

    public JobSeeker(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.interestingJobs = new HashMap<>();
        this.applications = new HashMap<>();
        this.resumes = new HashMap<>();
    }

    void applyForJob(Job job, Resume resume) {
        JobApplication application = new JobApplication(job, this, resume);
        applications.put(job.getId(), application);
    }

    void createAndSaveResume(Integer resumeId, String specializedSkillsDescription) {
        Resume resume = new Resume(resumeId, this, specializedSkillsDescription);
        resumes.put(resumeId, resume);
    }

    void saveJobForLaterViewing(Job job) {
        interestingJobs.put(job.getId(), job);
    }
}
