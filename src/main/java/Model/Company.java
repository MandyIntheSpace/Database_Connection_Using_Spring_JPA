package Model;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class Company {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private int duration;
    private String profile;
    private int stipend;
    private boolean workFromHome;

    public Company() {

    }
    public Company(String name, int duration, String profile, int stipend,
                   boolean workFromHome) {
        this.name = name;
        this.duration = duration;
        this.profile = profile;
        this.stipend = stipend;
        this.workFromHome = workFromHome;
    }
    public int getId() {
        return id;
    }
    public String name() {
        return name;
    }
    public int getDuration() {
        return duration;
    }
    public String getProfile() {
        return profile;
    }
    public int getStipend() {
        return stipend;
    }
    public boolean isWorkFromHome() {
        return workFromHome;
    }
}
