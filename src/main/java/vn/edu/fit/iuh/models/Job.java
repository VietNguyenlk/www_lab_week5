package vn.edu.fit.iuh.models;

import java.util.List;

public class Job {
    private long id;
    private String name;
    private String description;

    private List<JobSkill> jobSkills;
    private Company company;
}
