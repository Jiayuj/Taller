
public class Taller {

    public static void main(String[] args)  {
        Cistell cistellM = new Cistell(10, "M");
        Cistell cistellC = new Cistell(5, "C");

        Cosidor cosidorM = new Cosidor("mm",cistellM);
        Cosidor cosidorC = new Cosidor("cc",cistellC);

        Emsamblador emsamblador = new Emsamblador(cistellM,cistellC,"em");

        cosidorC.start();
        cosidorM.start();
        emsamblador.start();


    }
}
