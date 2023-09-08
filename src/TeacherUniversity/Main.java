package TeacherUniversity;
import Teacher.TeacherServer;
import TeacherUniversity.Teacher;
import TeacherUniversity.User;
import TeacherUniversity.UserComparator;

import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //Выведение списков учителей
        Teacher teacher1 = new Teacher("Игорь Петрович", 62525, 35,"Доктор наук", "Физика");
        Teacher teacher2 = new Teacher("Владимир Викторович", 42000, 42,"Завуч", "Психология, Философия");
        Teacher teacher3 = new Teacher("Валерия Сергеевна", 52356, 38,"Педагог", "Английский, Литература");
        List<Teacher> listTeacher = new ArrayList<>();
        listTeacher.add(teacher1);
        listTeacher.add(teacher2);
        listTeacher.add(teacher3);
        System.out.println(listTeacher);
        listTeacher.sort(new UserComparator<User>());
        //Сортировка по зароботной плате
        System.out.println(listTeacher);
        //Создание списков учителей с помощью сервиса.
        TeacherServer teacherServer = new TeacherServer();
        teacherServer.creat("Игорь Петрович", 62525, 35,"Доктор наук", "Физика");
        teacherServer.creat("Валерия Сергеевна", 52356, 38,"Педагог", "Английский, Литература");
        System.out.println(teacherServer.getAll());
        teacherServer.edit(1,"Валерия Сергеевна", 52356, 38,"Педагог", "Английский, Литература");
        // Статус системы учителей
        teacherServer.run();


    }

}