import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerFicheros {
    BufferedReader bf = null;
    String prueba;

    public void abrirFichero() {
        try {
            bf = new BufferedReader(new FileReader("fichero.txt"));

            prueba = bf.readLine();
        } catch (Exception e) {
            System.out.println("awa");
        }
    }
}
