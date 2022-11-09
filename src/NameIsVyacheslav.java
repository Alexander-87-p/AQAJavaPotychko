import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NameIsVyacheslav {
    public static void main(String[] args) throws IOException {
        String name = "Вячеслав";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String readName = reader.readLine();
        if (name.equals(readName)) {
            System.out.println("Привет, " + name);
        } else {
            System.out.println("Нет такого имени");
        }
    }
}
