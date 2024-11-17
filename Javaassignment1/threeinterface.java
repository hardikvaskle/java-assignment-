interface Interface1 {
    void method1();
    void method2();
}

interface Interface2 {
    void method3();
    void method4();
}

interface Interface3 {
    void method5();
    void method6();
}

interface NewInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}

class ConcreteClass {
    void concreteMethod() {
    }
}

class ImplementingClass extends ConcreteClass implements NewInterface {
    @Override
    public void method1() {
    }

    @Override
    public void method2() {
    }

    @Override
    public void method3(){
    }

    @Override
    public void method4() {
    }

    @Override
    public void method5() {
    }

    @Override
    public void method6() {
    }

    @Override
    public void newMethod() {
    }
}

public class threeinterface {

    static void useInterface1(Interface1 i) {
        i.method1();
        i.method2();
    }

    static void useInterface2(Interface2 i) {
        i.method3();
        i.method4();
    }

    static void useInterface3(Interface3 i) {
        i.method5();
        i.method6();
    }

    static void useNewInterface(NewInterface i) {
        i.newMethod();
    }

    public static void main(String[] args) {
        ImplementingClass obj = new ImplementingClass();

        System.out.println("Using Interface1");
        useInterface1(obj);

        System.out.println("Using Interface2");
        useInterface2(obj);

        System.out.println("Using Interface3");
        useInterface3(obj);

        System.out.println("Using NewInterface");
        useNewInterface(obj);
        
        obj.concreteMethod();
    }
}
