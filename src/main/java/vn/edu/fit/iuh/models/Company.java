package vn.edu.fit.iuh.models;

import java.util.List;

public class Company {
    private  long id;
    private String name;
    private String about;
    private String phone;
    private String webUrl;
    private String email;
    private Address address;
    private List<Job> jobs;
}
