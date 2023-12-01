public class swapping_2_numbers_function {
    public static void main(String[] args){
    
    int c[]={4,5};
    
      int x[]=func(c);
      for(int i=0;i<x.length;i++){
        System.out.println(x[i]);
      }
    }

    
    public static int[] func(int res[]){
      
       /*  a = a^b;
        b=a^b;
        a = a^b;
       */
        res[0]=res[0]^res[1];
        res[1]=res[0]^res[1];
        res[0]=res[0]^res[1];
        return res;
       
    
    }
}
