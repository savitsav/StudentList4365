package studentlist;

/**
 * This class represents a student.
 *
 * @author Paul Bonenfant
 */
public class Student {

    private String name;
    private String address;
    

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    
}

