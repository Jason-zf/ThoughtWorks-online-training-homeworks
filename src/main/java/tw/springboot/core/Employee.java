package tw.springboot.core;

public class Employee {
    private Integer id;
    private String name;
    private Integer age;
    private String gender;

    public Employee() {
        this.id = 0;
        this.name = "name";
        this.age = 0;
        this.gender = "男";
    }

    public Employee(Integer id, String name, Integer age, String gender) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
