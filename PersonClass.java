class PersonClass {

    private String name;
    private int age;

    public PersonClass(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void changeName(String name) {
        if (!name.isEmpty()) {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Persons name is " + name + "and is " + age + "years old";
    }
}
