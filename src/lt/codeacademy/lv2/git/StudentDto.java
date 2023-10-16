package lt.codeacademy.lv2.git;

public class StudentDto {

    private final String fullName;

    public StudentDto(String name, String fullName) {
        this.fullName = fullName;
    }

    public String getName() {
        return fullName;
    }

}
