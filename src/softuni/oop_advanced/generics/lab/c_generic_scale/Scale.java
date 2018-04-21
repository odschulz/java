package softuni.oop_advanced.generics.lab.c_generic_scale;

/**
 * Extend Comparable to guarantee items have compareTo().
 * @param <T>
 */
public class Scale<T extends Comparable> {
    private T left;
    private T right;

    public Scale(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @SuppressWarnings("unchecked")
    public T getHeavier() {
        int result = this.left.compareTo(this.right);
        if (result == 0) {
            return null;
        } else if (result > 0) {
            return this.left;
        } else {
            return this.right;
        }
    }


}
