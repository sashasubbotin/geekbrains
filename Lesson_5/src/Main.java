public class Main {

    public static void main(String[] args) {

        Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
        persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Person("Ivanov Ivan1", "Engineer1", "ivivan1@mailbox.com", "846549845", 64484, 41);
        persArray[2] = new Person("Ivanov Ivan2", "Engineer2", "ivivan2@mailbox.com", "876548454", 458784, 39);
        persArray[3] = new Person("Ivanov Ivan3", "Engineer3", "ivivan3@mailbox.com", "874564874", 47874, 66);
        persArray[4] = new Person("Ivanov Ivan4", "Engineer4", "ivivan4@mailbox.com", "984654845", 84551, 69);
        for (int i = 0; i < persArray.length; i++){
            if(persArray[i].getAge() > 40){
                persArray[i].show();
            }
            System.out.println();
        }
    }
}
