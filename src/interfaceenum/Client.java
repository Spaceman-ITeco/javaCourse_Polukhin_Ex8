package interfaceenum;

public class Client extends Person implements Printable, ClickHandler{

    public int getExpense() {
        return expense;
    }

    public void setExpense(int expense) {
        this.expense = expense;
    }

    private int expense;


    Client(String name, int age, Person.Sex sex, int expense) {
        super(name, age, sex);
        this.expense = expense;
    }

    @Override
    public void personInformation()
    {
        if (sex == Sex.MALE) {
            System.out.println("This is  " + getName() + ". He is " + getAge() + " years old. " +
                    "He is our client. He pays us " + getExpense() + " every year.");
        }
        if (sex == Sex.FEMALE)
            System.out.println("This is  " + getName() + ". She is " + getAge() + " years old. " +
                    "She is our client. She pays us " + getExpense() + " every year.");
    }

    @Override
    public void execute() {

    }

    @Override
    public void print() {
        personInformation();
    }
}
