// concept of getter and setter methods

// class Demo6{
//     private int rno;
//     public static void main(String args[]){    
//         Demo6 obj = new Demo6();
//         obj.rno = 100;
//         System.out.println("Rno : "+obj.rno);
//     }
// }

class Student{
    private int rno;
    // setter method
    public void setRno(int rno){
        this.rno=rno;
    }
    // getter method
    public int getRno(){
        return rno;
    }
}
class Demo6{
    public static void main(String args[]){    
        Student obj = new Student();
        obj.setRno(100);
        System.out.println("Rno : "+obj.getRno());
    }
}
