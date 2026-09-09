
public class Stu implements Comparable<Stu> {

    public int age;
    public String name;
    public int weight;

    @Override
    public String toString() {
        return "Stu{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Stu(int age, int weight, String name) {
        this.age = age;
        this.weight = weight;
        this.name = name;
    }

    @Override
    public int compareTo(Stu that) {
        // Sorting based on age
        if(this.age == that.age){
            return this.name.compareTo(that.name);
        }
        return that.age - this.age;
    }
}

