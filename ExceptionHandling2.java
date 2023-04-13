class ExceptionHandling2{
    public static void main(String args[]){
        //NUll pointer Execption->
     try{
        String str=null;
        System.out.println(str.length());
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