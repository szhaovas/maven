package edu.vassar.duck;

public class DuckApp {

    public static void main(String[] args) {
        /*
        BasicDuck duck = null;
        System.out.println("Please type in class name to initialize a duck (MallardDuck/RedheadDuck/RubberDuck/DecoyDuck/ModelDuck)");
        Scanner cl = new Scanner(System.in);
        String classname = cl.next();
        System.out.println("Please type in the name of the duck");
        Scanner n = new Scanner(System.in);
        String name = n.next();
        
        if (classname.equals("MallardDuck")) {
            duck = new MallardDuck(name);
        }
        else if (classname.equals("RedheadDuck")) {
            duck = new RedheadDuck(name);
        }
        else if (classname.equals("RubberDuck")) {
            duck = new RubberDuck(name);
        }
        else if (classname.equals("DecoyDuck")) {
            duck = new DecoyDuck(name);
        }
        else if (classname.equals("ModelDuck")) {
            duck = new ModelDuck(name);
        }
        else {
            System.out.println("Wrong class name! Please type exit");
        }
        while (true) {
            System.out.println("What would you like the duck do? (swim/quack/fly/exit)");
            Scanner in = new Scanner(System.in);
            String instruction = in.next();
            try {
                if (instruction.equals("swim")) {
                    duck.swim();
                } else if (instruction.equals("quack")) {
                    duck.quack();
                } else if (instruction.equals("fly")) {
                    duck.fly();
                } else if (instruction.equals("exit")) {
                    break;
                } else {
                    System.out.println("Wrong instruction, please try again!");
                }
            }
            catch (InputMismatchException e) {
                System.out.println("I don't know how to do it...");
            }
        }
    }
*/
        /*
        BasicDuck duck = new MallardDuck("Mr.Qua");
        Class cls = duck.getClass();
        try{
            Method m = cls.getMethod("swim", null);
            m.invoke(duck);
        } catch(NoSuchMethodException e) {
            System.out.println("error!");
        }
        */
        MallardDuck duck = new MallardDuck("Mr.Qua");
        duck.swim();
        duck.quack();
    }
}
