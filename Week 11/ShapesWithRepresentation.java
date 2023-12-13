import java.util.*;

interface Drawable{
        void draw();
}

class Circle implements Drawable{
        public void draw(){
                System.out.print("\nCircle\nO");
        }
}

class Rectangle implements Drawable{
        public void draw(){
                System.out.print("\nRectangle\n------------\n|          |\n------------");
        }
}

class Triangle implements Drawable{
        public void draw(){
                System.out.print("\nTriangle\n/\\\n--");
        }
}

class ShapesWithRepresentation{
        public static void main (String[] args) {
                int mainoption = 0;
                Scanner sc = new Scanner(System.in);

                while (mainoption != 4){
                        System.out.print("\n\nMain Menu\n1. Circle \n2. Rectangle \n3. Triangle\n4. Exit\nEnter your choice: ");
                        mainoption = sc.nextInt();
                        sc.nextLine();

                        if (mainoption == 1){
                                Circle circle = new Circle();
                                circle.draw();
                        }

                        else if (mainoption == 2){
                                Rectangle rectangle = new Rectangle();
                                rectangle.draw();
                        }

                        else if (mainoption == 3){
                                Triangle triangle = new Triangle();
                                triangle.draw();
                        }

                        else{
                                break;
                        }   
                }
                sc.close();
        }
}
