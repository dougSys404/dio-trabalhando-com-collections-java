package exercises.list;

public class Cat implements Comparable<Cat> {

    private String name;
    private Integer age;
    private String color;

    public  Cat(){}

    public Cat(String name, Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" + "Nome = " + name +
                ", Idade = " + age +
                ", Cor = " + color
                +"}";

    }

    /*
    Comparable<T>:
        É uma interface da linguagem Java.
        Define a ordem natural dos objetos de uma classe.
        Permite que objetos sejam comparados e ordenados com métodos
        como Collections.sort().
     */

    @Override
    public int compareTo(Cat o) {
        return this.getName().compareToIgnoreCase(o.getName());
    }
}
