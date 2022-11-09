import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoreThanSeven {
    public static void main(String[] args) throws IOException {
        int a = 7;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int b = Integer.parseInt(reader.readLine());
        if (b > a) {
            System.out.println("Привет");
        }
    }
}
