// program showing the concept of armstrong number

import java.util.Scanner;
class Demo17{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        int num = sc.nextInt();
        int count = 0;
        int sum = 0;
        int temp = num;
        int temp1 = num;

        while(num>0){
            count++;
            num=num/10;
        }        

        while(temp>0){
            int rem = temp%10;
            sum = (int)(sum + Math.pow(rem,count));
            temp = temp/10;
        }

        if(sum == temp1)
            System.out.println("Armstrong number");
        else
            System.out.println("Not an Armstrong number");
    }
}

/*
  1.  Program to print n natural number
  2.  1   4   9   25  36  49  ....
  3.  0   1   8   27  64  125 ........
  4.  1/1    1/2     1/3     1/4     1/5      1/6     ...... 
  5.  1/1 + 1/2 + 1/3 + 1/4 + ...... 
*/