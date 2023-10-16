package by.it.academy.task4;
public class BooleanArray {
    private int[] data;
    private int size;
    public int getSize() {
        return size;
    }

    public BooleanArray() {
        data = new int[1]; // Изначально создаем массив из одного целочисленного элемента (32 бита)
        size = 0;
    }

    public void add(boolean v) {
        int dataIndex = size / 32;
        int bitIndex = size % 32;
        if (size >= data.length * 32) {
            // Увеличиваем размер массива при необходимости
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        if (v) {
            data[dataIndex] |= (1 << bitIndex);
        } else {
            data[dataIndex] &= ~(1 << bitIndex);
        }
        size++;
    }

    public boolean get(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        int dataIndex = i / 32;
        int bitIndex = i % 32;
        return ((data[dataIndex] >> bitIndex) & 1) == 1;
    }

    public void add(int i, boolean v) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        int dataIndex = i / 32;
        int bitIndex = i % 32;
        if (size >= data.length * 32) {
            // Увеличиваем размер массива при необходимости
            int[] newData = new int[data.length * 2];
            System.arraycopy(data, 0, newData, 0, data.length);
            data = newData;
        }
        if (i < size) {
            // Сдвигаем элементы массива, чтобы вставить новое значение
            System.arraycopy(data, dataIndex, data, dataIndex + 1, (size / 32) - dataIndex);
        }
        if (v) {
            data[dataIndex] |= (1 << bitIndex);
        } else {
            data[dataIndex] &= ~(1 << bitIndex);
        }
        size++;
    }

    public void set(int i, boolean v) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        int dataIndex = i / 32;
        int bitIndex = i % 32;
        if (v) {
            data[dataIndex] |= (1 << bitIndex);
        } else {
            data[dataIndex] &= ~(1 << bitIndex);
        }
    }

    public boolean remove(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException("Index is out of bounds.");
        }
        int dataIndex = i / 32;
        int bitIndex = i % 32;
        boolean removedValue = ((data[dataIndex] >> bitIndex) & 1) == 1;
        // Создаем новый массив с уменьшенным размером
        int[] newData = new int[(size - 1) / 32 + 1];
        int newDataIndex = 0;
        for (int j = 0; j < size; j++) {
            if (j != i) {
                int oldDataIndex = j / 32;
                int oldBitIndex = j % 32;
                if (((data[oldDataIndex] >> oldBitIndex) & 1) == 1) {
                    newData[newDataIndex] |= (1 << (j % 32));
                }
                newDataIndex = j % 32 == 31 ? newDataIndex + 1 : newDataIndex;
            }
        }
        data = newData;
        size--;
        return removedValue;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(get(i));
            if (i < size - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
