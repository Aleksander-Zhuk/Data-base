import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
public class Database {
    public static void main(String[] args) {
        new TextEditor();
    }
}
class MyDatabase extends Database{
    MyDatabase (String title_book,int book_releas,String book_author) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:sqlite:D:/SQL/books.db");
            String query = "INSERT INTO books (id_book,title_book,book_release_year,book_author) VALUES (?,?,?,?);";
            PreparedStatement statement = connection.prepareStatement(query);

            statement.setString(2, title_book);
            statement.setInt(3,book_releas);
            statement.setString(4, book_author);

            int rowsInserted = statement.executeUpdate();

            connection.close();
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
}