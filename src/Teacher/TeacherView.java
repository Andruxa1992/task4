package Teacher;

import TeacherUniversity.Teacher;

import java.util.List;


public class TeacherView<T extends Teacher> implements UserView<T>{




    public void sendOnControle(List<T> teachers){
        for(Teacher user: teachers){
            System.out.println(user);
        }

    }


}

