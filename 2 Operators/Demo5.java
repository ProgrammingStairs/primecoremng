// program showing the concept of operators

class Demo5{
    public static void main(String args[]){
       int a=10,res;
//       res = a++ + ++a + --a - a-- - a--;
         //  10  +  12 + 11  - 11 - 10 

      // res = --a - --a + a++ - a++ - --a;  
         //   9  - 8 + 8 - 9 - 9

        res = --a + a-- - ++a + a++ - a;
        //    9   + 9   -  9  + 9 - 10 
       System.out.println(res);        
    }
}