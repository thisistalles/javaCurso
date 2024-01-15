public class Rectangle {
    public double width;
    public double height;

    public double Area() {
        return width * height;
    }

    public double Perimeter() {
        return 2 * (width + height);
    }

    public double Diagonal() {
        double diagonal;
        diagonal = Math.pow(width, 2) + Math.pow(height, 2);
        diagonal = Math.sqrt(diagonal);
        return diagonal;
    }

}
//Observações: tive ajuda do chatgpt só para saber como somar as potencias da "diagonal"
//fiquei consultando o codigo do "resolvendoComPOO" e "Learning_POO" só para ter uma base
//pesquisei na net só as formulas do "retangulo"
