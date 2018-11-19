package com.devstr.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Project {

    private int projectId;
    private String projectName;
    private int projectManagerId;
    private int technicalManagerId;
    private Set<Integer> developersId;
    private Set<Integer> issuesId;
    private String repoName;
    private String gitLogin;
    private String gitPassword;
    private String jiraLogin;
    private String jiraPassword;
    private Date fromDate;
    private Date toDate;
    private boolean status;
    private Set<Integer> reviewsId;

    private Project() {
    }

    public int getProjectId() {
        return projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public int getProjectManagerId() {
        return projectManagerId;
    }

    public int getTechnicalManagerId() {
        return technicalManagerId;
    }

    public Set<Integer> getDevelopersId() {
        return developersId;
    }

    public Set<Integer> getIssuesId() {
        return issuesId;
    }

    public String getRepoName() {
        return repoName;
    }

    public String getGitLogin() {
        return gitLogin;
    }

    public String getGitPassword() {
        return gitPassword;
    }

    public String getJiraLogin() {
        return jiraLogin;
    }

    public String getJiraPassword() {
        return jiraPassword;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public boolean isStatus() {
        return status;
    }

    public Set<Integer> getReviewsId() {
        return reviewsId;
    }

    public void setReviewId(int reviewId) {
        if (this.reviewsId == null) {
            this.reviewsId = new HashSet<>();
        }
        this.reviewsId.add(reviewId);
    }

    public void setReviewsId(Set<Integer> reviewsId) {
        if (this.reviewsId == null) {
            this.reviewsId = new HashSet<>();
        }
        this.reviewsId.addAll(reviewsId);
    }

    public static ProjectBuilder builder() {
        return new Project().new ProjectBuilder();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Project project = (Project) o;

        return getProjectId() == project.getProjectId();
    }

    @Override
    public int hashCode() {
        return getProjectId();
    }

    public class ProjectBuilder {

        private ProjectBuilder() {
        }

        public ProjectBuilder setProjectId(int id) {
            Project.this.projectId = id;
            return this;
        }

        public ProjectBuilder setProjectName(String name) {
            Project.this.projectName = name;
            return this;
        }

        public ProjectBuilder setProjectManagerId(int id) {
            Project.this.projectManagerId = id;
            return this;
        }

        public ProjectBuilder setTechnicalManagerId(int id) {
            Project.this.technicalManagerId = id;
            return this;
        }

        public ProjectBuilder setDeveloperId(int id) {
            if (Project.this.developersId == null) {
                Project.this.developersId = new HashSet<>();
            }
            Project.this.developersId.add(id);
            return this;
        }

        public ProjectBuilder setDevelopersId(Set<Integer> ids) {
            if (Project.this.developersId == null) {
                Project.this.developersId = new HashSet<>();
            }
            Project.this.developersId.addAll(ids);
            return this;
        }

        public ProjectBuilder setIssueId(int id) {
            if (Project.this.issuesId == null) {
                Project.this.issuesId = new HashSet<>();
            }
            Project.this.issuesId.add(id);
            return this;
        }

        public ProjectBuilder setIssuesId(Set<Integer> ids) {
            if (Project.this.issuesId == null) {
                Project.this.issuesId = new HashSet<>();
            }
            Project.this.issuesId.addAll(ids);
            return this;
        }

        public ProjectBuilder setRepoName(String repoName) {
            Project.this.repoName = repoName;
            return this;
        }

        public ProjectBuilder setGitLogin(String login) {
            Project.this.gitLogin = login;
            return this;
        }

        public ProjectBuilder setGitPassword(String password) {
            Project.this.gitPassword = password;
            return this;
        }

        public ProjectBuilder setJiraLogin(String login) {
            Project.this.jiraLogin = login;
            return this;
        }

        public ProjectBuilder setJiraPassword(String password) {
            Project.this.jiraPassword = password;
            return this;
        }

        public ProjectBuilder setFromDate(Date fromDate) {
            Project.this.fromDate = fromDate;
            return this;
        }

        public ProjectBuilder setToDate(Date toDate) {
            Project.this.toDate = toDate;
            return this;
        }

        public ProjectBuilder setStatus(boolean status) {
            Project.this.status = status;
            return this;
        }

        public ProjectBuilder setReviewId(int reviewId) {
            if (Project.this.reviewsId == null) {
                Project.this.reviewsId = new HashSet<>();
            }
            Project.this.reviewsId.add(reviewId);
            return this;
        }

        public ProjectBuilder setReviewsId(Set<Integer> reviewsId) {
            if (Project.this.reviewsId == null) {
                Project.this.reviewsId = new HashSet<>();
            }
            Project.this.reviewsId.addAll(reviewsId);
            return this;
        }

        public Project build() {
            return Project.this;
        }

    }

}
