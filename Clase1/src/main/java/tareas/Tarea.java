package  tareas;
public class Tarea {

    public Tarea (){
        System.out.printf("En Tarea thread \"%s\": ", Thread.currentThread().getName());
        System.out.println("");
        var calculator = new Calculator(4);
        Thread h1 = new Thread(calculator);

        h1.start();
        h1.run();
        calculator.run();
    }


}
