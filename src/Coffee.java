/**
 * Created by Administrator on 13-12-22.
 */
public class Coffee {
    public static  long counter = 0;
    private final long id = counter++;

    @Override
    public String toString() {
        return  getClass().getSimpleName()+" "+id;
    }
}


class Latte extends Coffee{}
class Mocha extends Coffee{}

class Americano extends Coffee {
}