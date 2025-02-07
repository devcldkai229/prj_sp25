package devcldkai.lab3.mapper;

import devcldkai.lab3.model.Courses;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CoursesMapper {

    private CoursesMapper(){}

    public static Courses mapToCourses(ResultSet rs) throws SQLException {
        Courses course = new Courses();

        course.setId(rs.getString("id"));
        course.setName(rs.getString("name"));
        course.setDescription(rs.getString("description"));
        course.setDuration(rs.getInt("duration"));
        course.setFee(rs.getFloat("fee"));
        course.setStatus(rs.getInt("status"));
        return course;
    }
}
