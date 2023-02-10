public class Figure {

    int height;
    int width;
    int lenght;

    public Figure() {
    }


    public Figure(int height, int width, int lenght) {
        this.height = 5;
        this.width = 3;
        this.lenght = 4;

    }

    public int calcVolume(int height, int width, int lenght) {
        int result = height * width * lenght;
        return result;
    }

    public int giveMeFive( ) {
        int a = 5;
        int b = 3;
        int c = 4;
        int x = a * b * c;
        int result = x;
        return result;
    }
    public void showSurface() {
        int a = 2;
        int b = 1;
        int h = 6;
        int surface;
        surface = 2 * (a * b + a * h + b * h);
        System.out.println(surface);
    }
}

