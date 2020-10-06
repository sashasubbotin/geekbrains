class Person {
    private String fio;
    private String post;
    private String email;
    private String phone;
    private double salary;
    private int age;

    Person(String fio, String post, String email, String phone, double salary, int age) {
        this.fio = fio;
        this.post = post;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }
    void show(){
        System.out.println(fio + " " + post + " " +  email + " " + phone + " " + salary + " " + age);
    }
    public int getAge(){
        return  age;
    }
}