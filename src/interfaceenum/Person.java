package interfaceenum;

public abstract class Person {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int age;
    Sex sex;


    enum Sex
    {MALE("male"),
    FEMALE("female");


        public String getSex() {
            return sex;
        }

        public void setSex(String sex) {
            this.sex = sex;
        }

        private String sex;
        Sex(String sex) {
            this.sex=sex;
        }
    };


    Person(String name,
           int age, Sex sex)
    {this.name=name;
        this.age = age;
        this.sex = sex;
    }

    public void personInformation()
    {
        if (sex == Sex.MALE) {
            System.out.println("This is  " + name + ". He is " + age + " years old.");
        }
        if (sex == Sex.FEMALE)
            System.out.println("This is  " + name + ". She is " + age + " years old.");
    }
}
