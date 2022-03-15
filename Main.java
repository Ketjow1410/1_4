import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int kalkulator;
    double l1,l2;
    System.out.println("Wybierz program!");
    Scanner to = new Scanner(System.in);
    kalkulator = to.nextInt();
    switch(kalkulator){
      case 1:
        double wynik;
System.out.println("Suma");
System.out.println("Podaj 2 liczby aby obliczyc sume");
        Scanner first = new Scanner(System.in);
        l1=first.nextDouble();
         Scanner second = new Scanner(System.in);
        l2=second.nextDouble();
        wynik=l1+l2;
        System.out.println("Wynik to "+ wynik);
        break;
      case 2:
        double wynik2;
System.out.println("Różnica");
System.out.println("Podaj 2 liczby aby obliczyc roznice");
        Scanner first1 = new Scanner(System.in);
        l1=first1.nextDouble();
         Scanner second2 = new Scanner(System.in);
        l2=second2.nextDouble();
        wynik2=l1-l2;
        System.out.println("Wynik to "+ wynik2);
        break;
        case 3:
        double wynik3;
System.out.println("iloczyn");
System.out.println("Podaj 2 liczby aby obliczyc iloczyn");
        Scanner first2 = new Scanner(System.in);
        l1=first2.nextDouble();
         Scanner second3 = new Scanner(System.in);
        l2=second3.nextDouble();
        wynik3=l1*l2;
        System.out.println("Wynik to "+ wynik3);
        break;
        case 4:
        double wynik4;
System.out.println("iloraz");
System.out.println("Podaj 2 liczby aby obliczyc iloraz");
        Scanner first3 = new Scanner(System.in);
        l1=first3.nextDouble();
         Scanner second4 = new Scanner(System.in);
        l2=second4.nextDouble();
        if (l2!=0){
        wynik4=l1/l2;
        System.out.println("Wynik to "+ wynik4);
          }
          else System.out.println("dzielenie przez 0 nie jest mozliwe");
        break;
    
    }
  }
}