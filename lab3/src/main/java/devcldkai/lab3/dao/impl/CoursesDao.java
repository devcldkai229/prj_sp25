package devcldkai.lab3.dao.impl;

import devcldkai.lab3.dao.ICoursesDao;
import devcldkai.lab3.mapper.CoursesMapper;
import devcldkai.lab3.model.Courses;
import devcldkai.lab3.queries.CourseQueries;
import devcldkai.lab3.utils.DatabaseUtils;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CoursesDao implements ICoursesDao {

    public static ICoursesDao getInstance(){
        return new CoursesDao();
    }

    @Override
    public List<Courses> getAllCourses() {
        List<Courses> list = new ArrayList<>();
        try {
            PreparedStatement ps = DatabaseUtils.getConnection().prepareStatement(CourseQueries.SELECT_ALL);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(CoursesMapper.mapToCourses(rs));
            }
            return list;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public List<Courses> getCoursesByName(String courseName) {
        List<Courses> list = new ArrayList<>();
        try {
            PreparedStatement ps = DatabaseUtils.getConnection().prepareStatement(CourseQueries.SELECT_BY_NAME);
            ps.setString(1, "%" + courseName + "%");
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                list.add(CoursesMapper.mapToCourses(rs));
            }
            return list;
        } catch (SQLException e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public void updateCourse(Courses courses) {

    }

    @Override
    public void deleteCourse(String id) {

    }

    public static void main(String[] args){
        List<Courses> coursesList = CoursesDao.getInstance().getAllCourses();
        for(Courses courses : coursesList){
            System.out.println(courses.getId());
        }
    }
}
