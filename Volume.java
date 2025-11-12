public class Volume {
    static double sphere(double d) {
        double r = d / 2; //radius is half of diameter
        return(4.0 / 3.0 * Math.PI * (r*r*r)); // calculates the volume of the sphere and returns the result 
    }
    public static void main(String[] args) {
        System.out.println(sphere(20.24));
    }
    
}
