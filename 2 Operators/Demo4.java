// program showing the concept of operators

class Demo4{
    public static void main(String args[]){
       int a=5,b=5;
       String str = (a > b) ? a+" is greater" : b+" is greater";
       System.out.println(str);

       String str1 = (a==b) ? "Both are equal" : ((a > b) ? a+" is greater" : b+" is greater");
       System.out.println(str1);
        
    }
}