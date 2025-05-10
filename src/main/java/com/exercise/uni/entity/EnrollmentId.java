package com.exercise.uni.entity;
import java.io.Serializable;
import java.util.Objects;

public class EnrollmentId implements Serializable {
    private String cf;
    private int id_course;

    /* CONSTRUCTOR */
    public EnrollmentId() {}
    
    /* SETTER/GETTER */
    public void setCf(String cf) { this.cf = cf; }
    public String getCf() { return cf; }
    
    public void setIdCourse(int id_course) { this.id_course = id_course; }
    public int getIdCourse() { return id_course; }

    /* equals() / hashCode() */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentId)) return false;
        EnrollmentId that = (EnrollmentId) o;
        return Objects.equals(cf, that.cf) &&
               Objects.equals(id_course, that.id_course);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf, id_course);
    }
}