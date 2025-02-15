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
import java.util.stream.Stream;

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
    public List<Courses> getCoursesByInactiveStatus() {
        List<Courses> list = new ArrayList<>();
        try {
            PreparedStatement ps = DatabaseUtils.getConnection().prepareStatement(CourseQueries.SELECT_COURSES_BY_STATUS_INACTIVE);
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
    public void addCourse(Courses course) {
        try{ //(id, name, description, duration, fee, status)
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(CourseQueries.CREATE_COURSE);
            preparedStatement.setString(1, course.getId());
            preparedStatement.setString(2, course.getName());
            preparedStatement.setString(3, course.getDescription());
            preparedStatement.setInt(4, course.getDuration());
            preparedStatement.setFloat(5, course.getFee());
            preparedStatement.setInt(6, course.getStatus());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateCourse(Courses courses) {

    }

    @Override
    public void deleteCourse(String id) {
        try{
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(CourseQueries.DELETE_BY_ID);
            preparedStatement.setString(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void setStatusInactiveCourse(String id) {
        try{
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(CourseQueries.SET_INACTIVE_COURSE);
            preparedStatement.setString(1, id);

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public boolean updateName(String name, String id) {
        try{
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(CourseQueries.UPDATE_NAME);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, id);

            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateDescription(String description, String id) {
        try{
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(CourseQueries.UPDATE_DESCRIPTION);
            preparedStatement.setString(1, description);
            preparedStatement.setString(2, id);

            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateDuration(int duration, String id) {
        try{
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(CourseQueries.UPDATE_DURATION);
            preparedStatement.setInt(1, duration);
            preparedStatement.setString(2, id);

            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean updateFee(float fee, String id) {
        try{
            PreparedStatement preparedStatement = DatabaseUtils.getConnection().prepareStatement(CourseQueries.UPDATE_FEE);
            preparedStatement.setFloat(1, fee);
            preparedStatement.setString(2, id);

            return preparedStatement.executeUpdate()>0;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static void main(String[] args){
        List<Courses> coursesList = CoursesDao.getInstance().getAllCourses();
        for(Courses courses : coursesList){
            System.out.println(courses.getId());
        }
    }
}
