package Behavioral;

interface IteratorEx {
    boolean hasNext();

    Object next();
}

class IteratorExample {
    String[] names = new String[] { "a", "b", "c" };

    public IteratorEx getIterator() {
        return new InnerClassItr();
    }

    class InnerClassItr implements IteratorEx {
        int i = 0;

        @Override

        public boolean hasNext() {
            if (i < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {

            return names[i++];
        }
    }
}

/**
 * InnerIterator
 */
/**
 * Iterator
 */
public class Iterator

{
    public static void main(String[] args) {
        IteratorExample iteratorExample = new IteratorExample();
        IteratorEx iterator = iteratorExample.getIterator();
        for (IteratorEx itr = iteratorExample.getIterator(); iterator.hasNext();) {
            System.out.println(iterator.next());
        }
    }
}