public class Emsamblador extends Thread {

    Cistell cistellM;
    Cistell cistellC;
    Cistell cistell;
    String nom;

    public Emsamblador(Cistell cistellM, Cistell cistellC, String nom) {
        this.cistellM = cistellM;
        this.cistellC = cistellC;
        this.cistell = new Cistell(8);
        this.nom = nom;

    }



    @Override
    public void run() {
        cistell.coserJ(cistellC,cistellM);
//        int tmp = (int) ((Math.random() * 4000) + 4000);
        System.out.println(nom + " coser... hay "+cistell.cant);
//        try {
//            Thread.sleep(tmp);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        cistell.deixarJ();
        System.out.println(nom + " finalizar... hay "+cistell.cant);
    }
}
