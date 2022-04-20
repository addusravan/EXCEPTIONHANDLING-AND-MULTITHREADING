 class CatchDemo2 {
     public static void main(String[] args) {
         try {
             int a[] = new int[10];
             System.out.println(a[11]);


         }
         catch(Exception E){

             System.out.println(E);
         }
     }
 }
