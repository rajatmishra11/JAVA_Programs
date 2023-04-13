class ExceptionHandling3{
    public static void main(String args[]){
        //array out of index range
     try{
        int a[]= new int [6];
        System.out.println(a[7]);
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