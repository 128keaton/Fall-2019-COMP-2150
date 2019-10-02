package mem.kbrleson.assignment4;

interface CanFight {
    void fight();
}

interface CanFly {
    void fly();
}

interface CanClimb {
    void climb();
}

interface CanSwim {
    void swimFast();
    void treadH20();
}

class ActionCharacter {
    public void fight() {System.out.println(" fight an Action Char");}
}

class Superman extends ActionCharacter implements CanFight,  CanFly, CanSwim, CanClimb{
    String name = "Superman";
    public void fight() {System.out.println("fight bad guys");}
    public void fly() {System.out.println("fly faster than Raptor F22");}

    public void swimFast() {System.out.println("Swim faster than Michael Phelps");}
    public void treadH20() {System.out.println("Tread water forever");}

    public void climb() {System.out.println("climb slippery cliffs");}
}

class Me extends ActionCharacter implements CanFight,  CanFly, CanSwim, CanClimb{
    String name = "Keaton Burleson";
    public void fight() {System.out.println("fight with ");}
    public void fly() {System.out.println("fly faster than Raptor F22");}

    public void swimFast() {System.out.println("Swim faster than Michael Phelps");}
    public void treadH20() {System.out.println("Tread water forever");}

    public void climb() {System.out.println("climb slippery cliffs");}
}

class Action {
    private static void fightAbility(CanFight x) { x.fight(); }
    private static void flyAbility(CanFly x) { x.fly(); }
    private static void climbAbility(CanClimb x) { x.climb(); }
    private static void swimFastAbility(CanSwim x) { x.swimFast(); }
    private static void treadH20Ability(CanSwim x) { x.treadH20(); }
    private static void parentFightAbility(ActionCharacter x) { x.fight(); }

    public static void main(String[] args) {
        Superman h = new Superman();
        System.out.println("I am " + h.name + " I can do the following:" );
        fightAbility(h); // Treat it as a CanFight
        flyAbility(h); // Treat it as a CanFly
        swimFastAbility(h);
        treadH20Ability(h);
        climbAbility(h);
        parentFightAbility(h);
    }
}

public class Question5 {
    public static void main(String[] args) {
        Action.main(args);
    }
}
