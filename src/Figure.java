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

    public int calcVolume(int height, int width, int lenght) {
        int result = height * width * lenght;
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
        int a = lenght;
        int b = width;
        int h = height;
        int surface;
        surface = 2 * (this.lenght  * this.width + this.width * this.height + this.width * this.height);
        System.out.println(surface);
    }
}

