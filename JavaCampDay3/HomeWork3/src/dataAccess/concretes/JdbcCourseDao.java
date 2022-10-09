package dataAccess.concretes;

import dataAccess.abstracs.CourseDao;
import entities.Course;

public class JdbcCourseDao implements CourseDao {
    @Override
    public void add(Course course) {
        System.out.println("JDBC ile eklendi: " + course.getCourseName());
    }
}
