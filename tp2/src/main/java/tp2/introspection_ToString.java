package tp2;

import java.awt.Point;
import java.awt.Polygon;

public class introspection_ToString {
    static public void main(String[] args) {
          System.out.println(new GenericToString().toString(new Point(12,24)));
          
          Polygon pol = new Polygon(new int[]{10, 20, 30}, new int[]{20,30, 40}, 3);
          pol.getBounds();
          System.out.println(new GenericToString().toString(pol, 2));
        }
}