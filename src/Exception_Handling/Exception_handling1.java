package Exception_Handling;

public class Exception_handling1 {      //WRITING CODE TO EXCEPTION HANDLING OF ARRAYOUTOFINDEX

    public static void main(String[] args) {
        int[] arr= {6,8,9,11,45,67};

        try{
            int num = arr[9];
            System.err.print(num);
        }
        catch(Throwable e){
            System.out.println(e.getMessage());
        }

    }
    
}
