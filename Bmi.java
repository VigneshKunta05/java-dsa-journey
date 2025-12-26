import java.util.*;
public class Bmi{
public static void main(String Args[]){
Scanner in=new Scanner(System.in);
System.out.println("Enter your weight in kg");
double Weight=in.nextDouble();
System.out.println("Enter your height in meters");
double Height=in.nextDouble();
double Bmi=Weight/Math.pow(Height,2);
System.out.println("Your BMI is " +Bmi);
}
}

 