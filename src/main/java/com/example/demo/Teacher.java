package com.example.demo;

public interface Teacher {

    public void teach(Learner learner, Double numberOfHours);

    public void lecture(Iterable<? extends Learner> learners, Double numberOfHours);
}
