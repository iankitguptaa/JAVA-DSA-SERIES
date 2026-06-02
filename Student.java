
public class Student {
    public int id;
    public int age;
    public String name;
    public int nos;
    private String gf;

    public String geName() {
        return this.name;
    }

    // Default constructor
    public Student() {
        System.out.println("Student default constructor called");
    }

    // Parametrized constructor
    public Student(int id, int age, String name, int nos, String gf) {
        System.out.println("Student Parametrized constructor called");
        this.id = id;
        this.name = name;
        this.age = age;
        this.nos = nos;
        this.gf = gf;
    }

    // copy constructor
    public Student(Student srcobj) {
        System.out.println("Student Parametrized constructor called");
        this.id = srcobj.id;
        this.name = srcobj.name;
        this.age = srcobj.age;
    }

    public void study() {
        System.out.println(name + "Studing");
    }

    public void sleep() {
        System.out.println(name + "Sleeping");
    }

    public void bunk() {
        System.out.println(name + "Bunking");
    }

    private void gfChatting() {
        System.out.println(name + "gfChatting");
    }

    public static void main(String[] args) {
        // Default constructor

        // Student A = new Student();
        // A.id = 1;
        // A.age = 22;
        // A.name = "Ankit";
        // System.out.println(A.id);
        // System.out.println(A.age);
        // System.out.println(A.name);
        // A.bunk();
        // A.study();
        // A.sleep();

        // Parametrized constructor

        Student A = new Student(1, 12, "Ankit", 11, "Tina");
        System.out.println(A.id);
        System.out.println(A.name);
        System.out.println(A.age);
        System.out.println(A.nos);
        System.out.println(A.gf);

        A.bunk();
        A.study();
        A.sleep();
        A.gfChatting();

        // Copy constructor
        // Student B = new Student(A);
        // System.out.println(B.id);
        // System.out.println(B.age);
        // System.out.println(B.name);
    }
}
