# Object Callistenics with the Ladders problem

The original problem can be found at: https://github.com/TheLadders/object-calisthenics

## The Problem

You have been tasked with writing a new Job Application domain for TheLadders. 
Requirements for this system are below:

We have 5 main entities in this domain:

* Jobs
* Jobseekers
* Employers
* Resumes
* Job Applications

Here are the interactions:

1. Employers can post jobs.
2. Employers should be able to see a listing of the jobs they have posted.
3. Jobseekers can save jobs onsite for later viewing.
4. Jobseekers can apply to jobs posted by employers.
5. There are 2 different kinds of Jobs posted by employers: JReq and ATS.
JReq jobs require a resume to apply to them.
ATS jobs do not.
6. Jobseekers can not apply to a job with someone else’s resume.
7. Jobseekers should be able to apply to different jobs with different resumes.
8. Jobseekers should be able to see a listing of jobs they have saved for later viewing.
9. Jobseekers should be able to see a listing of the jobs for which they have applied.
10. Employers should be able to see jobseekers who have applied to their jobs by both job and day. If possible, we would like to be able to combine the 2 and see jobseekers who have applied to a given job on a given day.
11. TheLadders should be able to get a report of which jobseekers have applied to jobs on any given day.
12. TheLadders should be able to get the job application report in either csv or html format.
13. TheLadders should be able to ascertain jobseeker, job, employer and job application date from the job application report.
14. TheLadders should be able to see aggregate job application numbers by job and employer.
15. TheLadders should be able to see how many job applications failed and how many succeeded aggregated by job and employer.
16. Jobseekers, when displayed, should be displayed by their name.
17. Employers, when displayed, should be displayed by their name.
18. Jobs, when displayed, should be displayed with a title and the name of the employer who posted it.
19. TheLadders wants the system to be able to handle more than one job with the same title.
20. TheLadders wants the system to be able to handle more than one jobseeker with the same name.
21. TheLadders wants the system to be able to handle more than one employer with the same name.

## The Solution
### 1st approach
A class per entity in the domain

## Discussion
1. The type of job is represented by a boolean: **true** for JReq (requires Resume) **false** for ATS.
2. How to validate that a **JobApplication** has a resume attached or not based on the **jReq** field for the **Job**.
3. Evaluate the design decision where a job contains a list of applicants.