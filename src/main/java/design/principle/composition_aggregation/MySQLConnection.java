package design.principle.composition_aggregation;

/**
 * @author hum
 */
public class MySQLConnection extends DBConnection {
    @Override
    public String getConnection() {
        return "MySQL数据库连接";
    }
}
