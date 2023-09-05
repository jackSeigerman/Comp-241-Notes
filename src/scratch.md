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
there are two types of inharitance:

 Object inharitence (extends) used when you want to
 design a new class (a subclass) that has the capabilities 
 of another (superclass) plus other abilities

Interface inheritance (implements) 
the interface is like a class except only methods are 
allowed (no variables or feilds) all the methods are empty. 
Its kinda like an abstract idea or skelton code. that just 
"kinda lives there" Lets say we want to create  a class 
called speak and we want to have a pet class and they all 
speak (even thought they dont its jusat an example 
every class we create will be forced to make a function 
speak and we have a class pet that implements a class 
that other clases inherit from and they get the speak 
class. mainly for arrays

    @overide
    public class cat implements pet{
      public void speak(){
          System.out.println("meow");
      }
    }
!

    dog dog1=new dog("sophie");
    dog dog2=new Dauchound("jacob");
    Arraylist<dog> dogs= new arraylist<dog>();
    dogs.add(dog1)
    dogs.add(dog2)
    for(dog adog: dogs){
    System.out.print(adog);
    }

the goal of object oriented code is to seperate the 
internal representation of the class from the interface
we present to the outside world or encapsilation and or
"information hiding"

1. this is important because the user is less likely to break 
things 
2. we can change things about a "cars" internal
representation while keeping the interface the same

from a programmers perspective - person writing the class and knows the internal representation

from a users perspective - person whos using the class

!

Abstract Data Type (ADT)

(lists or  trees);
from users perspective;
short description of a data type (as an abstract) and a list of operations that the data type is capable of

ADT != data structure
adt is an interface while data structure is implementation.

List ADT - a colletion of positions/ indicies, and each position or index contains exactly one element of the list.

Operations - sort, print, append item, prepend item. remove item, swap 2 elements, find an element, count

!

Arrays- a contuious chunk of memory that is imutable. You can acess an index at will.

Linked list (or linked structure) -stored in a non 
contious chunk of memory. made with pointers in 
memory, basicallly as if the memory was scattered. 
You cannot get elements but rather you need to 
iterate through the entire linked list to return a value.


    public interface Rlist{ 
     public int size();
     public int get(int pos);
     public void set(int pos, int value);
     public void append(int value);
     public void prepend(in value);
    }
!

    public class RArrayList implements Rlist{
     private int size;
     private int[] data;
     
     @Overide
     public int size(){
      return 0;
     }
     @Overide
     public int get(int pos){
      return 0;
     }
     @Overide
     public int set(int pos, int value){
      return 0;
     }
     @Overide
     public int append(int value){
      return 0;
     }
     @Overide
     public int prepend(int value){
      return 0;
     }
    }
 2 different notions of size:

.

 users perspective:

 size 0

 lst=[]

 lst.append(1) 1

 lst.append(2) 2

 lst.append(4) 3

.

 programmers perspective:

keep track of capacity

when capacity > size, there are extra spots to edit elements
but when capacaty is = to size we are full

list can go from empty to [1] to [1,2] to [1,2,4]  to [1,2,4,7] on user end so programmers end will be a array size 3 to start and then when 1 is added array will be [1,x,x] then [1,2,x] then [1,2,4] thencopy the array into an arrazy size 6 and then [1,2,4,7,x,x]

    public class RArrayList implements Rlist{
     private int size;
     private int[] data;
     data.length
     

     public RArrayList()
     {
      size = 0;
      data=new int[3];
     }

     @Overide
     public int size(){
      return 0;
     }
     @Overide
     public int get(int pos){
      return 0;
     }
     @Overide
     public int set(int pos, int value){
      
     }
     @Overide
     public int append(int value){
     data[size]=value;
     size++;
     }
     @Overide
     public int prepend(int value){
     
     }
     public String toString()
     {
       String answer ="[";
       for (int x=0; x<size; x++)
         answer+=(data[x]+" ");
       return answer + "]"
      }
    }
.

    public class RArrayListTest{
     public static void main(string[] args)
     {
      RArrayList mylist=new RArrayList();
      System.out.println(mylist);
      System.out.println("User Size"+ myList.size());
      
      mylist.append(20);
      System.out.println(mylist);
      System.out.println("User Size"+ myList.size());
      
      mylist.append(40);
      System.out.println(mylist);
      System.out.println("User Size"+ myList.size());
      
      mylist.append(60);
      System.out.println(mylist);
      System.out.println("User Size"+ myList.size());
     }
    }

 Declare a new array and add to the current  capacity by 3
 
copy the contents from old array into the new array

set the new array to be the "data"

    public class RArrayList implements Rlist{
     private int size;
     private int[] data;
     data.length
     

     public RArrayList()
     {
      size = 0;
      data=new int[3];
     }

     @Overide
     public int size(){
      return 0;
     }
     @Overide
     public int get(int pos){
      return 0;
     }
     @Overide
     public int set(int pos, int value){
      
     }
     @Overide
     public void append(int value){

    if(size==data.)


     data[size]=value;
     size++;
     }

     private void expand()
     {
      int newArrayCap = data.length+3;
      int[] newArray = new int [newArrayCap];
      
      for( int i=0; i<size; i++)
      {
        newArray[i]=data[i];
      }
      data = newArray;
     }

     @Overide
     public int prepend(int value){
     
     }
     public String toString()
     {
       String answer ="[";
       for (int x=0; x<size; x++)
         answer+=(data[x]+" ");
       return answer + "]"
      }
    }