package interfaceenum;

import java.awt.*;

public class Employee extends Person implements Printable,ClickHandler{


    public Season getSeason() {
        return season;
    }

    private final Season season;

    Employee(String name, int age, Sex sex, Season season) {
        super(name, age, sex);
        this.season = season;
    }

    @Override
    public void execute() {

        System.out.println("Сейчас " + getSeason() + " Цвет сезона " + getSeason().getColour());

    }

    @Override
    public void print() {
    personInformation();
    }

    @Override
    public void personInformation()
    {
        if (sex == Sex.MALE) {
            System.out.println("This is  " + getName() + ". He is " + getAge() + " years old. " +
                    "He is our employee. He usually takes a vacation in the " + getSeason() + ".");
        }
        if (sex == Sex.FEMALE)
            System.out.println("This is  " + getName() + ". She is " + getAge() + " years old. " +
                    "She is our employee. She usually takes a vacation in the " + getSeason() + ".");
    }
}
