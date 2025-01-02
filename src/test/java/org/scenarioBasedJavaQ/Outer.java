package org.scenarioBasedJavaQ;

public class Outer {
    private class Inner {
        void display() {
            System.out.println("Inner class method");
        }
    }

    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.getInnreObj();
    }

    public void getInnreObj() {
        Inner inner = new Inner();
        inner.display();
    }
}

