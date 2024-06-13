public class IntVector implements IntList{
    private int[] array;
    private int size;

    public IntVector(int[] array, int size) {
        this.array = new int[20];
        this.size = 0;
    }

    @Override
    public void add(int number) {
        if (size == array.length) {
            int newLength = (int) (array.length * 20);
            int[] newArray = new int[newLength];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
    }

    @Override
    public void get(int id) {

        }
}
