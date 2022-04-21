package lesson11;

public class App {
    public static void main(String[] args) {
        String word = new String("Hello");

        Address annaAddress = new Address("123 Elm str","Gotham city", "66547",State.FL);

        Person anna = new Person("Anna","Peterson",1995,annaAddress);
        Person david = new Person("David","Dole",1998,new Address("18 Hollywood Blvd","Beverly Hills","91287",State.CA));


        Team team = new Team(anna,david);

        String davidStreet = team.getMember().getAddress().getStreet();
        System.out.println(davidStreet);

        Person p1 = team.getLeader();
        Address a1 = p1.getAddress();
        String str1 = a1.getStreet();
        System.out.println(str1);


    }
}
