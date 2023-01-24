
package covidmanagementfxmlapplication;

/**
 *
 * @author Asus
 */
public class AdminClass extends User{
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public AdminClass(String gmail, String password) {
        super(gmail, password);
        this.name = name;
    }
     
}
