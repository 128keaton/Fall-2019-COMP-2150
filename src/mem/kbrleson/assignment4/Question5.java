// kbrleson
// October 2nd, 2019

package mem.kbrleson.assignment4;

// Action Interfaces
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

// ActionCharacter class which defines a base 'fight()' method
class ActionCharacter {
    public void fight() {
        System.out.println("We all fight as an ActionCharacter");
    }
}

// Superman class which extends ActionCharacter and extends all the action interfaces
class Superman extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
    String name = "Superman";

    public void fight() {
        System.out.println("Fight bad guys");
    }

    public void fly() {
        System.out.println("Fly faster than Raptor F22");
    }

    public void swimFast() {
        System.out.println("Swim faster than Michael Phelps");
    }

    public void treadH20() {
        System.out.println("Tread water forever");
    }

    public void climb() {
        System.out.println("Climb slippery cliffs");
    }
}

// Me class which extends ActionCharacter and extends all the action interfaces
class Me extends ActionCharacter implements CanFight, CanFly, CanSwim, CanClimb {
    String name = "Keaton Burleson";

    public void fight() {
        System.out.println("Fight with computer mice");
    }

    public void fly() {
        System.out.println("Fly faster than a paper airplane");
    }

    public void swimFast() {
        System.out.println("Swim faster than a rock");
    }

    public void treadH20() {
        System.out.println("Sit in a bathtub forever");
    }

    public void climb() {
        System.out.println("Climb up stairs");
    }
}

// Action
// Main class which defines methods to handle abilities
public class Question5 {
    private static void fightAbility(CanFight x) {
        x.fight();
    }

    private static void flyAbility(CanFly x) {
        x.fly();
    }

    private static void climbAbility(CanClimb x) {
        x.climb();
    }

    private static void swimFastAbility(CanSwim x) {
        x.swimFast();
    }

    private static void treadH20Ability(CanSwim x) {
        x.treadH20();
    }

    private static void parentFightAbility(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Superman superman = new Superman();
        System.out.println("I am " + superman.name + " I can do the following:");
        outputAbilities(superman);


        Me me = new Me();
        System.out.println("I am " + me.name + " I can do the following:");
        outputAbilities(me);
    }

    private static void outputAbilities(ActionCharacter character) {
        ActionCharacter genericCharacter = new ActionCharacter();

        fightAbility((CanFight) character); // Treat it as a CanFight
        flyAbility((CanFly) character); // Treat it as a CanFly
        swimFastAbility((CanSwim) character); // Treat it as CanSwim
        treadH20Ability((CanSwim) character); // Treat it as CanSwim
        climbAbility((CanClimb) character); // Treat it as CanClimb
        parentFightAbility(genericCharacter); // Any character that has the 'fight()' method overridden is taken care of here by using the superclass's method explicity.

        System.out.println("-------------");
    }
}
