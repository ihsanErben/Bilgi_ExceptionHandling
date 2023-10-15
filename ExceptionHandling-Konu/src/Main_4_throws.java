
import java.io.IOException;
import java.util.Scanner;


public class Main_4_throws {
    
    public static void kontrol(int x) throws IOException {
    
        if(x < 18){
        
        throw new IOException();
        }else{
        
            System.out.println("mekana hosgeldiniz.");
        }
    }
    
    
    
    public static void AAmain(String[] args) throws IOException{
        
    Scanner input = new Scanner(System.in);
    System.out.print("lutfen yasinizi girin: ");
    int yas = input.nextInt();
     
    try{
    kontrol(yas);
    }
    
     catch(IOException x){
         System.out.println("IO:::::::::::::::18 yasinden kucukler mekana giremez.");
     }
     
     }
}
