package Teacher;

import java.util.List;

public interface UserServer<T> {
    List<T> getAll();

    void creat(String name, int salary, int age, String post, String objectTeacher);
    void edit(int index, String name, int salary, int age, String post, String objectTeacher);
    void display();
    void run();

}
