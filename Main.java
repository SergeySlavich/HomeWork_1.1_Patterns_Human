public class Main {
    public static void main(String[] args) {
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();
        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .build();
        System.out.println("У " + mom + " есть сын, " + son);

        try {
            // Не хватает обязательных полей
            new PersonBuilder().build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            new PersonBuilder().setAge(-100).build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }

//        Person testPerson = new PersonBuilder()
//                .setName("Victor")
////                .setName("Zigmund")
//                .setSurname("Veselov")
////                .setSurname("Freid")
////                .setAge(-5)
//                .setAge(25)
////                .setAge(37)
//                .setAddress("Vologda")
////                .setAddress("Karaganda")
//                .build();
//        System.out.println("testPerson " + testPerson + " " + this.getSurname() + " " + this.getAge() + " " + this.getAddress());
//        testPerson.happyBirthday();
//        testPerson.setAddress("Karaganda");
//        System.out.println("testPerson " + testPerson + " " + this.getSurname() + " " + this.getAge() + " " + this.getAddress());
    }
}