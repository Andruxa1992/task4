package TeacherUniversity;

import java.util.Comparator;
/*
    Класс UserComparator отвечает за сравнение данных учителей определенного типа. В данном классе
    применяется принцип единственной ответсвенности, так как данный класс UserComparator использует переопределенный метод сравнения двух данных учителей.
* */
public class UserComparator<T extends User> implements Comparator<T> {

    @Override
    public int compare(T o1, T o2) {
        return o1.getSalary() - o2.getSalary();
    }
}
