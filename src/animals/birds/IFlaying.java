package animals.birds;

public interface IFlaying {

    default void fly(){
        System.out.println("Я лечу");
    }
}
