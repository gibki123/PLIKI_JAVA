public class mainClass {
    public static void main(String[] args)
    {
        Cube cube1 = new Cube();

        Cube cube2 = new Cube(30,30,30);

        System.out.println(cube1.getCubeVolume());
        System.out.println(cube2.getCubeVolume());
    }

}
