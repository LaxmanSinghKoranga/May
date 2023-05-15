/* 
............... simple method without any private access specifier...............
class students{
    int age;
    String name;
    void getData(){
        System.out.println(age+" "+name);
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        students s=new students();
        s.age=23;
         s.name="laxman";
        s.getData();
    }
}

*/
/* 
........using access specifier................  problem here values re null and 0 ie default values
class students{
   private int age;
   private String name;
   void setData(){
   age =34;
   name="laxman";
   }
    void getData(){
        System.out.println(age+" "+name);
    }
}
public class Encapsulation{
    public static void main(String[] args) {
        students s=new students();
        s.getData();
    }
}
*/
/*  
............... proper output..................
class students{
    private int age;
    private String name;
    void setData(){
    age =34;
    name="laxman";
    }
     void getData(){
         System.out.println(age+" "+name);
     }
 }
 public class Encapsulation{
     public static void main(String[] args) {
         students s=new students();
         s.setData();
         s.getData();
     }
 }

*/
/*
 * 

..........using two objects........................  but for both the obj same .------####ouput 23 and laxman

import java.util.Scanner;

class students {
    private int age;
    private String name;

    void setData() {
        age = 34;
        name = "Ram";
    }
    void getData() {
        System.out.println(age + " " + name);
    }
}
public class Encapsulation {
    public static void main(String[] args) {

        students s = new students();
        students s1 = new students();
        s.setData();
        s.getData();
        s1.setData();
        s1.getData();
    }
}
 */
/*...........when we are assigining different methods............. */
/*
class students{
private int age;
private String name;
void setAge1(){
age =34;
}
void setAge2(){
age =32;
}
void getData(){
System.out.println(age+" "+name);
}
}
public class Encapsulation{
public static void main(String[] args) {

students s=new students();
students s1=new students();
s.setAge1();
s.getData();

s1.setAge2();
s1.getData();
}
}
 */

// this keyword
/*this keyword use here tis keword is used to find or used to refer the current object  */
/* 
class students{
    private int age;
    private String name;

    void setAge(int age){
    this.age =age;
    }
    
    void setName(String name){
    this.name =name;
    }


    void getData(){
    System.out.println(age+" "+name);
    }
    }
    public class Encapsulation{
    public static void main(String[] args) {
    
    students s=new students();
    students s1=new students();
    s.setAge(23);
    s1.setAge(23);
    s.setName("Laxman");
    s1.setName("Ram");
    s.getData();
    s1.getData();
    }
    }

    */

/* seters and getters */

/*


class Student{
private int age;
private String name;

void setAge(int age){
this.age=age;
}
int getAge(){
return age;
}
void setName(String name){
this.name=name;
}
String getName(){
return name;
}

}
public class Encapsulation{
public static void main(String[] args) {
Student student1=new Student();
Student student2=new Student();
student1.setAge(23);
student2.setAge(34);
student1.setName("Laxman");
student2.setName("lorem");
int student1Age=student1.getAge();
System.out.print(student1Age);

String student1name=student1.getName();
System.out.println(student1name);


int student2Age=student2.getAge();
System.out.print(student2Age);


String student2name=student2.getName();
System.out.println(student2name);
}
}
*/
class student {
    private int age;
    private String name;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
  
    

}

public class Encapsulation {
    public static void main(String[] args) {
        student Student1 = new student();
        student Student2 = new student();
        Student1.setAge(23);
        Student1.setName("laxman");

        Student2.setAge(234);
        Student2.setName("Ram");

        int student1Age = Student1.getAge();
        String student1Name = Student1.getName();

        int student2Age = Student2.getAge();
        String student2Name = Student2.getName();

        System.out.println(student1Age + " " + student1Name + " " + student2Age + " " + student2Name);
    }
}