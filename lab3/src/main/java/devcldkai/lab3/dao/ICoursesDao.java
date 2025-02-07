package devcldkai.lab3.dao;

import devcldkai.lab3.model.Courses;

import java.util.List;

public interface ICoursesDao {

    List<Courses> getAllCourses();

    List<Courses> getCoursesByName(String courseName);

    List<Courses> getCoursesByInactiveStatus();

    void addCourse(Courses course);

    void updateCourse(Courses courses);

    void deleteCourse(String id);

    void setStatusInactiveCourse(String id);

    boolean updateName(String name, String id);
    boolean updateDescription(String description, String id);
    boolean updateDuration(int duration, String id);
    boolean updateFee(float fee, String id);

}
