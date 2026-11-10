public class Student {
    private int studentID;
    private String name;
    private String department;
    private String address;

    public Student(int studentID, String name, String department, String address) {
        this.studentID = studentID;
        this.name = name;
        this.department = department;
        this.address = address;
    }

    public Student(int studentID, String name, int departmentCode, String address) {
        this(studentID, name, codeToDepartment(departmentCode), address);
    }

    private static String codeToDepartment(int code) {
        switch (code) {
            case 1: return "Computer science";
            case 2: return "Information Systems";
            case 3: return "Electrical Engineering";
            case 4: return "Mathematics";
            default: return "Unknown";
        }
    }



public int getStudentID() {
    return studentID;
}

public void setStudentID (int studentID) {
    this.studentID = studentID;
}

public String getName() { 
    return name; 
}

public void setName(String name) { 
    this.name = name; 
}

public String getDepartment() { 
    return department; 
}

    public void setDepartment(String department) { 
    this.department = department; 
}

    public void setDepartment(int departmentCode) { 
    this.department = codeToDepartment(departmentCode); 

}
 
    public String getAddress() { 
    return address; 
}

    public void setAddress(String address) { 
        this.address = address; 
}

@Override
public String toString () {
    return String.format (
        "ID: %d | Nama: %-8s | Department: %-22s | Address: %s",studentID, name, department, address);
    }
}
