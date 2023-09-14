package TeacherUniversity;
public class User {
    public int getSalary(){
        if(this instanceof Teacher) {
            return getSalary();
        }else{
            return 0;
        }
    }
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
}
