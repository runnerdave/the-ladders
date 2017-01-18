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

Employers can post jobs.
Employers should be able to see a listing of the jobs they have posted.
Jobseekers can save jobs onsite for later viewing.
Jobseekers can apply to jobs posted by employers.
There are 2 different kinds of Jobs posted by employers: JReq and ATS.
JReq jobs require a resume to apply to them.
ATS jobs do not.
Jobseekers can not apply to a job with someone else’s resume.
Jobseekers should be able to apply to different jobs with different resumes.
Jobseekers should be able to see a listing of jobs they have saved for later viewing.
Jobseekers should be able to see a listing of the jobs for which they have applied.
Employers should be able to see jobseekers who have applied to their jobs by both job and day. If possible, we would like to be able to combine the 2 and see jobseekers who have applied to a given job on a given day.
TheLadders should be able to get a report of which jobseekers have applied to jobs on any given day.
TheLadders should be able to get the job application report in either csv or html format.
TheLadders should be able to ascertain jobseeker, job, employer and job application date from the job application report.
TheLadders should be able to see aggregate job application numbers by job and employer.
TheLadders should be able to see how many job applications failed and how many succeeded aggregated by job and employer.
Jobseekers, when displayed, should be displayed by their name.
Employers, when displayed, should be displayed by their name.
Jobs, when displayed, should be displayed with a title and the name of the employer who posted it.
TheLadders wants the system to be able to handle more than one job with the same title.
TheLadders wants the system to be able to handle more than one jobseeker with the same name.
TheLadders wants the system to be able to handle more than one employer with the same name.
