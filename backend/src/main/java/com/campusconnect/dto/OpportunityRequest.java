package com.campusconnect.dto;

import com.campusconnect.entity.Opportunity;
import java.time.LocalDate;

public class OpportunityRequest {
    private String title;
    private String description;
    private Opportunity.OpportunityType type;
    private String companyName;
    private String location;
    private Opportunity.WorkMode workMode;
    private String salary;
    private String skillsRequired;
    private LocalDate deadline;

    public OpportunityRequest() {}

    public OpportunityRequest(String title, String description, Opportunity.OpportunityType type, String companyName, String location, Opportunity.WorkMode workMode, String salary, String skillsRequired, LocalDate deadline) {
        this.title = title;
        this.description = description;
        this.type = type;
        this.companyName = companyName;
        this.location = location;
        this.workMode = workMode;
        this.salary = salary;
        this.skillsRequired = skillsRequired;
        this.deadline = deadline;
    }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public Opportunity.OpportunityType getType() { return type; }
    public void setType(Opportunity.OpportunityType type) { this.type = type; }

    public String getCompanyName() { return companyName; }
    public void setCompanyName(String companyName) { this.companyName = companyName; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public Opportunity.WorkMode getWorkMode() { return workMode; }
    public void setWorkMode(Opportunity.WorkMode workMode) { this.workMode = workMode; }

    public String getSalary() { return salary; }
    public void setSalary(String salary) { this.salary = salary; }

    public String getSkillsRequired() { return skillsRequired; }
    public void setSkillsRequired(String skillsRequired) { this.skillsRequired = skillsRequired; }

    public LocalDate getDeadline() { return deadline; }
    public void setDeadline(LocalDate deadline) { this.deadline = deadline; }
}
