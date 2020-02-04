public class Emsamblador extends Thread {
    Cistell cistellM;
    Cistell cistellC;
    String nom;
    int cant;

    public Emsamblador(Cistell cistellM, Cistell cistellC, String nom) {
        this.cistellM = cistellM;
        this.cistellC = cistellC;
        this.nom = nom;
        this.cant = 0;
    }


    @Override
    public void run() {
       for (;;){
           cistellC.agafar();
           System.out.println(nom + " agafar un " + cistellC.tipo);
           cistellM.agafar();
           System.out.println(nom + "agafar un " + cistellM.tipo);
           cistellM.agafar();
           System.out.println(nom + "agafar un " + cistellM.tipo);
           int tmp = (int) ((Math.random() * 4000) + 4000);
           System.out.println(nom + " esta coser...");
           try {
               Thread.sleep(tmp);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
           cant++;
           System.out.println(nom + " finalizar.... hay  " +cant + "jerse.");
       }
    }
}
