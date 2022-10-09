package dataAccess.concretes;

import dataAccess.abstracs.InstructorDao;
import entities.Instructor;

public class SqlServerInstructorDao implements InstructorDao {
    @Override
    public void add(Instructor instructor) {
        System.out.println("SqlServer ile eklendi: " + instructor.getFirstName() + " " + instructor.getLastName());
    }
}
