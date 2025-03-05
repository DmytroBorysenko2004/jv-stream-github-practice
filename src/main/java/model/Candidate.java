package model;

import java.util.Objects;

public class Candidate {
    private final int age;
    private final String nationality;
    private final boolean allowedToVote;
    private final String periodsInUkr;
    private String name;

    public Candidate(int age, String nationality, boolean allowedToVote, String periodsInUkr) {
        this.age = age;
        this.nationality = nationality;
        this.allowedToVote = allowedToVote;
        this.periodsInUkr = periodsInUkr;
    }

    public int getAge() {
        return age;
    }

    public String getNationality() {
        return nationality;
    }

    public boolean isAllowedToVote() {
        return allowedToVote;
    }

    public String getPeriodsInUkr() {
        return periodsInUkr;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Candidate candidate = (Candidate) o;
        return age == candidate.age
                && allowedToVote == candidate.allowedToVote
                && Objects.equals(nationality, candidate.nationality)
                && Objects.equals(periodsInUkr, candidate.periodsInUkr)
                && Objects.equals(name, candidate.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getAge(), getNationality(),
                isAllowedToVote(), getPeriodsInUkr(), getName());
    }
}

