package Teacher;

import TeacherUniversity.Teacher;

import java.util.List;

/*Код класса TeacherView отвечает ха отображение информации о учителях и вхаиможействие с пользователем.
   Принцип использовался здесь Single Responsibility Principle (Принцип единственной ответсвенности) так как
   ког выполняется только для отображения информации учителей.

*/
public class TeacherView<T extends Teacher> implements UserView<T>{




    public void sendOnControle(List<T> teachers){
        for(Teacher user: teachers){
            System.out.println(user);
        }

    }


}

