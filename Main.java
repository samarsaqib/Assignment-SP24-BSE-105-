//Samar Saqib
//SP24-BSE-105
//Section(B)
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Shop shop= new Shop(new Person("John", "email"),"Lahore");
Scanner sc = new Scanner(System.in);
while(true) {
int choice= sc.nextInt();
 switch (choice) {
 case 1:
     shop.addProduct();
     break;
 case 2:
     shop.sale();
     break;
 case 3:
      shop.update();
      break;
 case 4:
    shop.display();
    break;
 case 0:
     System.exit(0);
     break;
 default:
  }
    }
    }
}