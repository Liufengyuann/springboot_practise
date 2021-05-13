package example.bean;

public class User {
    private String name;
    private Integer age;
    private Integer id;
    private Pet pet;

    public User(String name, Integer age, Integer id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public User(String name, Integer age, Integer id, Pet pet) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.pet = pet;
    }

    public User(String name, Integer age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
