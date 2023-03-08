package aufgabe.model;

public class BiologyStudent extends Student implements Citizen {

    public BiologyStudent() {
    }

    public BiologyStudent(Long id, String name) {
        super(id, name, "Biology");
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
