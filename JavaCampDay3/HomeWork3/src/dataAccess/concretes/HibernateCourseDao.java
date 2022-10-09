package dataAccess.concretes;

import dataAccess.abstracs.CourseDao;
import entities.Course;

public class HibernateCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("Hibernate ile eklendi: " + course.getCourseName());
    }
}
