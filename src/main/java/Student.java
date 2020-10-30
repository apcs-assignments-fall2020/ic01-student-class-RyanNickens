public class Student {
    public String firstname;
    public String lastname;
    public int year;

    public Student(String a, String b, int c) {
        this.firstname = a;
        this.lastname = b;
        this.year = c;
    }

    public Student() {
        this.firstname = "Jimmy";
        this.lastname = "joe";
        this.year = 2022;
    }

    public void doSomething() {
        System.out.println("i am in class");
    }

    public String toString() {
        String namename = firstname + " " + lastname;
        return namename;
    }

    public String getFirstName() {
        return this.firstname;
    }

    public String getLastName() {
        return this.lastname;
    }
    public void setFirstName(String firstname) {
        if (firstname.trim().length() != 0) {
            this.firstname = firstname;
        }
    }
    public void setLastName(String firstname) {
        if (lastname.trim().length() != 0) {
            this.lastname = lastname;
        }
    }
}