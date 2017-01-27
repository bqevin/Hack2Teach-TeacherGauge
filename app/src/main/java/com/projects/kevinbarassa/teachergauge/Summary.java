package com.projects.kevinbarassa.teachergauge;

/**
 * Created by Kevin Barassa on 27-Jan-17.
 */

public class Summary {
    private String first_attempt, second_attempt, third_attempt, course_code, course_tile, course_completion;

    public Summary(){}

    public Summary(String first_attempt, String second_attempt, String third_attempt, String course_code, String course_tile, String course_completion) {
        this.first_attempt = first_attempt;
        this.second_attempt = second_attempt;
        this.third_attempt = third_attempt;
        this.course_code = course_code;
        this.course_tile = course_tile;
        this.course_completion = course_completion;
    }

    public String getFirst_attempt() {
        return first_attempt;
    }

    public void setFirst_attempt(String first_attempt) {
        this.first_attempt = first_attempt;
    }

    public String getSecond_attempt() {
        return second_attempt;
    }

    public void setSecond_attempt(String second_attempt) {
        this.second_attempt = second_attempt;
    }

    public String getThird_attempt() {
        return third_attempt;
    }

    public void setThird_attempt(String third_attempt) {
        this.third_attempt = third_attempt;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_tile() {
        return course_tile;
    }

    public void setCourse_tile(String course_tile) {
        this.course_tile = course_tile;
    }

    public String getCourse_completion() {
        return course_completion;
    }

    public void setCourse_completion(String course_completion) {
        this.course_completion = course_completion;
    }
}
