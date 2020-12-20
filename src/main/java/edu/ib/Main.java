package edu.ib;

public class Main {

    public static void main(String[] args) {
        System.out.println("Metoda Eulera: ");
        ODEEquation equation = (x, t) -> -(30/(1-Math.pow(t, 2))) + ((2*t/(1-Math.pow(t, 2)))*x)- Math.pow(x,2);
        ConsoleWriter consoleWriter = new ConsoleWriter();
        ODEIntegrate integrate1 = new ODEIntegrate(0.05, 0.5, 19.53, equation, consoleWriter);
        integrate1.integrate(new EulerMethod(), 0.1);
        consoleWriter.print();

        System.out.println("Zmodyfikowana metoda Eulera: ");
        ConsoleWriter consoleWriter2 = new ConsoleWriter();
        ODEIntegrate integrate2 = new ODEIntegrate(0.05, 0.5, 19.53, equation, consoleWriter2);
        integrate2.integrate(new ModifiedEulerMethod(), 0.1);
        consoleWriter2.print();
    }
}
