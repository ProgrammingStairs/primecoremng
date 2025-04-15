// Program

class Demo4{
    public static void main(String args[]){
        //int a = 012;
        //int a = 0x12;
        int a = 0xa12;
        System.out.println("a : "+a);
    }
}

/*
    012 = octal number system
    1 x 8^1 + 2 x 8^0
    1 x 8 + 2 x 1
    8 + 2 
    10

    0x12 = hexadecimal number system
    (0-15 = 0 1 2 3 4 5 6 7 8 9 A B C D E F)
    1 x 16^1 + 2 x 16^0
    1 x 16 + 2 x 1
    16 + 2 
    18

    0xa12 = hexadecimal number system
    (0-15 = 0 1 2 3 4 5 6 7 8 9 A B C D E F)
    a x 16^2 + 1 x 16^1 + 2 x 16^0
    10 x 256 + 1 x 16 + 2 x 1
    2560 + 16 + 2 
    2578

*/