/*
The celcius to farenheit function should take a celcius variable which would be a double. It would return a double Farenheit.
The farenheit to celcius function should take a farenheit variable which would be a double. It would return a double celcius.
*/
public class CtoFTester{
  public static double celsiusToFahrenheit(double C){
    double F;
    F = ((9*C)/5) + 32;
    return F;
  }
  public static double fahrenheitToCelsius(double F){
  double C;
  C = (F-32)*(5.0/9.0);
  return C;
  }
  public static void main(String[] args){
  System.out.println("0 Celcius is equal to " +  celsiusToFahrenheit(0.0) + " degrees Fahrenheit");
  System.out.println("32 Fahrenheit is equal to " + fahrenheitToCelsius(32.0) + " degrees Celcius");
  }
}
