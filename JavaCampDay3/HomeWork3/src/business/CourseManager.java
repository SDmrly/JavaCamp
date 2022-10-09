package business;

import core.abstracts.Logger;
import dataAccess.abstracs.CourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    private CourseDao courseDao;
    private Logger[] loggers;

    public CourseManager(CourseDao courseDao, Logger[] loggers) {
        this.courseDao = courseDao;
        this.loggers = loggers;
    }

    public void addCourse(List<Course> courses, Course course) throws Exception {
        for (Course course1 : courses) {
            if (course1.getCourseName().equals(course.getCourseName())) {
                throw new Exception("Mevcut Kurs bulunmaktadir.");
            }
        }
        courseDao.add(course);

        for (Logger logger : loggers) {
            logger.log();
        }
    }
}
