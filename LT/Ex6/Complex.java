//Thiết kế class Complex để thực hiện các phép toán cộng, trừ , nhân trên số phức
public class Complex {
    private double real;
    private double imaginary;
    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
  
    public double getReal(){
        return real;
    }
  
    public double getImaginary(){
        return imaginary;
    }
  
    public Complex add(Complex c){
        return new Complex(real + c.real, imaginary + c.imaginary);
    }

    public Complex subtract(Complex c){
        return new Complex(real - c.real, imaginary - c.imaginary);
    }
  
    public Complex multiply(Complex c){
        double realResult = real * c.real - imaginary * c.imaginary;
        double imaginaryResult = real * c.imaginary + imaginary * c.real;
        return new Complex(realResult, imaginaryResult);
    }
  
    @Override
    public String toString(){
        return real + " + " + imaginary + "i";
    }
}
