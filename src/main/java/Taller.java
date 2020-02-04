import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Taller {

    public static void main(String[] args) throws InterruptedException {
        Cistell cistellM = new Cistell(8);
        Cistell cistellC = new Cistell(8);

        Cosidor cosidorM = new Cosidor("mm",cistellM);
        Cosidor cosidorC = new Cosidor("cc",cistellC);

        Emsamblador emsamblador = new Emsamblador(cistellM,cistellC,"em");

        cosidorC.start();
        cosidorM.start();
        emsamblador.start();


    }
}
