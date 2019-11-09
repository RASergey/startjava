
public class Calculator{

  public static void main(String[] args){

    int firstNumber = 5;
    int secondNumber = 3;
    char sign = '+';
    int rezult;
    if(sign == '+'){
      rezult = firstNumber + secondNumber;
      System.out.println(rezult);
    }else if(sign == '-'){
      rezult = firstNumber - secondNumber;
      System.out.println(rezult);
    }else if(sign =='*'){
      rezult = firstNumber * secondNumber;
      System.out.println(rezult);
    }else if (sign == '/') {
      rezult = firstNumber / secondNumber;
      System.out.println(rezult);
    }else if (sign == '%') {
      rezult = firstNumber % secondNumber;
      System.out.println(rezult);
    }else if (sign == '^') {
        rezult = firstNumber;
        for (int i = 1; i < secondNumber; i++ ) {
        rezult *=firstNumber;
        }
      System.out.println(rezult);
    }
  }
}
