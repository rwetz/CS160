package Questions;

/**
 *
 * @author araderma
 */
public class Liopleurodon {

    private String name;
    private String occupation;
    private String location;
    private boolean isMagical;

    public Liopleurodon() {
        name = "Leo";
        occupation = "Terror of the Deep";
        location = "Museum";
        isMagical = true;
    }

    public String getName() {
        return name;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getLocation() {
        return location;
    }

    public boolean isIsMagical() {
        return isMagical;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setIsMagical(boolean isMagical) {
        this.isMagical = isMagical;
    }

    void testSetName(String leo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
