package structural.facade.hero;

/**
 * Created by rek on 22.06.17.
 */
public class HeroMaker {

    private Hulk hulk;
    private CaptainAmerica captainAmerica;
    private IronMan ironMan;

    public HeroMaker() {
        hulk = new Hulk();
        captainAmerica = new CaptainAmerica();
        ironMan = new IronMan();
    }

    public void sayHulk() {
        hulk.say();
    }

    public void sayCaptainAmerica() {
        captainAmerica.say();
    }

    public void sayIronMan() {
        ironMan.say();
    }
}
