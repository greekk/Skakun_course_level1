package all_lessons;

public class Human {

    {
        this.name = "Jon";
        this.surname = "Doe";
        System.out.println(this.name + " " + this.surname);
    }

    private String name;
    private String surname;
    private String date_of_birth;

   public Human withName(String name){
       this.name = name;
       return this;
   }

   public Human withSurname(String surname){
       this.surname = surname;
       return this;
   }

   public Human withDoB(String dob){
       this.date_of_birth = dob;
       return this;
   }
   @Override
   public String toString(){
       return this.name +  " : " + this.surname + " : " + this.date_of_birth;
   }


   @Override
   public boolean equals(Object o){
       if(this == o) return true;
       if(o == null || (getClass()!= o.getClass())) return false;
       Human human = (Human)o;
       if()
       return false;
   }
}
