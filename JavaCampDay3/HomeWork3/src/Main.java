import business.CategoryManager;
import business.CourseManager;
import business.InstructorManager;
import core.concretes.DatabaseLogger;
import core.concretes.EmailLogger;
import core.concretes.FileLogger;
import core.abstracts.Logger;
import dataAccess.concretes.HibernateCategoryDao;
import dataAccess.concretes.JdbcCourseDao;
import dataAccess.concretes.SqlServerInstructorDao;
import entities.Category;
import entities.Course;
import entities.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Category category = new Category();
        category.setId(1);
        category.setCategoryName("Yazilim");

        Category category1 = new Category();
        category1.setId(2);
        category1.setCategoryName("Kisisel Gelisim");

        Category category2 = new Category();
        category2.setId(3);
        category2.setCategoryName("Spor");

        List<Category> databaseCategories = new ArrayList<>();
        databaseCategories.add(category);
        databaseCategories.add(category1);

        Logger[] categoryLoggers = new Logger[] {new FileLogger(), new DatabaseLogger()};
        Logger[] courseLoggers = new Logger[] {new FileLogger(), new DatabaseLogger()};
        Logger[] instructorLoggers = new Logger[] {new FileLogger(), new EmailLogger(), new DatabaseLogger()};

        //Category2 ayrı göndermemin sebebi liste halinde olan categoryi datebaseden geliyor gibi simüle ettim.
        CategoryManager categoryManager = new CategoryManager(new HibernateCategoryDao(), categoryLoggers);
        categoryManager.addCategory(databaseCategories, category2);

        Course javaCourse = new Course();
        javaCourse.setId(10);
        javaCourse.setCourseName("Java");
        javaCourse.setPrice(100);
        javaCourse.setCategory(category);

        Course pythonCourse = new Course();
        pythonCourse.setId(11);
        pythonCourse.setCourseName("Python");
        pythonCourse.setPrice(100);
        pythonCourse.setCategory(category);

        Course psychologyCourse = new Course();
        psychologyCourse.setId(12);
        psychologyCourse.setCourseName("Psychology");
        psychologyCourse.setPrice(1000);
        psychologyCourse.setCategory(category1);

        List<Course> databaseCourse = new ArrayList<>();
        databaseCourse.add(javaCourse);
        databaseCourse.add(pythonCourse);

        CourseManager courseManager = new CourseManager(new JdbcCourseDao(), courseLoggers);
        courseManager.addCourse(databaseCourse, psychologyCourse);

        //Bir kişi birden fazla kurs verebilir. Databaseden geliyor gibi simüle ettim.
        List<Course> enginCourses = new ArrayList<>();
        enginCourses.add(javaCourse);

        Instructor instructor = new Instructor();
        instructor.setId(100);
        instructor.setFirstName("Engin");
        instructor.setLastName("Demirog");
        instructor.setEmail("engin@gmail.com");
        instructor.setCourses(enginCourses);

        InstructorManager instructorManager = new InstructorManager(new SqlServerInstructorDao(), instructorLoggers);
        instructorManager.addInstructor(instructor);

    }
}
