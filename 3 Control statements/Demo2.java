// program of if statement
class Demo2{
    public static void main(String args[]){
        if(false)
            System.out.println("statement 1");
        if(true)
            System.out.println("statement 2");
        if(!false)
            System.out.println("statement 3");
        if(!!true)
            System.out.println("statement 4");
        if(5>2 && 6<4)
            System.out.println("statement 5");
        if(5>2 || 6<4)
            System.out.println("statement 6");
        if(!(5>2))
            System.out.println("statement 7");
        if(5>2==false)
            System.out.println("statement 8");
        if(!(5>2)==false)
            System.out.println("statement 9");  
    }
}