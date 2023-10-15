
import java.util.Scanner;


public class Main_3_throw {
    
    public static void kontrol(int x){
    
        if(x < 18){
        throw new ArithmeticException();
        }else{
        
            System.out.println("mekana hosgeldiniz.");
        }
        
        
    
    }
    
    
    
    public static void AAmain(String[] args){
        
    Scanner input = new Scanner(System.in);
    System.out.print("lutfen yasinizi girin: ");
    int yas = input.nextInt();
     
    try{
    kontrol(yas);
    }
    
     catch(ArithmeticException x){
         System.out.println("18 yasinden kucukler mekana giremez.");
     }
     
     }
}
