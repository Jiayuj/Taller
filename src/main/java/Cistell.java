public class Cistell {

    int cantMax;
    int cant;
    int cantJ;

    public Cistell(int cantMax) {
        this.cantMax = cantMax;
        this.cant=0;
        this.cantJ=0;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public synchronized void coser () {
        try {
            while (cant == cantMax) wait();
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deixar() {
        cant++;
        notifyAll();
    }
    public synchronized void coserJ (Cistell cistellC, Cistell cistellM) {
        try {
            while (cistellC.cant <= 0 && cistellM.cant <= 0) wait();
            cistellC.setCant(cistellC.getCant()-1);
            cistellM.setCant(cistellM.getCant()-1);
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public synchronized void deixarJ() {
        cantJ++;
        notifyAll();
    }
}
