package dto;

public class TableDataDTO {
    private String employeeId;
    private String employeeName;
    private String gender;
    private Integer age;
    private String departmentName;
    private String employeeType;

    public TableDataDTO() {
    }

    public TableDataDTO(String employeeId, String employeeName,
                        String gender, Integer age,
                        String departmentName, String employeeType) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.gender = gender;
        this.age = age;
        this.departmentName = departmentName;
        this.employeeType = employeeType;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public void setEmployeeType(String employeeType) {
        this.employeeType = employeeType;
    }
}
