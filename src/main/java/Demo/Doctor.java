package Demo;

public class Doctor implements Staff{
    private String qualifiction;
    private Nurse nurse;

    public Doctor(String qualifiction) {
        this.qualifiction = qualifiction;
    }

    public Nurse getNurse() {
        return nurse;
    }

    public void setNurse(Nurse nurse) {
        this.nurse = nurse;
    }

    public void assist() {
        System.out.println("Doctor is assisting");
    }

    public String getQualifiction() {
        return qualifiction;
    }

    public void setQualifiction(String qualifiction) {
        this.qualifiction = qualifiction;
    }
}
