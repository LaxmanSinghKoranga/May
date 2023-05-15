/* 
class Student{
    private int age;
    private String name;

Student(int age ,String name){ //constructor syntax method name as class name there will be no return type even no 
    this.age=age;           // void and thre can be access specifier and the initilization according to instance,fields  
    this.name=name;
}

}
public class construcor {
    public static void main(String[] args) {
        Student s=new Student(12,"Laxman");
        Student s1=new Student(); /// why error


    }
}
*/

//................................... Zero Parameterised and Paremetrised Constructor .............
/* 
class Studen {
    private int age;
    private String name;

    Studen(int age, String name) {
        this.age = age;
        this.name = name;
    }

    Studen() {
        System.out.println("Default Constructor");
        age = 23;
        name = "Laxman";
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

}

public class construcor {
    public static void main(String[] args) {
        Studen s = new Studen(12, "Laxman");
        Studen s1 = new Studen(); /// why error cz if we will not declare any constructor then we have to assign
        int age1 = s.getAge(); // default constructor too
        String name1 = s.getName();

        int age2 = s1.getAge();
        String name2 = s1.getName();

        System.out.println(age1 + " " + name1);
        System.out.println(age2 + " " + name2);

    }
}
*/
// ___________________________________________.Constructor Overloading___________________________________

/* 
class Studen{
    private int age;
    private String name;

Studen(int age ,String name){  
    this.age=age;         
    this.name=name;
}
Studen(int age){
    this.age=age;
    System.out.println("this is third ");test.java

}
Studen(){
    System.out.println("Default Constructor");
    age=23;
    name="Laxman";
}
public int getAge(){
    return age;
}
public String getName(){
    return name;
}

}
public class construcor {
    public static void main(String[] args) {
        Studen s=new Studen(12,"Laxman");
        Studen s1=new Studen(); 
        Studen s2=new Studen(23);

       int age1 =s.getAge();                 
       String name1 =s.getName();

       int age2  =s1.getAge();
       String name2  =s1.getName(); 

      int age3=s2.getAge();
       System.out.println(age1+" "+name1);
       System.out.println(age2+" "+name2);
       System.out.println(age3);
    }
}  
*/

//output why there is default then this is third


//________________________________this() and super()________ use to combine constructor with each other ____

class Studen{
    private int age;
    private String name;

Studen(int age ,String name){  
    this();
    this.age=age;         
    this.name=name;
}
Studen(int age){
    this.age=age;
    System.out.println("this is third ");
}
Studen(){
    System.out.println("Default Constructor");
    age=23;
    name="Laxman";
}
public int getAge(){
    this();
    return age;
}
public String getName(){
    return name;
}

}
public class construcor {
    public static void main(String[] args) {
        Studen s=new Studen(12,"Laxman");
        Studen s1=new Studen(); 
        Studen s2=new Studen(23);

       int age1 =s.getAge();                 
       String name1 =s.getName();

       int age2  =s1.getAge();
       String name2  =s1.getName(); 

      int age3=s2.getAge();
       System.out.println(age1+" "+name1);
       System.out.println(age2+" "+name2);
       System.out.println(age3);
    }
}  

// revise this and super constructor methods
