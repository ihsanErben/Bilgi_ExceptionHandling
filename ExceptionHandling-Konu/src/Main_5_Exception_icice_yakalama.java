
public class Main_5_Exception_icice_yakalama {
    public static void AAmain(String[] args){
        
        birinci();
        
    }
    
    public static void ucuncu(){
    
    int a = 5/0;
    }    
    
    public static void ikinci(){
    
    ucuncu();
    }
    
    public static void birinci(){
    try{
    ikinci();
    }
    catch(ArithmeticException a){
        System.out.println("sorun yok babus");
    }
    
    }
}
