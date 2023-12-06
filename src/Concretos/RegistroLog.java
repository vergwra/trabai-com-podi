package Concretos;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class RegistroLog {
    public static void registrar(String mensagem) {
        try (PrintWriter writer = new PrintWriter(new FileWriter("log.txt", true))) {
            writer.println(mensagem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
