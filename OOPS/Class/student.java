package OOPS.Class;

public class student {

    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;

    // Parameterised Constructors
    public student(int id, int age, String name, int nos) {
        // System.out.println("Student Parameterised Constructors Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
    }

    // copy Constructors
    public student(student obj) {
        System.out.println("copy Constructors Called");
        this.id = obj.id;
        this.age = obj.age;
        this.name = obj.name;
        this.nos = obj.nos;
    }

    // Methods /Behaviours
    public void study() {
        System.out.println(name + "  Studying");
    }

    public void sleep() {
        System.out.println(name + "  Sleeping");
    }

    public void bunk() {
        System.out.println(name + "  Bunking");
    }

    public static void main(String[] args) {

        student st = new student(1, 24, "Shyam", 5);

        // System.out.println(st.name);
        // System.out.println(st.age);
        // System.out.println(st.id);
        // System.out.println(st.nos);
        // st.bunk();
        // st.sleep();
        // st.study();

        student st1 = new student(st);
        System.out.println(st1.name);
        System.out.println(st1.age);
        System.out.println(st1.id);
        System.out.println(st1.nos);

        st1.bunk();
        st1.sleep();
        st1.study();

    }

}
