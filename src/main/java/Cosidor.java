public class Cosidor extends Thread {

    String nombre;
    Cistell cistell;
    int tmp;

    public Cosidor(String nombre, Cistell cistell) {
        this.nombre = nombre;
        this.cistell = cistell;
        tmp=0;
    }

    @Override
    public void run() {
        for (;;){
            if (cistell != null) cistell.coser();
            tmp = (int) ((Math.random() * 4000) + 4000);
            System.out.println(nombre + " esta coser...");
            try {
                Thread.sleep(tmp);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            if (cistell != null) cistell.deixar();
            System.out.println(nombre + " deixa a cistell...hay " + cistell.cant + ".");
        }
    }
}
