public class Main {

    public static void main(String[] args) {

        Person parent = new PersonBuilderImpl()
                .setName("Андрей")
                .setSurname(" Лоскутов")
                .setAge(57)
                .build();

        parent.happyBirthday();

        parent.setAddress("Петропавловск-Камчатский");
        System.out.println(parent);

        Person child = parent.newChildBuilder()
                .setName("Виктор")
                .build();

        child.happyBirthday();
        System.out.println(child);

    }
}