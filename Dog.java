public class Dog {

    private String name;

    public Dog(){
    }

    public Dog(String name){
        name = name;
    }

    public void speak(){
        System.out.println("Wung");
    }

    public void eat(String str){
        System.out.println("I'm eating " + str + ". Wung");
    }

    public void meta(){
        System.out.println("I'm just a program. Wung");
    }

    public String toString(){
        return "My name is " + name + ". I'm a dog!";
    }

    public static void main(String[] args){
        Dog marcell = new Dog("Marcell");
        marcell.speak();
        marcell.eat("cracker");
        marcell.eat("cheese");
        marcell.meta();
        marcell.toString();
    }
    
}


