// Basic of oops in java....

class Basic {
public static void main(String[] args) {
    Person p1 = new Person(); //  creating object for class person
    p1.setAge(12);
    p1.setName("nalla");

    System.out.println(p1.age);
    System.out.println(p1.naam);


  Bankaccount acc = new Bankaccount();
  acc.username =  "sourabhsharma";
  acc.setpassword("sourabh");
    
}
    
}


class Bankaccount{
   public String username;
   private String password;

   public void setpassword(String pwd){
     password = pwd;

     System.out.println(pwd);

   }



}


class Person{
    int age; 
    String naam;

    void setAge(int newAge){
        age = newAge;
        }

    void setName(String newName){
        naam = newName;
    }
}


