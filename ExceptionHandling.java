class ExceptionHandling{
    public static void main(String args[]){
        //divide by zero
     try{
        int a=10;
        int b=0;
        System.out.println(a/b);
     }
     catch(Exception e){
        System.out.println("Error Occured");
        System.out.println(e);
     }     
     finally{
         System.out.println("Finally block always executed");
     }
    }
}