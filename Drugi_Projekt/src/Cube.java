public class Cube {
    int length;
    int breadth;
    int height;

    Cube()
    {
        length = 15;
        breadth = 25;
        height = 35;
    }
    Cube(int l,int b, int h)
    {
        length = l;
        breadth = b;
        height = h;
    }


    public int getCubeVolume()
    {
        return(length*breadth*height);
    }

}
