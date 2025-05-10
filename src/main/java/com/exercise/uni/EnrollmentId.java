package com.exercise.uni;
import java.io.Serializable;
import java.util.Objects;

public class EnrollmentId implements Serializable {

    private String cf;
    private Long id_cou;

    /* CONSTRUCTOR */
    public EnrollmentId() {}

    /* equals() / hashCode() */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EnrollmentId)) return false;
        EnrollmentId that = (EnrollmentId) o;
        return Objects.equals(cf, that.cf) &&
               Objects.equals(id_cou, that.id_cou);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf, id_cou);
    }
}