public class Main {

    public static void main(String[] args) {
        Thao thao = new Thao();

        Person p = new Thao();

        thao.setName("Sieu Nhan");
        thao.setRice(1000);

        p.setName("Java");
//        p.setRice(2000);

        thao.information();
        p.information();

        Person person = new Person();
        person.information();
    }
}
