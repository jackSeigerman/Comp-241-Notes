Algorithm - well defined sequence of steps to solve a problem

Data Structure - is a particular way of organizing and storing data on a computer under one name. (basically like a class)

Object Oriented Programming - programming with objects.

Object - one instance of a class.

Advantages of object oriented coding

Code reuse -  Cleaner code and simplicity 

Encapsulation - Restricting access to data by mutators (setters) and accessors (getters), data protection and data hiding.

Inheritance - Give functions and vars to children

Debugging - Reuse and check code easier

Abstraction - Suppressing irrelevant details while emphasizing important details.


    import java.util.ArrayList;

    public class Main {
        public static void main(String[] args) {
            int x= 1;
            int y=1;
            int z=0;

           ArrayList<Integer> fib=new ArrayList<Integer>();
    
           fib.add(x);
           fib.add(y);
    
           while(true){
              z=x+y;
              x=y;
              y=z;
              fib.add(y);
              System.out.println(fib);


            }

        }
    }

Class is a data type we create and it can hold information

There are functions inside the class that act on the data.

Object is an instance of a class.

“Members of a class” data = 1.variables of the class (state) or fields of a class. 2.functions (methods) describe the behavior of the class. (what your class does) 

public access means anyone can acess the data or method
private access means only that class can acess the data or method

    public class Dog{
        private int age:
        private String name;
        
        public Dog(string myname){
        name = myname}
        }

or

    public class Dog{
        private int age:
        private String name;
        
        public Dog(string name){
        this.name = name} //how to use "this" keyword
        }
(contiued)

        public void setAge{int myAge}
    {
        if(myAge>-1)
            this.age=myAge;
    }

    public int getAge()
    {
        return age;
    }
    
    public String getName()
    {
        return name;
    }

with int in java:

    int x =5;
    int y=x;
    y=y+1;
    
    x=5;
    y=6;

However objects are refrences or (pointers) if you were to set an object to another object like so:

    dog1 -> name="gigi" age=15;
    
    dog2->name="lulu" age= 3;
    
    dog2=dog1;

    dog2.setAge(4);
    
    dog1.getAge();

the age would be 4 
this is due to objects being refrences when set to each other and not juts overwritten

    public void speak()
    {
    System.out.println(name+"is speaking")
    }

child classes
if you recall from when we set the string name as private, it will not work in the child class unless you set it to pretocted or you can use super class

    public class Dachsund extends Dog
    {
        public Dachsund(String myname)
            {
                super(myname); //calls a super class contsructor
            }
    }

Protected means that that function or variable can be used in all subclasses as well as the original class but no where else (similar to private but also including subclasses)

overloading having two or more functions with the same name with them having different amounts of paramaters or paramaters of differing types


when you are creating a class it is common to make a function called tostring as so

    public string tostring()
    {
        return "this dogs name is"+ name;
    }

