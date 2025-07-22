import java.io.*;

public class solution {

    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Pushparaj R\\IdeaProjects\\thread\\src\\students.csv";
        String outputFile = "C:\\Users\\Pushparaj R\\IdeaProjects\\thread\\src\\output.csv";

        try (
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))
        ) {
            String line;

            // Write header to output file
            writer.write("Name,Total,Average");
            writer.newLine();

            // Skip the header in input
            reader.readLine(); // Skip first line (Name,Mark1,Mark2)

            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int mark1 = Integer.parseInt(parts[1].trim());
                int mark2 = Integer.parseInt(parts[2].trim());

                int total = mark1 + mark2;
                float average = total / 2.0f;

                writer.write(name + "," + total + "," + average);
                writer.newLine();
            }

            System.out.println("Output file created: " + outputFile);
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
