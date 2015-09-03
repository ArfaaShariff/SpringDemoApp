package demo;

/**
 * Created by plank-arfaa on 9/2/2015.
 */
public class triangle {

    private String type;
    private int height;

    public int getHeight() {
        return height;
    }

    public triangle(String type)
    {
        this.type = type;
    }
    public triangle(String type,int height)
    {
        this.type = type;
        this.height=height;
    }

    public  String getType() {
        return type;
    }

   /* public void setType(String type) {
        this.type = type;
    }*/

    public void draw(){
        System.out.println( getType()+" Triangle drawn of height " + getHeight());
    }
}
