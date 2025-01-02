package org.scenarioBasedJavaQ;

class A {
    private void display() {
        System.out.println("A's display");
    }
}

class B extends A {
    public void display() {
        System.out.println("B's display");
    }

    public static void main(String[] args) {
         B b = new B();
         b.display();

    }
}



