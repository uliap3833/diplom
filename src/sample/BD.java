package sample; import java.sql.DriverManager; import java.sql.SQLException; public class BD extends Configs{ public static void ConnectionCheck(){ System.out.println("------ Checking database connection ------"); try { Globals.connection = DriverManager.getConnection(url, user, password); } catch (SQLException ex) { System.out.println("- ? -" + ex); } if (Globals.connection != null) { System.out.println("------ Сonnection to the database successfully------"); try { Globals.stmt = Globals.connection.createStatement(); } catch (SQLException e) { e.printStackTrace(); }

} else { System.out.println("------ Connection to the database failed ------"); } } }