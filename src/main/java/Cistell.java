public class Cistell {
    boolean cosert = false;
    int cantMax;
    int cant;
    String tipo;

    public Cistell(int cantMax, String tipo) {
        this.cantMax = cantMax;
        this.cant=0;
        this.tipo = tipo;
    }

    public synchronized void coser () {
        try {
            while (cosert) wait();
            cosert = false;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void deixar() {
        try {
            while (cant == cantMax) wait();
            cant++;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        notifyAll();
    }

    public synchronized void agafar () {
        try {
            while (cant == 0 ) wait();
            cant--;
            notifyAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
