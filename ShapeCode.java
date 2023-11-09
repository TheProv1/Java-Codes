import java.util.*;

class Shape{
    private String color;
    private boolean filled;

    public Shape(){
        color = "green";
        filled = true;
    }

    public Shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String newcolor){
        color = newcolor;
    }

    public boolean isfilled(){
        return this.filled;
    }

    public void setFilled(boolean set){
        this.filled = set;
    }

    public String toString(){
        String check;
        if (filled){
            check = "filled";
        }

        else{
            check = "not filled";
        }

        return ("A Shape of color " + color + " and " + check);
    }
}

class Circle extends Shape{
    private double radius;

    public Circle(){
        super();
        radius = 1.0;
    }

    public Circle(double radius){
        super();
        this.radius = radius;
    }

    public Circle(double radius, boolean filled, String color){
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double newradius){
        radius = newradius;
    }

    public double getArea(){
        return (Math.PI * radius * radius);
    }

    public double getPerimeter(){
        return (2 * Math.PI * radius);
    }

    @Override
    public String toString(){
        return ("Circle of radius " + radius + "which is the subclass of " + super.toString());
    }
}

class Rectangle extends Shape{
    private double width;
    private double length;
    
    public Rectangle(){
        width = 1.0;
        length = 1.0;
    }

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width, String color, boolean filled){
        super(color, filled);
        this.length = length;
        this.width = width;
    }

    public void setLength(double newlength){
        length = newlength;
    }
    
    public double getLength(){
        return this.length;
    }

    public void setWidth(double newwidth){
        width = newwidth;
    }
    
    public double getWidth(){
        return this.width;
    }
    
    public double getArea(){
        return (length * width);
    }
    
    public double getPerimeter(){
        return (2 * (length + width));
    }

    @Override
    public String toString(){
        return ("A rectangle of width: " + width + "and length: " + length + ", which is a subclass of " + super.toString());
    }
}

class Square extends Rectangle{
    public Square(){
        super();
    }

    public Square(double side){
        super(side,side);
    }

    public Square(Double side, String color, boolean filled){
        super(side, side, color, filled);
    }

    public double getSide(){
        return getWidth();
    }

    public void setSide(double newside){
        setWidth(newside);
        setLength(newside);
    }

    @Override
    public String toString(){
        return ("A square of side " + getSide() + " which is a subclass of " + super.toString());
    }
}

class ShapeCode{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int menuoption = 0;
        
        while (menuoption != 4){
            System.out.print("\nMain Menu \n1. Circle \n2. Rectangle \n3. Square \n4. Exit \nEnter your choice: ");
            menuoption = sc.nextInt();
            sc.nextLine();

            if (menuoption == 1){
                System.out.println("\nEnter the color of the circle: ");
                String circlecolor = sc.nextLine();

                System.out.println("\nEnter the radius of the circle: ");
                double circleradius = sc.nextDouble();
                sc.nextLine();

                System.out.println("\nIs the circle filled with the color(true/false): ");
                boolean circlefill = sc.nextBoolean();
                sc.nextLine();

                Circle circle = new Circle(circleradius, circlefill, circlecolor);

                System.out.println("The area of the circle is: " + circle.getArea() + "\nThe perimeter of the circle is: " + circle.getPerimeter());
            }

            if (menuoption == 2){
                
                System.out.println("\nEnter the color of the rectangle: ");
                String rectanglecolor = sc.nextLine();

                System.out.println("\nEnter the width of the rectangle: ");
                double rectanglewidth = sc.nextDouble();
                sc.nextLine();

                System.out.println("\nEnter the length of the rectangle: ");
                double rectanglelength = sc.nextDouble();
                sc.nextLine();

                System.out.println("\nIs the rectangle filled with the color(true/false): ");
                boolean rectanglefill = sc.nextBoolean();
                sc.nextLine();

                Rectangle rectangle = new Rectangle(rectanglelength, rectanglewidth, rectanglecolor, rectanglefill);

                System.out.println("The area of the rectangle is: " + rectangle.getArea() + "\nThe perimeter of the rectangle is: " + rectangle.getPerimeter());
            
            }

            if (menuoption == 3){
                System.out.println("\nEnter the color of the square: ");
                String squarecolor = sc.nextLine();

                System.out.println("\nEnter the length of the square: ");
                double squarelength = sc.nextDouble();
                sc.nextLine();

                System.out.println("\nIs the square filled with the color(true/false): ");
                boolean squarefill = sc.nextBoolean();
                sc.nextLine();

                Square square = new Square(squarelength, squarecolor, squarefill);

                System.out.println("The area of the square is: " + square.getArea() + "\nThe perimeter of the square is: " + square.getPerimeter());
            }

            if (menuoption == 4){
                break;
            }
        } 

        sc.close();
    }
}
