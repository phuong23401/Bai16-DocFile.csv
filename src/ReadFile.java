import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReadFile {
    public static void readFile() {
        String url = "C:\\Users\\ADMIN\\OneDrive\\Documents\\Book1.xlsx";
        try {
            FileInputStream fileInputStream = new FileInputStream(url);
            BufferedReader reader = new BufferedReader(new InputStreamReader(fileInputStream));
            String line = reader.readLine();
            while (line != null) {
                String[] split = line.split(",");
                System.out.println("\nLength : " + split.length);
                System.out.println("split[0] : " + split[0]);
                System.out.println("split[1] : " + split[1]);
                System.out.println("split[2] : " + split[2]);
                System.out.println("split[3] : " + split[3]);
                System.out.println("split[4] : " + split[4]);
                System.out.println("split[5] : " + split[5]);
                System.out.println("split[6] : " + split[6]);
                System.out.println("split[7] : " + split[7]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readFile();
    }
}
