// command line argument
class Demo4{
    public static void main(String args[]){
        System.out.println("Length : "+args.length);
        int sum = 0;
        for(String element : args){
            sum = sum + Integer.parseInt(element);
        }
        System.out.println("Sum : "+sum);
    }
}