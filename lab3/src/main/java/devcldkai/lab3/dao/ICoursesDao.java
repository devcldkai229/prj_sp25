package devcldkai.lab3.dao;

import devcldkai.lab3.model.Courses;

import java.util.List;

public interface ICoursesDao {

    List<Courses> getAllCourses();

    List<Courses> getCoursesByName(String courseName);

    void updateCourse(Courses courses);

    void deleteCourse(String id);
}
