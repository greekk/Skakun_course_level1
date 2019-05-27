package all_lessons;

public class lesson4 {

    public static void main(String[] args){
        Human human = new Human().withDoB("13/03/1944").withName("Bob").withSurname("Smith");
        Human human2 = new Human().withDoB("13/03/1944").withName("Bob").withSurname("Smith");
        System.out.println(human == human2);
        System.out.println(human.equals(human2));

        Human cop = new Cop().withGun(4.34d).withRank("major").withName("Alex").withSurname("Murphy");

    }
}
