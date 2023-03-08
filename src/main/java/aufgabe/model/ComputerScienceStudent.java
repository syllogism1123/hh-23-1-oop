package aufgabe.model;

public class ComputerScienceStudent extends Student implements Citizen {

    private String skill;

    public ComputerScienceStudent(Long id, String name, String faculty) {
        super(id, name, faculty);
    }

    public String getSkill() {
        return "Programming";
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public ComputerScienceStudent() {
    }

    @Override
    public boolean hasSkill() {
        return true;
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
