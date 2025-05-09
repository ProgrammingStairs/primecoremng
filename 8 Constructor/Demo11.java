// example showing the concept of constructor | Shallow copy
/*
    shallow copy
    Student
            s1                  s2
            |---------name-------|
            |---------age--------|
            |------reference-----|
                       |
                    address
                    ___|___
                    |     |
                   city state        
*/

class Address{
    String city,state;
    Address(String city,String state){
        this.city=city;
        this.state=state;
    }
}
class Student{
    int age;
    String name;
    Address address;
    Student(String name,int age,Address address){
        this.name=name;
        this.age=age;
        this.address=address;
    } 
    Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.address = s.address;
    }
    void display(){
        System.out.println("Name : "+name);
        System.out.println("Age : "+age);
        System.out.println("City : "+address.city);
        System.out.println("State : "+address.state);
    }
    public static void main(String args[]){
        Address address = new Address("Indore","Madhya Pradesh");
        Student s1 = new Student("Andrew Anderson",45,address);
        Student s2 = new Student(s1);
        s2.address.city="Jabalpur";
        s2.address.state="MP";
        s1.display();
        System.out.println("After copying : ");
        s2.display();
    }
}
