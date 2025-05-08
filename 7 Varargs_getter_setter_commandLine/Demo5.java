// command line argument
class Demo5{
    public static void main(String args[]){    
     for(int i=0;i<args.length/2;i++){
        String temp = args[i];
        args[i] = args[args.length-1-i];
        args[args.length-1-i] = temp;
     }
     System.out.println("Array elements in reverse order : ");
     for(String ar : args){
        System.out.print(ar+"\t");
     }
    }
}