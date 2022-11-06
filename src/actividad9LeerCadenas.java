import java.io.*;

public class actividad9LeerCadenas {
    public static void main(String[] args) {
        String texto = "";
        try (InputStreamReader in = new InputStreamReader(System.in);
             BufferedReader br = new BufferedReader(in);) {
            texto = br.readLine();
            if (!texto.equals("*")) {
                System.out.println("Cadena introducida: " + texto);
            } else {
                System.out.print("Fin del programa");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}