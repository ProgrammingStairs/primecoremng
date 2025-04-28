class Demo22{
    public static void main(String args[]){
        for(int i = 1 ; i<=5 ; i++) 
        {
            for(int j = 1; j<=10 ; j++)
            {
                if(i==1 && j!=6 || i==6 || j==1 || j==8 || j==10  ||  i==3 && j!=6 && j!=7 || j==5 || i==5 && j!=2 && j!=3 && j!=4 && j!=6 || i==4 && j!=2 && j!=3 && j!=4 && j!=6 && j!=7 && j!=9)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}

