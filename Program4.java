public class program4 {

    String name;
    int age;
    int rollno;
    public program4(String name, int age, int roll no) {
        this.name = name;
        this.age = age;
        this.rollno = rollno;
    }
    public void display() {Program4.java
        System.out.println("Student Name:" + this .name);
        System.out.println("Age:" + this.age);
        System.out.println("Roll No:" + this.rollno);

    }
    public static void main(String[] args) {
        program4 student1 = new program4("Alex Smith", 20, 101) {
        student1.display();
        
    }
}