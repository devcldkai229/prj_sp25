package devcldkai.lab3.queries;

public class CourseQueries {

    private CourseQueries(){}

    public static final String SELECT_ALL = "select * from Courses";

    public static final String SELECT_BY_NAME = "select * from Courses where name LIKE ?";

    public static final String DELETE_BY_ID = "delete from Courses where id = ?";

    public static final String SET_INACTIVE_COURSE = "update Courses set status = 0 where id = ?";

    public static final String SELECT_COURSES_BY_STATUS_INACTIVE = "select * from Courses where status = 0";

    public static final String UPDATE_NAME = "update Courses set name = ? where id = ?";

    public static final String UPDATE_DESCRIPTION = "update Courses set description = ? where id = ?";

    public static final String UPDATE_DURATION = "update Courses set duration = ? where id = ?";

    public static final String UPDATE_FEE = "update Courses set fee = ? where id = ?";

    public static final String CREATE_COURSE = "insert into Courses (id, name, description, duration, fee, status) values (?, ?, ?, ?, ?, ?)";
}
