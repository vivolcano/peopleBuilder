public class PersonBuilderImpl implements PersonBuilder {

    Person person = new Person();

    @Override
    public PersonBuilder setName(String name) {
        person.name = name;
        return this;
    }

    @Override
    public PersonBuilder setSurname(String surname) {
        person.surname = surname;
        return this;
    }

    @Override
    public PersonBuilder setAge(int age) {
        if (age > 0) {
            person.age = age;
            return this;
        } else {
            throw new IllegalArgumentException("Age must be positive!");
        }
    }

    @Override
    public PersonBuilder setAddress(String address) {
        person.address = address;
        return this;
    }

    @Override
    public Person build() {
        if (person.surname == null)
            throw new IllegalArgumentException("The \"surname\" field must be filled in!");
        return person;
    }
}