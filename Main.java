import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner d = new Scanner(System.in);
    while(true){
    System.out.println("************  KALKULATOR *****************");
    System.out.println("Wybierz: ");
    System.out.println("1-pole prostokąta");
    System.out.println("2-pole trójkąta");

    int liczba = d.nextInt();
    

    if(liczba<1 || liczba>2){
        System.out.println("Podaj liczbę od 1 do 2 ");
    }
      else{
    System.out.println("Podaj liczbe a:");
    float a = d.nextFloat();
    System.out.println("Podaj liczbe b (liczba b w przypadku trojkata jest wysokością):");
    float b = d.nextFloat();
      
    switch(liczba){
      case 1:
        System.out.println("Pole prostokąta : " + (a * b));
        break;
      case 2:
        System.out.println("Pole trójkąta prostokątnego to : " + (a*b)/2);
        break;

    
        }
      }
    }  
  }
}