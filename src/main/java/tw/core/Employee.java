package tw.core;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    public Employee(String name, Integer id, Integer age, String gender) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
