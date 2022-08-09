package Person;

public class Student extends Person {
    private final String myStatus;



    public Student(String name, String address, String phoneNumber, String emailAddress, String myStatus) {
        super(name, address, phoneNumber, emailAddress);
        this.myStatus = myStatus;
    }

    @Override
    public String toString() {
        return
                "myStatus=" + myStatus +super.toString();
    }
}
