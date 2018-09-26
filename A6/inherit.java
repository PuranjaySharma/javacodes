class Animal {
   void Speak(){
       System.out.println("Growl");
   }
}
class Dog extends Animal{  
   void dogSpeak(){
     System.out.println("Bark");
  }
}
class Cat extends Animal{
    void catSpeak(){
      System.out.println("Meow");
}
}
class inherit{
public static void main(String args[])
   {
       Dog a=new Dog();
       Cat b=new Cat();

       a.Speak();
       a.dogSpeak();
       b.Speak();
       b.catSpeak();
   }
}