// program showing the concept of switch control statement
class Demo9{
    public static void main(String args[]){
        int num=5;
        switch(num%2){
            case 0 : 
                System.out.println("even number");
                break;
            default : 
                System.out.println("odd number");
                break;
        }
    }
}