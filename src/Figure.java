public class Figure {

    int height;
    int width;
    int lenght;

    public Figure() {
    }


    public Figure(int height, int width, int lenght) {
        this.height = height;
        this.width = width;
        this.lenght = lenght;


    }

    public int calcVolume() {
        int result = this.height * this.width * this.lenght;
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
        int surface;
        surface = (int) (2 * (this.lenght  * this.width + this.width * this.height + this.width * this.height));
        System.out.println(surface);
    }
}

