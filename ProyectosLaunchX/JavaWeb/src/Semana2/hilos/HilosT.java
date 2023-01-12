package Semana2.hilos;

public class HilosT extends  Thread {

    @Override //Runnable
    public void run(){
        System.out.println("El hilo se esta ejecutando");
    }
/*
    public void start(){
        // Iniciarl la ejecución de un hilo
        // La JVM llamar al metodo run() del hilo

    }
    */
    // sleep - detiene de manera temporal el número especificado
    //Join() - Espera a que el hilo muera
    //getPriority - Regresa la prioridad del hilo
    // getName - Nombre del hilo
    // currentThread - Referencia al hilo que se está ejecutando
    // getId - Regresa el id del hilo
    // Thread.State getState - Regresa le state del hilo
    // isAlive - si está vivo el hilo
    public static void main(String[] args) {
        HilosT hilo = new HilosT(); // Entra al state new
        hilo.start();
    }
}

class HilosR implements  Runnable {
    @Override
    public void run(){
        System.out.println("El hilo de runnable esta corriendo");
    }

    public static void main(String[] args) {
        //Quiero Crear un objeto h de tipo HilosR
        HilosR h = new HilosR();
        Thread t = new Thread(h);
        t.start();
    }
}