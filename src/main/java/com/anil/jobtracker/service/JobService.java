package com.anil.jobtracker.service;

import com.anil.jobtracker.model.JobApplication;
import org.springframework.stereotype.Service;

import jakarta.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class JobService {

    private final List<JobApplication> jobs = new ArrayList<>();
    private int counter = 1;

    // Adds sample jobs automatically when app starts
    @PostConstruct
    public void seed() {
        addJob(new JobApplication(0, "Amazon", "Backend Engineer", "APPLIED"));
        addJob(new JobApplication(0, "Wells Fargo", "Java Developer", "INTERVIEW"));
    }

    public JobApplication addJob(JobApplication job) {
        job.setId(counter++);
        if (job.getStatus() == null || job.getStatus().isBlank()) {
            job.setStatus("APPLIED");
        }
        jobs.add(job);
        return job;
    }

    public List<JobApplication> getAll() {
        return jobs;
    }

    public JobApplication getById(int id) {
        for (JobApplication job : jobs) {
            if (job.getId() == id) return job;
        }
        return null;
    }
}
