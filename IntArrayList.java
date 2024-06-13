public class IntArrayList implements IntList {
    private int[] array;
    private int size;

    public IntArrayList(int[] array, int size) {
        this.array = new int[10];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newLength = (int) (array.length * 1.5);
            int[] newArray = new int[newLength];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    @Override
    public int get(int id) {
        if (id >= 0 && id < size) {
            return array[id];
        }
        return id;
    }
}
