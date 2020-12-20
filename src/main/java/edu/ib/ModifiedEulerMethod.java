package edu.ib;

public class ModifiedEulerMethod implements ODEStep {
    @Override
    public double step(double x, double t, double h, ODEEquation ode) {
        double xHalf = x + ode.f(x, t) * (h/2);
        return x + ode.f(xHalf, t+h/2) * h;
    }
}
