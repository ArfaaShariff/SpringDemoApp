package demo;

/**
 * Created by plank-arfaa on 9/2/2015.
 */
public class triangle {

    private String type;

    public triangle(String type)
    {
        this.type = type;
    }

    public  String getType() {
        return type;
    }

   /* public void setType(String type) {
        this.type = type;
    }*/

    public void draw(){
        System.out.println( getType()+" Triangle drawn");
    }
}
