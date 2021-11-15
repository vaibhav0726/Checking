public class MathOperation {
    public static void main(String args[]) {
        int arr[]=new int[5];
        try{
        for(int i=0;i<5;i++){
            arr[i]=args[i]; //this statement is generating error
        }
    }
    catch(ArithmeticException e){
        System.out.println(e);
    }
    catch(NumberFormatException e){
        System.out.println(e);
    }
    }
}
