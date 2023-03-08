package aufgabe.model;

public class ComputerScienceStudent extends Student implements Citizen {


    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(Long id, String name) {
        super(id, name, "ComputerScience");
    }

    @Override
    public String getAddress() {
        return getAddress();
    }

    @Override
    public Long getIdentityCardNumber() {
        return getId();
    }
}
