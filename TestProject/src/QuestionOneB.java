import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class QuestionOneB {
	static void doesfileexit(String filename) {
        File file = new File(filename);
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line = br.readLine();
            while (line != null) {
                System.out.println("\n");
                for (int i = 0; i < line.length(); i++) {
                    char c = line.charAt(i);
                    if (c == '-' || c == ',') {
                        System.out.println();
                    } else {
                        System.out.print(c);
                    }

                }
                line = br.readLine();
            }

        } catch (Exception e) {
            System.out.println("file not found");
        }

    }

    public static void main(String[] args) {

        System.out.println("Enter the filepath");
        Scanner obj = new Scanner(System.in);
        String filnm = obj.nextLine();
        doesfileexit(filnm);
    }
}



