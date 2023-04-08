//Thiết class TestComplex nhập vào 2 số phức tính tổng , hiệu và tích 2 số phức và in ra màn hình
public class Complex2{
    private double real;
    private double img;

    public Complex2(double real, double img){
        this.real = real;
        this.img = img;
    }

    public Complex add(Complex2 c){
        return new Complex(real + c.real, img + c.img);
    }

    public Complex subtract(Complex2 c){
        return new Complex(real - c.real, img - c.img);
    }

    public Complex multiply(Complex2 c){
        double realPart = real * c.real - img * c.img;
        double imgPart = real * c.img + img * c.real;
        return new Complex(realPart, imgPart);
    }

    @Override
    public String toString(){
        return real + " + " + img + "i";
    }
}
