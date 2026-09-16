package com.campusconnect.dto;

import java.util.List;

public class ResumeMatchResponse {
    private int matchScore;
    private List<String> matchingSkills;
    private List<String> missingSkills;
    private List<String> studentSkills;
    private List<String> requiredSkills;

    public ResumeMatchResponse() {}

    public ResumeMatchResponse(int matchScore, List<String> matchingSkills, List<String> missingSkills, List<String> studentSkills, List<String> requiredSkills) {
        this.matchScore = matchScore;
        this.matchingSkills = matchingSkills;
        this.missingSkills = missingSkills;
        this.studentSkills = studentSkills;
        this.requiredSkills = requiredSkills;
    }

    public int getMatchScore() { return matchScore; }
    public void setMatchScore(int matchScore) { this.matchScore = matchScore; }

    public List<String> getMatchingSkills() { return matchingSkills; }
    public void setMatchingSkills(List<String> matchingSkills) { this.matchingSkills = matchingSkills; }

    public List<String> getMissingSkills() { return missingSkills; }
    public void setMissingSkills(List<String> missingSkills) { this.missingSkills = missingSkills; }

    public List<String> getStudentSkills() { return studentSkills; }
    public void setStudentSkills(List<String> studentSkills) { this.studentSkills = studentSkills; }

    public List<String> getRequiredSkills() { return requiredSkills; }
    public void setRequiredSkills(List<String> requiredSkills) { this.requiredSkills = requiredSkills; }
}
