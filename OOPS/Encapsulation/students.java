package OOPS.Encapsulation;

public class students {
    // Attributes
    public int id;
    public int age;
    public String name;
    public int nos;
    private int password;

    // Parameterised Constructors
    public students(int id, int age, String name, int nos, int password) {
        // System.out.println("Student Parameterised Constructors Called");
        this.id = id;
        this.age = age;
        this.name = name;
        this.nos = nos;
        this.password = password;
    }

    // copy Constructors
    public students(students obj) {
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

    private void Password() {
        System.out.println(name + "  Password");
    }

    public static void main(String[] args) {

        students st = new students(1, 24, "Shyam", 5, 3455);

        // System.out.println(st.name);
        // System.out.println(st.age);
        // System.out.println(st.id);
        // System.out.println(st.nos);
        // st.bunk();
        // st.sleep();
        // st.study();

        students st1 = new students(st);
        System.out.println(st1.name);
        System.out.println(st1.age);
        System.out.println(st1.id);
        System.out.println(st1.nos);
        System.out.println(st1.password);

        st1.bunk();
        st1.sleep();
        st1.study();
        st1.Password();
    }
}

