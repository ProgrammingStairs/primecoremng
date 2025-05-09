// example showing the concept of constructor | Deep copy
/*
    deep copy
    Student
            s1                  s2
            |---------name       |-------name
            |---------age        |-------age
            |------reference     |-------reference
                       |                     |
                    address               address
                    ___|___               ___|___
                    |     |               |     |
                   city state            city  state
*/

class Address{
    String city,state;
    Address(String city,String state){
        this.city=city;
        this.state=state;
    }
    Address(Address address){
        this.city = address.city;
        this.state = address.state;
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
        this.address = new Address(s.address);
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
