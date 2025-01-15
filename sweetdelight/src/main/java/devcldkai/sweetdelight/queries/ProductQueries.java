package devcldkai.sweetdelight.queries;

public class ProductQueries {

    public static final String SELECT_ALL_PRODUCTS = "SELECT * FROM Products";

    public static final String SELECT_PRODUCT_BY_ID = "SELECT * FROM Products WHERE id = ?";

    public static final String SAVE_PRODUCT = "INSERT INTO Products (name, price, description, created_at, sales_count, rate, status, image_url, category_id, store_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

    public static final String DELETE_PRODUCT_BY_ID = "DELETE FROM Products WHERE id = ?";

    public static final String SELECT_PRODUCT_BY_NAME = "SELECT * FROM Products WHERE name LIKE ?";

    private ProductQueries(){}
}
