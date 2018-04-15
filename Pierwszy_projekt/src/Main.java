public class Main {
    public static void main(String[] args)
    {
        /*
        Student maciek = new Student();
        maciek.id = 1;
        maciek.wiek = 19;
        maciek.imie = "Maciek";

        Student tomek = new Student();
        tomek.id = 2;
        tomek.wiek = 21;
        tomek.imie = "Tomek";

        System.out.println(tomek.imie + " is " + tomek.wiek + " years old");
        System.out.println(maciek.imie + " is " + maciek.wiek + " years old");
        */
        Student maciek = new Student();
        maciek.setId(1);
        maciek.setWiek(19);
        maciek.setImie("Maciek");

        Student tomek = new Student();
        tomek.setId(2);
        tomek.setWiek(21);
        tomek.setImie("Tomek");

        System.out.println(tomek.getImie() + " is " + tomek.getWiek() + " years old");
        System.out.println(maciek.getImie() + " is " + maciek.getWiek() + " years old");


    }


}
