public class Person {

    protected String name;
    protected String surname;
    protected int age;
    protected String address;

    public boolean hasAge() {
        return this.age != 0;
    }

    public boolean hasAddress() {
        return this.address != null;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if(!hasAddress()) this.address = address;
    }

    public void happyBirthday() {
        this.age++;
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilderImpl()
                .setSurname(this.surname)
                .setAge(28)
                .setAddress(this.address);

    }

    // с уже заполненными фамилией (родительской), возрастом и текущим городом жительства (родительским).

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

}