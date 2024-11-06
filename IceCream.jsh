import java.util.Scanner;  

Scanner scanner = new Scanner(System.in);  

int vanillaPrice = 95; 
int chocolatePrice = 44; 
int strawberryPrice = 80; 
int conePrice = 100;  

System.out.print("Would you like (v)anilla, (c)hocolate or (s)trawberry? ");  
char flavour = scanner.next().toLowerCase().charAt(0);  

if (flavour != 'v' && flavour != 'c' && flavour != 's') {  
    System.out.println("We don't have that flavour.");  
} else {  
     
    System.out.print("How many scoops would you like? ");  
    int scoops = scanner.nextInt();  
  
    if (scoops < 1) {  
        System.out.println("We don't sell just a cone.");  
    } else if (scoops > 3) {  
        System.out.println("That's too many scoops to fit in a cone.");  
    } else {  
               
 int pricePerScoop = -1;  
        
        switch (flavour) {  
            case 'v':  
                pricePerScoop = vanillaPrice;  
                break;  
            case 'c':  
                pricePerScoop = chocolatePrice;  
                break;  
            case 's':  
                pricePerScoop = strawberryPrice;  
                break;  
        }  

        int totalPrice = conePrice + (pricePerScoop * scoops);  

       
        System.out.printf("That will be %d.%02d please.%n", totalPrice / 100, totalPrice % 100);  
    }  
}  
