package com.anil.jobtracker.controller;

import com.anil.jobtracker.model.JobApplication;
import com.anil.jobtracker.service.JobService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/jobs")
public class JobController {

    private final JobService service;

    public JobController(JobService service) {
        this.service = service;
    }

    // Browser test
    @GetMapping("/ping")
    public String ping() {
        return "Job Tracker backend is running";
    }

    // Browser test: show all jobs
    @GetMapping
    public Object listJobs() {
        return service.getAll();
    }

    // Browser test: show one job
    @GetMapping("/{id}")
    public Object getJob(@PathVariable int id) {
        JobApplication job = service.getById(id);
        if (job == null) return Map.of("error", "Job not found");
        return job;
    }
}
