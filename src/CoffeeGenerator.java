import java.util.Iterator;
import java.util.Random;

/**
 * Created by Administrator on 13-12-22.
 */
public class CoffeeGenerator implements Generator<Coffee> ,Iterable<Coffee> {
    private Class [] types = {
            Americano.class,
            Latte.class,
            Mocha.class,
    };
    private static Random random = new Random(47);
    private int size =  0;
    public CoffeeGenerator(){}

    public CoffeeGenerator(int size) {
        this.size = size;
    }

    @Override
    public Coffee neext() {

        try {
            return (Coffee)types[random.nextInt(types.length)].newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    class CoffeeIterator implements Iterator<Coffee> {
        int count = size;
        public boolean hasNext(){
            return count > 0;
        }

        public Coffee next(){
            count --;
            return CoffeeGenerator.this.neext();
        }

        public void remove(){
            throw  new UnsupportedOperationException();
        }

    }

    @Override
    public Iterator<Coffee> iterator() {
        return new CoffeeIterator();
    }

    public static void main(String[] args) {
        CoffeeGenerator coffees = new CoffeeGenerator();
        for (int i = 0 ;i < 3;i++)
            System.out.println(coffees.neext());
        for (Coffee coffee: new CoffeeGenerator(3))
            System.out.println(coffee);
    }
}
