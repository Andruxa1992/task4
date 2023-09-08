package Teacher;

import TeacherUniversity.User;

import java.util.List;

public interface UserView<T extends User>{



    public void sendOnControle(List<T> users);




}
