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

*

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



space effiency -  how much data is stored

time effencieny -  how fast does the algorythm run

    double mean (int a[], int n)
    {
     sum=0; //1
     i=0; //1
     while ( i<n) //n+1
     {
      sum+=a[i] //n
      i++ //n
     }
     return sum/n //1
    }

T(n)=3n+4
O(n)

T(n) is O(f(n)) if and only if there exists some constat C such that T(n)<=C*f(n) for all sufficiently 
large values of n

T(n) number of computation algprthm makes

lets say

prove T(n)=O(n)

T(n)=100,000,000*n+100<=c times n

suppose n^0 is equal to 2 and c=100,000,001


t(n) is O(n) if and only if there exists a C n not for all n greater than n not T(n)<=C*f(n)

big O is a way for us to quantify the running time or the space complexity of an algorythm
T(n) is the number of operations an algorythm does while n is the input size
Big O gives us an upper bound for the growth of the algorythm

*Rules of big O* - we drop the coeffeciants  (or constants); if you have multiple terms added 
together, you keep the biggest term that grows the fastest.

Analysis of Algorythms- theoretical study of performance and resourcouse usage of an algorythm.


whats more important than performance? -storage 
- processing power -amount of time it takes to write code 
- -user friendliesness -robust -modular - secure

DEF OF BIG O

we say that T(n)= O(f(n))
if there exists constants c and n^0 so that T(n)< c*f(n) for all n > n^0


T(n) is the number of computations and n is input size
1<n when n is 1
T(n)=54 c=54 n^0=1 T(n)= 54 (1) O(n) yesT(n)=54 < 54n
c=54 n^0 = 1 O(n^2) yes

growth of functions

O(1) constant time

O(log n) logirithmic

O(n) linear time

O(nlog n) n-log n or log linear

O(n^2) quadratic time

then all polynomials like n^3 or n^4 (happy)

O(2^n) exponential time (sad)

O(n!) factorial time

*

general rules for calculating run time

1. loops: figure out the number of times a loop runs with respect to input size
   1. for( int i =0 i<n i++) =O(n)
2. nested loops:multiply big O for all the loops
3. conecutive statements: Add the big O together
4. if/else: take the larger of the condition
5. logarithm: runtime is cut by some fraction at each iteration 
   1. binary search

*

Kinds of analysis

1. worst case
   1. max time on any input
2. avergae case
    1. expected time over all input of size n or the avergae case for big O
    2. we need to know expected inputs and make assumptions on what the data looks like
3. best case
    1. the fastest possible big O

List ADt contiued
1. array list
2. linked list
   1. operations:
      1. insert an item in beggining or middle or end.
      2. remove an item in beggining or middle or end.
      3. search for specific item
      4. itterate
      5. get size

Array lists have random acess to all the elements (chunk of memory)

(random acess means you can retreive or change any item in the list in constant time)

Linked list do not

in a linked list we cant skip to any item in the list we want to

Different types of linked lists:
1. singly Linked List
   1. nodes with pointers to next node
2. doubly Linked List
   1. nodes with pointers to next node and previous node
3. circular linked list
   1. there are different shapes linked list can be like a circle where last node points to first

shape on how the nodes are connected like a circle
you can have special pointers/ refrences to keep around to acess the list

Nodes have two peices of information, data and a pointer to the next element in the list.

      Node n1 = new Node();
      Node n2 = new Node();
      Node n3 = new Node();
      Node n4 = new Node();
      
      n1.data = 5;
      n2.data = 3;
      n3.data = 4:
      n4.data = 1;
      
      n1.next = n2;
      n2.next = n3;
      n3.next = n4;
      n4.next = null:
      head = n1;

a list is empty when the head is null.

iterating through linked list.

      Node Curr = head;
      while(Curr != null)
      {
         System.out.println(Curr.data)
         Curr=Curr.next;
      }

Traversals are going through a linked list one node at a time.
1. forward direction
2. Node curr = whatever you want to start with and usually its the head
3. while (stopping condition) usually this is curr != null
4. usually process the node or print the data
5. curr = curr.next;

thats using one pointer: curr

this is a two pointer traversal

      Node Curr = head;
      Node Prev = null;
      
      while (Curr != null)
      {
         //process curr data
         Previous = Curr;
         Curr = Curr.next;
      }

Inserting into a linked list
(pusocode)

      Node newNode = new Node()
      newNode.data = whatever
      newNode.next = Curr.next
      Curr.next=newNode;

