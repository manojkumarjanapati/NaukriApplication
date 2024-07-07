package com.pack.NaukriApplication.entity;

public class Test {
    public static void main(String[] args) {
        JobSeeker jobSeeker1 = new JobSeeker();
        JobSeeker jobSeeker2 = new JobSeeker();
        jobSeeker1.setName("Haritha");
        jobSeeker2.setName("Haritha");
        System.out.println(jobSeeker1.equals(jobSeeker2));
    }
}
