public class kk96polymorphism { 
    static class Shapes{
        void area(){
            System.out.println("I am in shape");
        }
    }
        static class Circle extends Shapes{
            @Override
            void area(){
            System.out.println("Area is pie * r *r ");
            }

        }
        static class Triangle extends Shapes{
            @Override
            void area(){
            System.out.println("Area is 0.5*h*b ");
            }

        }
        static class Square extends Shapes{
            @Override
            void area(){
            System.out.println("Area is s*s ");
            }

        }
    
    
    public static void main(String[] args) {
        

       Circle circle =new Circle();
       Triangle triangle=new Triangle();
       Square square=new Square(); 
       circle.area();
       triangle.area();
       square.area();

    }
    
}
