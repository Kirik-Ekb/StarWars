public class Solution {
    public static void main(String[] args) {

        print("The power is easy to use!");
        print("The power opens many opportunities!");

        increaseSpeed(700);

        System.out.println(getWeight(888));

        print3("dump");
        print3("cargo");

        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));

        System.out.println(max(-20, -10));
        System.out.println(max(-40, -10, -30, 40));
        System.out.println(max(-20, -40, -30, 40));
        System.out.println(max(-20, -10, -40, 40));
        System.out.println(max(-20, -10, -30, -40));

        Zam zam = new Zam();
        Dron dron = new Dron();
        zam.spy = dron;
        dron.hunter = zam;

        Jedi jedi1 = new Jedi("Obi-Wan");
        Jedi jedi2 = new Jedi("Anakin");
        Jedi jedi3 = new Jedi("Joda");

        Clone clone1 = new Clone();
        Clone clone2 = new Clone();
        Clone clone3 = new Clone();
        Clone clone4 = new Clone();
        Clone clone5 = new Clone();
        Clone clone6 = new Clone();
        Clone clone7 = new Clone();
        Clone clone8 = new Clone();
        Clone clone9;
        Clone clone10;

        Dias dias = new Dias();
        Clone1 clone11 = new Clone1(dias);
        Clone2 clone12 = new Clone2(dias);
        Clone3 clone13 = new Clone3(dias);

    }

    public static void print(String a) {
        for (int i = 0; i <= 4; i++) {
            System.out.println(a);
        }
    }

    public static void print3(String s) {
        for (int i = 0; i <= 3; i++) {
            System.out.print(s + " ");
            System.out.println();
        }
    }

    // ускорение
    public static void increaseSpeed(int n) {
        System.out.println("Your speed is: " + (n + 100) + " km/h.");
    }

    // вес на луне
    public static double getWeight(int weight) {
        return weight * (17.0 / 100);
    }

    // минимум из двух
    public static int min(int a, int b) {
        if (a > b) return a;
        else return b;
    }

    // максимум из двух
    public static int max(int a, int b) {
        if (a > b) return  a;
        else return b;
    }

    // максимум из четырех
    public static int max(int a, int b, int c, int d) {
        return max(max(a, b), max(c, d));
    }


public static class Zam {
    public Dron spy;
    public int a;
    public int b;
}

public static class Dron {
    public Zam hunter;
    public int a;
    public int b;
}

public static class Jedi {
    public String name;

    public Jedi(String name) {
        this.name = name;
    }
}

public static class Clone {
}

public static class Clone1 {
    public Dias owner;

    public Clone1(Dias owner) {
        this.owner = owner;
    }
}

public static class Clone2 {
    public Dias owner;

    public Clone2(Dias owner) {
        this.owner = owner;
    }
}

public static class Clone3 {
    public Dias owner;

    public Clone3(Dias owner) {
        this.owner = owner;
    }
}

public static class Dias {
}
}
