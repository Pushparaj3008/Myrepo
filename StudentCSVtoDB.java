import java.io.*;
import java.sql.*;

public class StudentCSVtoDB {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/studentdb";
        String dbUser = "root";
        String dbPassword = "root"; // change to your real password

        String csvFile = "C:\\Users\\Pushparaj R\\IdeaProjects\\thread\\src\\students.csv";
        String outputFile = "output_students.txt";

        try (
                Connection connection = DriverManager.getConnection(jdbcURL, dbUser, dbPassword);
                BufferedReader reader = new BufferedReader(new FileReader(csvFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            // Create table if not exists
            Statement tableStmt = connection.createStatement();
            tableStmt.execute("CREATE TABLE IF NOT EXISTS students (" +
                    "id INT AUTO_INCREMENT PRIMARY KEY, " +
                    "name VARCHAR(100), " +
                    "mark1 INT, mark2 INT, mark3 INT, total INT)");

            // Prepare insert statement
            String insertSQL = "INSERT INTO students (name, mark1, mark2, mark3, total) VALUES (?, ?, ?, ?, ?)";
            PreparedStatement insertStmt = connection.prepareStatement(insertSQL);

            // Skip header
            reader.readLine();

            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");

                String name = parts[0].trim();
                int m1 = Integer.parseInt(parts[1].trim());
                int m2 = Integer.parseInt(parts[2].trim());
                int m3 = Integer.parseInt(parts[3].trim());
                int total = m1 + m2 + m3;

                insertStmt.setString(1, name);
                insertStmt.setInt(2, m1);
                insertStmt.setInt(3, m2);
                insertStmt.setInt(4, m3);
                insertStmt.setInt(5, total);
                insertStmt.addBatch();
            }

            insertStmt.executeBatch();
            System.out.println("✅ Data inserted from CSV into database.");

            // Read and write to output file
            Statement selectStmt = connection.createStatement();
            ResultSet rs = selectStmt.executeQuery("SELECT * FROM students");

            writer.write("ID\tName\tMark1\tMark2\tMark3\tTotal\n");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int m1 = rs.getInt("mark1");
                int m2 = rs.getInt("mark2");
                int m3 = rs.getInt("mark3");
                int total = rs.getInt("total");

                writer.write(id + "\t" + name + "\t" + m1 + "\t" + m2 + "\t" + m3 + "\t" + total + "\n");
            }

            System.out.println("✅ Output written to: " + outputFile);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

