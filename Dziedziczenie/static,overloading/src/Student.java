public class Student {
    String imie;
    int wiek;

    static int num_of_stud=0;

    Student()
    {
        num_of_stud++;
    }
    public static int getNum_of_stud()
    {
        return (num_of_stud);
    }


    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }


}
