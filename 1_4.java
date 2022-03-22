import java.util.Scanner;
import java.lang.Math;
class Main
  {
    public static void main(String[] args)
    {
    int program;
    double a;
    double b;
      System.out.println ("KALKULATOR\nWYBIERZ JEDNA Z OPCJI\n1. Suma pol dwoch kol\n2. Pole prostokata\n3. Pole trojkata prostokatnego\n4. Suma pol dwoch kwadratow");
      Scanner to = new Scanner (System.in);
      program = to.nextInt();

      switch(program)
        {
          case 1:
            double wynik;
            double potega = 2;
            System.out.println ("Wybrales opcje pierwsza, czyli sume pol dwoch kol\nPodaj promien kola 1 ");
            Scanner first = new Scanner (System.in);
            a = first.nextDouble();
            System.out.println ("Podaj promien kola 2 ");
            Scanner second = new Scanner (System.in);
            b = second.nextDouble();
            wynik = (3.14*Math.pow(a,potega))+(3.14*Math.pow(b,potega));
            System.out.println ("Wynik: "+wynik);
            break;
        }
    }
  }