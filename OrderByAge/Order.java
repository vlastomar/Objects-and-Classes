package OrderByAge;

public class Order {
    private String name, id;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Order(String name, String id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }
    @Override
    public String toString(){
        String result = String.format("%s with ID: %s is %d years old.", this.name, this.id, this.age);
        return result;
    }

}
