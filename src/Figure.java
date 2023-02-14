public class Figure {

    double height;
    double width;
    double lenght;

    public Figure() {
    }


    public Figure(double height, double width, double lenght) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;


    }

    public double calcVolume() {
        double result = height * width * lenght;
        return result;
    }

    public int giveMeFive( ) {
        int a = 1;
        int b = 2;
        int c = 3;
        int x = a * b * c;
        int result = x;
        return result;
    }
    public void showSurface() {
        double a = lenght;
        double b = width;
        double h = height;
        int surface;
        surface = (int) (2 * (this.lenght  * this.width + this.width * this.height + this.width * this.height));
        System.out.println(surface);
    }
}

