//package work.classwork.day19;
//
//import com.mysql.cj.jdbc.MysqlDataSource;
//
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.sql.*;
//
//public class DbConnect {
//
//    private static Properies prop = getProperties();
//
//    public static void main(String[] args) {
//
//        String query = "SELECT * FROM Categories WHERE CategoryID =?";
//        prop.forEach((k,v)-> System.out.println(v.toString()));
//
//
//    }
//    private static  Properies getProperties(){
//
//        Properies prop = new Properies();
//
//        try {
//            InputStream input = new FileInputStream("src/test/resources/db.properties")){
//                prop.load(input);
//            }catch()
//            }
//        }
//
//        private  static MysqlDataSource getDataSource(Properies prop){
//        MysqlDataSource dataSource = new MysqlDataSource();
//            dataSource.setServerName(prop.getProperty("HOST"));
//            dataSource.setPort(Integer.parseInt(prop.getProperty("PORT")));
//            dataSource.setUser(prop.getProperty("USER"));
//            dataSource.setPassword(prop.getProperty("PWD"));
//            dataSource.setDatabaseName(prop.getProperty("DBNAME"));
//        return dataSource;
//        }
//
//        private static void  execStatements(String query){
//            try (Connection connection = getDataSource().getConnection();
//                 Statement statement = connection.createStatement();
//                 ResultSet rs = statement.executeQuery(query)) {
//
//                while (rs.next()) {
//                    System.out.println(rs.getString(1));
//                }
//
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        private  static  void  execPreparedStatement(String query, int id) {
//            try (Connection connection = getDataSource(prop).getConnection();
//                 PreparedStatement statement = connection.prepareStatement(query);
//            ) {
//                statement.setInt(1, id);
//
//                try (ResultSet rs = statement.executeQuery()) {
//                    while (rs.next()) {
//                        System.out.println(rs.getString(2));
//                    }
//                }
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//
//        }
//    }
//
//
//
