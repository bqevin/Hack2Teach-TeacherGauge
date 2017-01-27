package com.projects.kevinbarassa.teachergauge;

/**
 * Created by Kevin Barassa on 27-Jan-17.
 */

public class Course {
    private String course_name, course_duration, course_code, course_fee, course_poster;

    public Course(){}

    //Course Constructor
    public Course(String course_name, String course_duration, String course_code, String course_fee, String course_poster) {
        this.course_name = course_name;
        this.course_duration = course_duration;
        this.course_code = course_code;
        this.course_fee = course_fee;
        this.course_poster = course_poster;
    }


    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public String getCourse_duration() {
        return course_duration;
    }

    public void setCourse_duration(String course_duration) {
        this.course_duration = course_duration;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getCourse_fee() {
        return course_fee;
    }

    public void setCourse_fee(String course_fee) {
        this.course_fee = course_fee;
    }

    public String getCourse_poster() {
        return course_poster;
    }

    public void setCourse_poster(String course_poster) {
        this.course_poster = course_poster;
    }
}
