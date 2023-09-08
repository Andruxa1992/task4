package TeacherUniversity;

public class Teacher extends User{
    private int salary;
    private int age;

    private String post;
    private String objectTeacher;

    public Teacher(String name, int salary, int age, String post, String objectTeacher) {
        super(name);
        this.salary = salary;
        this.age = age;
        this.post = post;
        this.objectTeacher = objectTeacher;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getObjectTeacher() {
        return objectTeacher;
    }

    public void setObjectTeacher(String objectTeacher) {
        this.objectTeacher = objectTeacher;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Teacher(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "salary=" + salary +
                ", age=" + age +
                ", post='" + post + '\'' +
                ", objectTeacher='" + objectTeacher + '\'' +
                '}';
    }
}
