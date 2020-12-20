package edu.ib;

public class ODEIntegrate {

    double tLeft;
    double tRight;
    double x0;
    ODEEquation equation;
    StepHandler stephandler;

    public ODEIntegrate(double tLeft, double tRight, double x0, ODEEquation equation, StepHandler stepHandler) {
        this.tLeft = tLeft;
        this.tRight = tRight;
        this.equation = equation;
        this.x0 = x0;
        this.stephandler = stepHandler;
    }

    void integrate(ODEStep method, double h) {
        double t = tLeft;
        double x = x0;
        while (t < tRight) {
            //System.out.println("Czas: " + t + "\t X: " + x);
            stephandler.update(t, x);
            x = method.step(x, t, h, equation);
            t = t + h;
        }
        //System.out.println("Czas: " + t + "\t X: " + x);
        stephandler.update(t, x);

    }

}
