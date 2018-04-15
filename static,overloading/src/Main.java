public class Main {
    public static void main(String[] args)
    {
       /* Box.age_static=20;
        Box box = new Box();
        box.age = Box.age_static;
        box.name_it("pudlo");
        System.out.println(box.age);
        Box.name_it_static("karton");
        Box box1 = new Box();
        box1.age = 30;
        System.out.println(box1.age);
        Box box2 = new Box();
        System.out.println(box2.age); // MK: A wiec po co przypisywac wartosci do Box ???
        */

       Student maciek = new Student();
       System.out.println(maciek.getNum_of_stud());
       Student michal = new Student();
       System.out.println(michal.getNum_of_stud()); // MK: hmm dlaczego tutaj moge odwolac sie przez nazwe studenta???
       System.out.println(Student.getNum_of_stud());

    }
}
