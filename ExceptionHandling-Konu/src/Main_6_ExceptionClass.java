
public class Main_6_ExceptionClass {

    public static void main(String[] args) {
       try{
         kontrol(5);  
       } 
       catch(YasException x){
       System.out.println("VAOOOOOOOO");
       x.printStackTrace();
       }
        
    }
    
    public static void kontrol(int yas){
    
        if(yas < 18){
            
            throw new YasException();
        
        }else{
            System.out.println(); 
            System.out.println("mekana hosgeldiniz.");
        }
    }
    
}







class YasException extends ArithmeticException {


    @Override
    public void printStackTrace() {
        System.out.println("Yas hatasi aldiniz.");
    }

}
