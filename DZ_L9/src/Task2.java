public class Task2 {

    interface Figure {
        double calcPerimeter();
        double calcArea();
    }

    static class Circle implements Figure {
        private final double radius;
        private final String backgroundColor;
        private final String borderColor;

        public Circle(double radius, String backgroundColor, String borderColor) {
            this.radius = radius;
            this.backgroundColor = backgroundColor;
            this.borderColor = borderColor;
        }

        public double calcPerimeter() {
            return 2 * Math.PI * radius;
        }

        public double calcArea() {
            return Math.PI * radius * radius;
        }

        public String toString() {
            return "Круг: " + "Периметр = " + calcPerimeter() + "; " +
                    "Площадь = " + calcArea() + "; " +
                    "Цвет фона = " + backgroundColor + "; " +
                    "Цвет границы = " + borderColor;
        }
    }

    static class Rectangle implements Figure {
        private final double width;
        private final double height;
        private final String backgroundColor;
        private final String borderColor;

        public Rectangle(double width, double height, String backgroundColor, String borderColor) {
            this.width = width;
            this.height = height;
            this.backgroundColor = backgroundColor;
            this.borderColor = borderColor;

        }

        @Override
        public double calcPerimeter() {
            return 2 * (width + height);
        }
        @Override
        public double calcArea() {
            return width * height;
        }

        public String toString() {
            return "Прямоугольник: " + "Периметр = " + calcPerimeter() + "; " +
                    "Площадь = " + calcArea() + "; " +
                    "Цвет фона = " + backgroundColor + "; " +
                    "Цвет границы = " + borderColor;
        }
    }

    static class Triangle implements Figure {
        private final double side1;
        private final double side2;
        private final double side3;
        private final String backgroundColor;
        private final String borderColor;

        public Triangle(double side1, double side2, double side3, String backgroundColor, String borderColor) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
            this.backgroundColor = backgroundColor;
            this.borderColor = borderColor;
        }
@Override
        public double calcPerimeter() {
            return side1 + side2 + side3;
        }
@Override
        public double calcArea() {
            double semiperimeter = calcPerimeter() / 2;
            return Math.sqrt(semiperimeter * (semiperimeter - side1) * (semiperimeter - side2) * (semiperimeter - side3));
        }

        public String toString() {
            return "Треугольник: " + "Периметр = " + calcPerimeter() + "; " +
                    "Площадь = " + calcArea() + "; " +
                    "Цвет фона = " + backgroundColor + "; " +
                    "Цвет границы = " + borderColor;
        }
    }

    public static class Main {
        public void main(String[] args) {
            Figure circle = new Circle(15, "yellow", "pink");
            Figure rectangle = new Rectangle(10, 2, "grey", "purple");
            Figure triangle = new Triangle(4, 4, 7, "black", "orange");

            System.out.println(circle);
            System.out.println(rectangle);
            System.out.println(triangle);
        }
    }
}
