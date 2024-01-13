package week09.test.test1;

.........(1)......... class Person {
    private String name;
    .........(2)......... String gender;
    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getGender() {
        return gender;
    }
    .........(3)......... String getBio() {
        return "Name: " + name + ", Gender: " + gender;
    }
    .........(4)......... void getDetails();
}
