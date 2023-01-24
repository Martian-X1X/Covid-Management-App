
package covidmanagementfxmlapplication;

/**
 *
 * @author Asus
 */
public class NewPatient {
    protected String name;
    protected String disease;
    protected int cell;

    public NewPatient(String name, String disease, int cell) {
        this.name = name;
        this.disease = disease;
        this.cell = cell;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public int getCell() {
        return cell;
    }

    public void setCell(int cell) {
        this.cell = cell;
    }
    
}
