package enums;
import java.util.Scanner;

public class SistemaPlanetario {
    public static void main(String[] args) {
        for (Planetas p : Planetas.values()) {
            System.out.printf("%s%n", p);
        }
    }
}
