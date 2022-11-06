import java.io.*;
import java.util.Scanner;

public class actividad9 {
    public static void main(String[] args) throws IOException {

        File directorio = new File("out\\production\\actividad9");
        ProcessBuilder pb = new ProcessBuilder("java", "actividad9LeerCadenas");
        pb.directory(directorio);

        //La cadena esta en un fichero
        File fichero = new File("src\\docs\\fichero.txt");
        pb.redirectInput(ProcessBuilder.Redirect.from(fichero));

        // Salida a consola
        pb.redirectOutput(ProcessBuilder.Redirect.INHERIT);

        Process p = pb.start();

        InputStream is = p.getInputStream();
        is = p.getInputStream();
        int c;
        while ((c = is.read()) != -1)
            System.out.print((char) c);
    }
}
