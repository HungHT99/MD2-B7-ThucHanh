package rickkei.academy.animals;
import rickkei.academy.edible.IEdible1;
public class Chicken extends Animal implements IEdible1    {

    @Override
    public String makeSound() {
        return "Chicken : cluck-cluck";
    }

}
