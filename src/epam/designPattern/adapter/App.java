package epam.designPattern.adapter;

/**
 * Created by vaidyar on 3/5/17.
 */

/**
 * This is the adapter interface
 */
interface ShapeAdapter{
    void render(int x1,int y1,int x2,int y2);
}

/**
 * The concrete Adatper class
 */
class RectangleAdapter implements ShapeAdapter{
    @Override
    public void render(int x1, int y1, int x2, int y2) {
        new LegacyRectangle().render(x1,y1,x1+x2,y1+y2);
    }
}

/**
 * This is the adaptee class i.e. one which needs to be adapted
 */
class LegacyRectangle{
    void render(int x1,int y1,int width,int height){
        System.out.println("Legacy rectangle");
    }
}

/**
 * Client wants to use a object
 */
public class App {
   public static void main(String...args){
         new RectangleAdapter().render(10,10,5,5);
   }
}
