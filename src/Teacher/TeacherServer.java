package Teacher;

import TeacherUniversity.Teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
    Код класса TeacherServer отвечает за взаимодействие с данными об учителях. В нем
    будет реализованы методы для создания, редактирования и получения информациио списказ учителей
    Принцип исползуется здесь единсвтенной ответсвенности. Так как класс отвечает за работу с данными учителей.
* */
public class TeacherServer implements UserServer<Teacher> {
    private List<Teacher> teachers;
    Scanner scanner = new Scanner(System.in);

    public TeacherServer() {
        this.teachers = new ArrayList<>();
    }



    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    @Override
    public void creat(String name, int salary, int age, String post, String objectTeacher) {
        Teacher teacher = new Teacher(name,salary,age,post,objectTeacher);
        teachers.add(teacher);
        System.out.println("Учитель успешно создан");


    }

    @Override
    public void edit(int index, String name, int salary, int age, String post, String objectTeacher) {
        if (index >= 0 && index < teachers.size()) {
            Teacher teacher = teachers.get(index);
            teacher.setName(name);
            teacher.setSalary(salary);
            teacher.setAge(age);
            teacher.setPost(post);
            teacher.setObjectTeacher(objectTeacher);
            System.out.println("Учитель успешно отредактирован");
        }else {
            System.out.println("Указанный индекс не действителен");
        }
    }

    @Override
    public void display() {
        if (teachers.isEmpty()){
            System.out.println("Список учителей пуст");
        }else {
            System.out.println("Список учителей");
            for (int i = 0; i < teachers.size(); i++) {
                Teacher teacher = teachers.get(i);
                System.out.println((i + 1) + ". " + teacher.getName() + " - " + teacher.getSalary() + " rub " + teacher.getAge() + " лет " + teacher.getPost() + " должность " + teacher.getObjectTeacher() + " предмет");
            }
        }

    }
    @Override
    public void run() {

        boolean running = true;
        while (running) {
            System.out.println("Учительская система");
            System.out.println("1. Создать учителя");
            System.out.println("2. Отредактировать учителя");
            System.out.println("3. Отоюразить список учителей");
            System.out.println();
            System.out.print("Выберите опцию: ");
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1:
                    System.out.println("Введите имя учителя: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите зарплату: ");
                    Integer salary = scanner.nextInt();
                    System.out.println("Введите возраст преподавателя: ");
                    Integer age = scanner.nextInt();
                    System.out.println("Введиет должность преподавателя: ");
                    String post = scanner.nextLine();
                    System.out.println("Введите предмет, который ведет преподаватель: ");
                    String objectTeacher = scanner.nextLine();
                    creat(name, salary, age, post, objectTeacher);
                    break;
                case 2:
                    System.out.println("Введите номер учителя для редактирования: ");
                    int index = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите новое имя: ");
                    String name1 = scanner.nextLine();
                    System.out.println("Повысти или понизти заработную плату: ");
                    int salary1 = scanner.nextInt();
                    System.out.println("Измените возраст преподавателя: ");
                    int age1 = scanner.nextInt();
                    System.out.println("Измените должность: ");
                    String post1 = scanner.nextLine();
                    System.out.println("Измените предмет: ");
                    String objectTeacher1 = scanner.nextLine();
                    edit(index - 1, name1, salary1, age1, post1, objectTeacher1);
                    break;
                case 3:
                    display();
                    break;
                default:
                    System.out.println("Недопустимая опция.");


            }

        }





    }
}