if curr = null this wont work (like if the list is empty)

if yiou insert at the beggining of a linked list you have a special case where you have to change head

newNode.next = curr

Head= newNode

prev .next = curr.next

with inserts and deletes, most of the time traversing  costs O(1)

* ifyou have a singly linked list with a head pointer and insert at the beggining O(1)
* if you insert at the end O(n)
* deleting at the beggining O(1)
* deleteing at the end O(n)
* singly linked list with head and a tail pointer always O(1) except for deleting the end wich is O(n)

HOW NODES WORK
NODES
LINKED LIST STUFF

      Class Node
      {
         public Int data:
         public Node next;
      }

1

      public class Node
      {
         private int data:
         private Node next:
         public Node(int d)
      {
         data = d;
         next = null;
      }
      public void setData(int d)
         data = d;

1

      public class Slist()
         {
         private Node head:
         public Slist()
            {
            head = null:
            }
         public void prepend(int d)
            {
            Node aNode = new Node();
            aNode.data=d;
            anode.next = head;
            head = aNode;
            }
         public void append(int d)
            {
            Node aNode=new Node();
            aNode.data=d:
            aNode.next=null:
            if(head==nul)
               {
               head=aNode;
               return;
               }
            Node curr=head;
            while (curr.next  != null)
            curr = curr.next
            }
         public int deleteF()
            {
            if (head==null)
               {
               return -1;
               }
            int dataToReturn = head.data;
            head=head.next;
            return data to return:
            }
         public int deleteEnd()
            {
            if (head==null)
               {
               return -1;
               }
           if (head.next == null)
               {
               in dataToReturn = head.data;
               head=null
               return dataToReturn;
               }
            Node prev=head
            while( prev.next.next !=null)
               {
               prev=prev.next;
               }
            in dataToReturn = prev.next.data;
            previous.next=null;
            return dataToReturn;
            }
         public void toString()
            {
            Node curr = head:
            while (head != null)
               {
               System.out.println(curr.data);
               curr=curr.next;
               }
            }

1

      SList mySList = new SList()
      mySList.prepend(4)

List ADT
* implementation: array based or linked list
  1. Array lists dybamicly grow and shrink while linked lists can be singly linked or doubly linked
  * restricted versions of lists
    * Stack ADT
      * can only put things on top and take things off from top
    * Queue ADT
      * can only pull from top or bottom
    
* Stack ADT:
   * push
     * add an element to the top of the stack
   * pop
     * removes and returns an element from the top of the stack
   * peak
     * just returns the top element
   * isEmpty
     * returns wether or not a stack is empty


* Queue ADT:
  * enqueue
    * add an element to the list
      * could be either side once defined
  * dequeue
    * remove an element from the list
      * oposite from side added to

.

.


Stacks :
  * LIFO - last in first out
* usefull application of a stack
  * computer memory
  * post fix notation
    *infix  ((3+2)*(7+2))+1
    * postfix 32+72+*1+

steps for evaluating post fix notation

1. initialize an empty stack
2. while not end end expression
3. grab the token
4. if the token is an operand push it on the stack 
5. else if it is an operator pop 2 values from the stack, apply the operator on the two values and push result
6. final result is on the stack

implementaion
* array
  * push-append
  * pop remove from end
* linked list
  * use head for add /remove from front

.

.

queue:
  * FIFO-  first in first out
  * add to tail

implementation

* array 
  * have a circular array that keeps track of front/back
    * if rear +1 == size, rear = o
    * rear = (rear +1)% sizeList

* linked list 
  * can use ll with just a head and add remove from front
  * use head/tail, add to tail remove from head


.


      int QUQUE_CAPACITY =56;
      Class Queue
      {

         Private int front;
         Private int rear;
         int a[QUEUE_CAPACITY]
         
         Queue()
         {
            Front=0;  //list is empty when 
            Rear=0;
         }

         Void Enqueue()
         {
            int new_rear=(rear + 1); //QUEUE_CAPACITY;
            if new_rear != Front  // the array is full if this happens
            {
               a[new rear]=d
               rear = new rear
            }
            else
            {
               System.out.println("full")
            }
         }

         int Dequeue
         {
            if (Front != rear) // check to see if its empty
            {
               int data = a[Front];
               Front = (front+1)%QUEUE_CAPACITY;
               return temp;
            }
            else
            {
               return -1;
            }
         }
      }

Sorting:
* given a sequence of values for sort the sequence is in "order"

Selection sort:
* Idea is to maintain two lists a sorted list and an unsorted list
* Initially, the lest side (sorted side) is empty, and the right side is the entire array
* the basic idea is to find at each itteration find the smallest element in the right hand side and stick it on the left
  * O(n^2)
  

        for(int 0 = 1; i <= n - 2; i++)
           {
           int small=i
           for(int j = i + 1; j<=n-1; J++)
              {
              if (a[j]<a[small])
                 {
                 small=j;
                 }
              temp=a[i]
              a[i]=a[small]
              a(small)=temp
              }
           }

Bubble sort:
* bubles up the biggets number of every pair each iteration of outer loop
*  O(n^2)


      static void bubbleSort(int arr[], int n)
      {
         int i, j, temp;
         boolean swapped;
         for (i = 0; i < n - 1; i++) 
         {
            swapped = false;
            for (j = 0; j < n - i - 1; j++) 
            {
               if (arr[j] > arr[j + 1]) 
               {
                  temp = arr[j];
                  arr[j] = arr[j + 1];
                  arr[j + 1] = temp;
                  swapped = true;
               }
            }
            if (swapped == false)
               break;
         }
    }

Insertion sort:
* Mentaly divide the list into two parts
  * the left side  is sorted, right is not sorted
  * inserts item from right (unsorted) side to the left (sorted) side in the correct order


     public class InsertionSort 
      {
      
        void sort(int arr[])
        {
           int n = arr.length;
           for (int i = 1; i < n; ++i)
           {
              int key = arr[i];
              int j = i - 1;


              while (j >= 0 && arr[j] > key) {
                  arr[j + 1] = arr[j];
                  j = j - 1;
              }
              arr[j + 1] = key;
          }
      }

Sets

* SetADT
  * collection of elements
  * operations: 
    * add
    * remove
    * search/get
  * Implemented
    * Linked List
      * O(n)
    * array
      * O(n)
    * hashtable
    * binary search tree
      * log(n)
    * if you had an in order array search would be O(log n) using binary search
    * but inserts and other calls would O(n)

Maps
* keyADT
   * stores a collection of data
   * each element has a key value
   * they are also called dictionaries
   * most offen maps are implemented using a data structure called a hash table
   * hash table
     * hash function is used to map each element into a location in a hash table
       * gives you an integer value and tells you where in a hashtable the data is stored
     * every element has a key
       * apply the hash function on the key
       * methods
         * insert 
         * remove
         * search
       * focus
         * making searches fast
       * issues that arrise
         * collisions
           * when data maps to the same location
         * running out of room
         * thinking of a good hash function

how to deal with collisions
* linear probing
  * if you were to have a collision, look at the next spot and so on
  * i, i +1, i+2
  * problem with this is clustering
    * collisions occur in the same locations over and over
* resize the table and re hash everything
  * O(table size)
* quadratic probing
  * i+quadratic polynomial % the table size
    * for example i + 1^2, i-1^2, i+2^2, i-2^2, i+3^2, i-3^2
      * quadratic helps avoid clustering
* double hashing
  * use a second hash function to dermine the probe sequence
  * if collision; then a second hash function
* chaining
  * the hash table is an array of liniked lists
  * elements that map into the same key location in the hash table are in the same linked list
  * adv
    * you will always know the location
  * dis atv
    * if things map to same location, you will have to search through the linked list

Tree ADT

* a tree is a collection of nodes
  * the collection can be empty
  * otherwise, consists of a distiguished node called the root
    * The root has 0 or more non-empty sub trees T1, T2
    * each root is connected by direct edge to root
    * the root of each subtree is a child of root
    * the root is the parent of each sub tree root
  * a tree is a collection of N nodes and N-1 edges
  * Nodes with no children are called leaves
  * Nodes with the same parents are siblings
  * a path from  N1, to Nk is defined by a sequence of Nodes n1, n2...nk such that ni is parent of ni+1
  * length of path is amount of edges you traverse. so 4 Nodes is 3 in length
  * there is a path of length 0 from every Node to itself
  * there is exactly one path from the root to each Node
  * for every Node, the depth of a Node is the length of the path from the root to that Node
  * the height of a Node is the length of the longest path from that node to leaf
  * the depth of the tree is qual to the depth of the deepest Node wich is always equal to the height of the tree wich is just the height of the root

Binary Tree
* a binary tree is a tree where no Node can have more then 2 children
* two different ways to implement binary tree
  * Array
    * 2i+1, 2i+2
  * use points to Nodes
    * public Binary Node left;
    * two pointers one for each direction
    * only downwards nodes
  
recurrsion is best way to traverse a tree

visit the root and process its contents
traverse the left sub tree 
then traverse the right sub tree

pre order traversl
visit left right

In order traversal
Left visit right

post order
left rigth visit

Binary Trees

class BTNode
{
private int data;
private BTNode left;
private BTNode right;
}

class BinTree
{
private BTNode root;

void printInOrder()
{
BTNode subR=root;
print in Order


Binary search trees
an important sub category of Binary trees
used in searching 

have the following property:
for every node x the values in the left sub tree are smaller than x than the values on the right are bigger than x

pointers are variables that point to a memory adress

Static shares the variable or method

Binary Search Trees

      Class BinNode
      {
         BinNode left;
         BineNode right;
         int data;
      }

      Class BST
      {
         BinNode root;
      }

BST key data:
for any node, the children on the left are smaller then the children on the right are bigger.

find min

      Bin Node curr= root;
      if curr == null
      {
         return -1;
      }
      while( curr.left!=null)
      {
         curr=curr.left;
      }
      return curr.data;

find max

      Bin Node curr= root;
      if curr == null
      {
         return -1;
      }
      return findmaxaux(curr);

helper

      int findmaxaux(BinNode curr)
      {
         if curr.right != null
         {
           return findmaxaux(curr.right);
         }
         else
         {
            return curr.data;
         }
      }

insert

      void insert (int item)
      {
         BinNode curr=root;
         binNode parent = null;
         bool found=false;
         while(!found && curr !=null)
         {
               parent =curr;
               if (item < curr.data)
            {
               curr=curr.left;
            }
               else if (item > curr.data)
            {
               curr=curr.right;
            }
               else
            {
               found = true;
            }
         }
         if(found)
         {
            System.out.println("cant add same number to tree");
         }
         else
         {
            BinNode aNode = new BinNode();
            aNode.left=null;
            aNode.righ=null;
            aNode.data=item;
            if (root==null)
            {
               root=aNode;
            }
            else if (item<parent.data)
            {
                  parent.left = aNode;
            }
            else
            {
               parent.right=aNode;
            }
         }
      }

next in order traversal
LVR
left visit right


3 cases for deletes

1. its a leaf
   * just set parents. left or .right to null

2. it has 1 child. 
   * just move up the child

3. it has 2 children:
   * find next element in order traversal, replace that element with the item to be deleted , if element has one child move it up,

best case scenario for inserting is that all the leaves are on the same level. O(log n)

worst case scenario is that you seacrh O(n)

Let us call the node that must rebalance alpha violating Node
since any node has at most two children and a height imbalance implier that the subtrees height differs by two there will be a violation in 4 different cases

case1 an insertion into the left subtree to left child of alpha

cas2 an insertion into the right subtree to the left child of alpha. 

case 3 an insertion into the left subtree to right child of alpha 

case 4 an insertion to the right subtree to right child of alpha

with case 1 and case 4 (symetric violations) you simple rotate first child node up and move main node to the right.

2 different ways to fix the violation
   if th e insertion occurs on the outside if its a LL or RR (case 1 and case 4) its fixed by a single rotation

if inserts occur on the interior  left right or right left you do a double rotation 

searching in avl tree is O(log n)

merge sort

MergeSort(A[0]...a[n-1])
if length of a==1
return a

split a in half as equal as possible into 2 subarrays call merge sort on each one

b=mergesort(a[0]...a[n/2])
c=mergesort(a[n/2+1]...a[n-1])
merge b and c together into one sorted array called D
return D

QuickSort

basic idea is to take a pivot and subdivide a list into less than the pivot and greater than the pivot.

idea is to choose a pivot and perform a sequence of exchanges so that all of the elements on the left are smaller then the pivot and all elements on the right are greater.

subdidve to less than and greater than pivot repear on sublists

The average case time complexity of quicksort is O(n log n), which is quite efficient. However, in the worst case, quicksort can have a time complexity of O(n^2), which is much less efficient.

The worst case occurs when the pivot chosen is either the smallest or largest element in the array, and the partitioning routine divides the array into two subarrays of size n-1 and 0. This can happen if the input array is already sorted or nearly sorted.

To avoid this worst-case scenario, various techniques can be used, such as choosing a random pivot or selecting the median of three randomly chosen elements as the pivot. These techniques can help ensure that the partitioning is more balanced, leading to better performance.The average case time complexity of quicksort is O(n log n), which is quite efficient. However, in the worst case, quicksort can have a time complexity of O(n^2), which is much less efficient.

The worst case occurs when the pivot chosen is either the smallest or largest element in the array, and the partitioning routine divides the array into two subarrays of size n-1 and 0. This can happen if the input array is already sorted or nearly sorted.

To avoid this worst-case scenario, various techniques can be used, such as choosing a random pivot or selecting the median of three randomly chosen elements as the pivot. These techniques can help ensure that the partitioning is more balanced, leading to better performance.

QUICKSORT CODE:



    public static void quickSort(int[] arr, int left, int right) {
        if (left < right) {
            int pivotIndex = partition(arr, left, right);
            quickSort(arr, left, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, right);
        }
    }

    private static int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

Radix Sort

Radix sort is a non-comparative sorting algorithm that sorts data with integer keys by grouping the keys by individual digits that share the same significant position and value. 

The algorithm sorts the input array by processing the digits of each element one by one, starting from the least significant digit to the most significant digit. It uses a stable sorting algorithm, such as counting sort or bucket sort, to sort the elements based on each digit.

For example, let's say we have an array of integers: [170, 45, 75, 90, 802, 24, 2, 66]. To sort this array using radix sort, we would start by sorting the elements based on their least significant digit (i.e., the ones digit). After sorting, the array would look like this: [802, 2, 24, 45, 75, 66, 170, 90]. We would then sort the elements based on their tens digit, resulting in: [2, 24, 45, 66, 75, 90, 170, 802]. Finally, we would sort the elements based on their hundreds digit (which is 0 for all elements except 802), resulting in the sorted array: [2, 24, 45, 66, 75, 90, 170, 802].

Radix sort has a time complexity of O(d * (n + k)), where d is the number of digits in the maximum number, n is the number of elements in the array, and k is the range of the input (i.e., the maximum value minus the minimum value). Radix sort is often used for sorting large integers or strings.Radix sort is a non-comparative sorting algorithm that sorts data with integer keys by grouping the keys by individual digits that share the same significant position and value. 

The algorithm sorts the input array by processing the digits of each element one by one, starting from the least significant digit to the most significant digit. It uses a stable sorting algorithm, such as counting sort or bucket sort, to sort the elements based on each digit.

For example, let's say we have an array of integers: [170, 45, 75, 90, 802, 24, 2, 66]. To sort this array using radix sort, we would start by sorting the elements based on their least significant digit (i.e., the ones digit). After sorting, the array would look like this: [802, 2, 24, 45, 75, 66, 170, 90]. We would then sort the elements based on their tens digit, resulting in: [2, 24, 45, 66, 75, 90, 170, 802]. Finally, we would sort the elements based on their hundreds digit (which is 0 for all elements except 802), resulting in the sorted array: [2, 24, 45, 66, 75, 90, 170, 802].

Radix sort has a time complexity of O(d * (n + k)), where d is the number of digits in the maximum number, n is the number of elements in the array, and k is the range of the input (i.e., the maximum value minus the minimum value). Radix sort is often used for sorting large integers or strings.

CODE FOR RADIX SORT

    public static void radixSort(int[] arr) {
        // Find the maximum number to know the number of digits
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        // Do counting sort for every digit
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    private static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10];

        // Store count of occurrences in count[]
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }

        // Change count[i] so that count[i] now contains actual
        // position of this digit in output[]
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build the output array
        for (int i = n - 1; i >= 0; i--) {
            output[count[(arr[i] / exp) % 10] - 1] = arr[i];
            count[(arr[i] / exp) % 10]--;
        }

        // Copy the output array to arr[], so that arr[] now
        // contains sorted numbers according to current digit
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }

Priority Queue ADT
    similar to queue except each item in the structure has a priority
    priority controls the order in which things come off the queue interface

    Queue: first in, first out
    priority Queue: items come out in order of their priority

    A collection of items each with a numerical priority 
    insert an item with the priotrity 
    delete a min
    search for a min
    
HEAPS
    new data structure thats commonly used to implement Priortity Queue

    A Heap is a binary tree that has the following restrictions
      1. the tree is complete meaning each level is full except for the last level
      2. it must satisfy the heap order property
      min heap
        1. for every node x, the value in x is less than the values in its children
        2. the root is the min value in the tree
      max heap
      1. for every node x the value in x is less that the values in its children
      2. the root is the max value in the tree.

      heaps can be stored as an array from i to N
      the children of the I node are in 2i and 2i+1
      parent of i is i/2

      insert
        insert at the end of the array
        bubble up the value until the heap order property is satisfied (percolate up or percolate down) so basically just swapping them

      delete
         delete the root
         replace the root with the last element in the array
         bubble down the value until the heap order property is satisfied (percolate up or percolate down) so basically just swapping them

    time complexity
      insert O(log n)
      delete O(log n)
      search O(n)

      heaps are just one chunk of memory 

heap sort:
    convert all of the elements of a list into a heap
    contuily remove the min until the heap is empty

    convert list to a max heap
    contuisly remove the max until the heap is empty put the max at the end of the array

      time complexity
         O(n log n)

   heapify
    begin with the last node thats not a leaf, and you apply percolate down
    continue until you get to the root
    
percolateUp( A[], int k), k index of out of place element

    while k>1 && A[k]>a[k]/2 //MAX HEAP percolate up
      swap A[k/2] with a[k]
      k=k/2


percolateDown( A[], int k), k index of out of place element

    while (2*k<a.length)
      largest = 2*k
      if(larger+1<a.length && A[larger+1]>A[larger])
        largest = largest+1

heapify
  for (int i = a.length/2; i>=1; i--)
    percolateDown(a,i)


Graphs
a graph is just a set of verticies and edges. 
G=(V,E)
each edge is a pair W,V where W and V are verticies
if the edge pair is ordered then its a directed Graph
a directed graph is called a digrpah
vertex W is said to be adjacent to V if and only if V,W is in the set of E
in an undirected graph with edge W V W is adjacent to V and V is adjacent to W

 directed unweighted graph boolean matrix

 undirected weighted graph int matrix

 undirected unweighted graph boolean matrix

directed weighted graph int matrix

non conections are stored with INF
MAX_VALUE

asjaceny list
you can use a linked list to represent a graph
each vertex has a linked list of all the verticies it is adjacent to
storage cost is O(V+E)
if this is a dense graph e can aproach v^2 making it not any better

if the graph is more connected or more dense it makes more sense to have an adjacency matrix
if the graph is less connected or more sparse it make more sense to have a adjacency list

graph traversal

depth first search
breadth first search

depth first search-start with the vertex mark it as visited

dfs(vertex v)
   for each w adjacent to v
   if w is not visited
      dfs(w)


dfs(A)
    dfs(B)
      dfs(C)
   dfs(D)

A - B13 - D6 - null
B - A13 - C9 - null
C - B9 - null
D - A6 - null

breadth first search - visit the start vertex then you iniazialize a queue to contain only the start vertex

while queue is not isEmpty
   remove a vertex from the queue
   visit
for all verticies W adjacent to V if W has not been visited
   add W to the queue
   mark W as visited


the shortest path algorythm

   find the shortest path from a vertex to all other verticies
   the algorythm is called dijkstras algorythm
   it uses a priority queue to store the verticies
   the priority is the distance from the start vertex
   the algorythm is greedy
   it always chooses the vertex with the smallest distance from the start vertex
   it uses a greedy algorythm to find the shortest path

   dijkstras algorythm
      1. set the distance of the start vertex to 0
      2. set the distance of all other verticies to infinity
      3. add all verticies to the priority queue
      4. while the priority queue is not empty
         1. remove the vertex with the smallest distance from the priority queue
         2. for all verticies W adjacent to V
            1. if the distance of V + the weight of the edge V,W is less than the distance of W
               1. update the distance of W
               2. update the previous of W to V
               3. decrease the priority of W in the priority queue

   dijkstras algorythm
      1. set the distance of the start vertex to 0
      2. set the distance of all other verticies to infinity
      3. add all verticies to the priority queue
      4. while the priority queue is not empty



you havea weighted graph each edge (u w ) has a cost Cuv
the cost of the weighted path from node v^1 to v^N is 

dijkstras(graph g, vertex start, vertex finish)
    create a min priotiyy queue (min heap)
    for each vertex v in the graph
         dist[v] = infinity
         prev[v] = undefined
      dist[start] = 0
      priotity queue insert(start,0)
      while the priority queue is not empty
        u = piority queue_MIN
        for each vertex v adjacent to u
            if dist[u] + cost(u,v) < dist[v]
               dist[v] = dist[u] + cost(u,v)
               prev[v] = u
               priority queue decrease key(v,dist[v])

