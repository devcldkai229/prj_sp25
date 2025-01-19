package devcldkai.lab3.queries;

public class CourseQueries {

    private CourseQueries(){}

    public static final String SELECT_ALL = "select * from Courses";

    public static final String SELECT_BY_NAME = "select * from Courses where name LIKE ?";
}
