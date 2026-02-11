public class VolumeCalculator {

    // Volume of Cube: V = a^3
    public static double volume(double side) {
        return side * side * side;
    }

    // Volume of Cuboid: V = l * b * h
    public static double volume(double length, double breadth, double height) {
        return length * breadth * height;
    }

    // Volume of Cylinder: V = π * r^2 * h
    public static double volume(double radius, double height, boolean isCylinder) {
        return Math.PI * radius * radius * height;
    }

    // Volume of Cone: V = (1/3) * π * r^2 * h
    public static double volume(double radius, double height, char shapeType) {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }

    // Volume of Sphere: V = (4/3) * π * r^3
    public static double volume(float radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }

    // Volume of Hemisphere: V = (2/3) * π * r^3
    public static double volume(double radius, boolean isHemisphere) {
        return (2.0 / 3) * Math.PI * radius * radius * radius;
    }

    public static void main(String[] args) {

        System.out.println("Volume of Cube (side=3): " + volume(3));
        System.out.println("Volume of Cuboid (2,3,4): " + volume(2,3,4));
        System.out.println("Volume of Cylinder (r=2, h=5): " + volume(2,5,true));
        System.out.println("Volume of Cone (r=2, h=5): " + volume(2,5,'C'));
        System.out.println("Volume of Sphere (r=3): " + volume(3f));
        System.out.println("Volume of Hemisphere (r=3): " + volume(3,true));
    }
}

