package business;

import core.abstracts.Logger;
import dataAccess.abstracs.InstructorDao;
import entities.Instructor;

public class InstructorManager {
    private InstructorDao instructorDao;
    private Logger[] loggers;

    public InstructorManager(InstructorDao instructorDao, Logger[] loggers) {
        this.instructorDao = instructorDao;
        this.loggers = loggers;
    }

    public void addInstructor(Instructor instructor) {
        instructorDao.add(instructor);
        for (Logger logger : loggers) {
            logger.log();
        }
    }
}
