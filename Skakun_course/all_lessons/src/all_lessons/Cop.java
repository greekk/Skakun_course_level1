package all_lessons;

public class Cop extends Human {

    private double Gun;
    private String rank;

    public Cop withGun(double gun){
        this.Gun = gun;
        return this;
    }

    public Cop withRank(String rank){
        this.rank = rank;
        return this;
    }
}
