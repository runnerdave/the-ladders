package net.runnerdave.domain;

/**
 * Created by davidajimenez on 19/01/2017.
 */
public class Resume {
    private Integer id;
    private JobSeeker jobSeeker;
    private String skillsDescription;

    public Resume(Integer id, JobSeeker jobSeeker, String skillsDescription) {
        this.id = id;
        this.jobSeeker = jobSeeker;
        this.skillsDescription = skillsDescription;
    }
}
