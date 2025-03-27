import java.io.*;
import java.nio.file.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) {
        try {
            // Read the input.json file
            String content = new String(Files.readAllBytes(Paths.get("input.json")));

            // Parse JSON
            JSONObject json = new JSONObject(content);
            JSONObject student = json.getJSONObject("student");
            
            // Extract first_name and roll_number
            String firstName = student.getString("first_name").toLowerCase().trim();
            String rollNumber = student.getString("roll_number").toLowerCase().trim();

            // Concatenate values
            String combined = firstName + rollNumber;

            // Generate MD5 hash
            String hash = getMD5Hash(combined);

            // Write to output.txt
            Files.write(Paths.get("output.txt"), hash.getBytes());

            System.out.println("MD5 Hash generated and saved to output.txt: " + hash);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Function to generate MD5 hash
    private static String getMD5Hash(String input) {
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(input.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : messageDigest) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
