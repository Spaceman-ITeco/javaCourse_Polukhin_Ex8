package interfaceenum;

public class Main {
    public static void main(String[] args) {
        Person person = new Client("Boris",29, Person.Sex.MALE,12000);

        person.personInformation();

        Client client = new Client("Zhanna", 52, Person.Sex.FEMALE,7000);

        client.print();

        Employee employee = new Employee("Vera",31, Person.Sex.FEMALE,Season.WINTER);

        employee.print();
        employee.execute();
    }
}
