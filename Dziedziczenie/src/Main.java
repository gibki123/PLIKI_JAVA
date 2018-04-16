import javax.swing.table.TableRowSorter;

public class Main {
    public static void main(String[] args){

        Prostokąt prost = new Prostokąt();
        Trójkąt trój = new Trójkąt();

        prost.set_values(10,10);
        trój.set_values(10,10);

        System.out.println(prost.area());
        System.out.println(trój.area());


    }
}
