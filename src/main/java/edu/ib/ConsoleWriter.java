package edu.ib;

import java.util.ArrayList;

public class ConsoleWriter implements StepHandler{
    ArrayList<Double> arrayT;;
    ArrayList<Double> arrayX;

    public ConsoleWriter() {
        arrayT = new ArrayList<>();
        arrayX = new ArrayList<>();
    }

    @Override
    public void update(double t, double x) {
        arrayT.add(t);
        arrayX.add(x);
    }

    public void print() {
        for (int i = 0; i < arrayT.size(); i++) {
            System.out.println( arrayT.get(i) + "\t" + arrayX.get(i));
        }
    }
}
