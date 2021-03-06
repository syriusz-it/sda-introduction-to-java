package zajecia7.zadanie6_Inheritance;
//Klasa bazowa - superclass
public class Person {
    protected String name;
    private String surname;
    private int age;


    public Person(String name, String surname, int age){
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String describe() {
        return name + " " + getSurname() + " " + getAge(); //przeniesione z Student
                                                            //tu nie trzeba this (domyslnie)
    }

    @Override
    public String toString() {
        return name + " " + getSurname() + " " + getAge();
    }
}
