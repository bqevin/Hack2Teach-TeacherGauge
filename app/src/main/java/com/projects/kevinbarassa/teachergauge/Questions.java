package com.projects.kevinbarassa.teachergauge;

/**
 * Created by Kevin Barassa on 27-Jan-17.
 */

public class Questions {
    private String course_code, quiz, ans_a, ans_b, ans_c, ans_d, ans_e;

    public Questions(){}

    public Questions(String course_code, String quiz, String ans_a, String ans_b, String ans_c, String ans_d, String ans_e) {
        this.course_code = course_code;
        this.quiz = quiz;
        this.ans_a = ans_a;
        this.ans_b = ans_b;
        this.ans_c = ans_c;
        this.ans_d = ans_d;
        this.ans_e = ans_e;
    }

    public String getCourse_code() {
        return course_code;
    }

    public void setCourse_code(String course_code) {
        this.course_code = course_code;
    }

    public String getQuiz() {
        return quiz;
    }

    public void setQuiz(String quiz) {
        this.quiz = quiz;
    }

    public String getAns_a() {
        return ans_a;
    }

    public void setAns_a(String ans_a) {
        this.ans_a = ans_a;
    }

    public String getAns_b() {
        return ans_b;
    }

    public void setAns_b(String ans_b) {
        this.ans_b = ans_b;
    }

    public String getAns_c() {
        return ans_c;
    }

    public void setAns_c(String ans_c) {
        this.ans_c = ans_c;
    }

    public String getAns_d() {
        return ans_d;
    }

    public void setAns_d(String ans_d) {
        this.ans_d = ans_d;
    }

    public String getAns_e() {
        return ans_e;
    }

    public void setAns_e(String ans_e) {
        this.ans_e = ans_e;
    }
}
