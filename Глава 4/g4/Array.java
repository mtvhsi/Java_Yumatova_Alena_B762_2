package g4;

public class Array {
    private Element[] elements;

    public Array(int size) {
        elements = new Element[size];
    }

    public void create(int[] values) {
        for (int i = 0; i < values.length; i++) {
            elements[i] = new Element(values[i]);
        }
    }

    public void display() {
        System.out.print("Элементы массива: ");
        for (Element element : elements) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public Array add(Array other) {
        int size = Math.min(elements.length, other.elements.length);
        Array result = new Array(size);
        for (int i = 0; i < size; i++) {
            int sum = elements[i].getValue() + other.elements[i].getValue();
            result.elements[i] = new Element(sum);
        }
        return result;
    }

    public Array subtract(Array other) {
        int size = Math.min(elements.length, other.elements.length);
        Array result = new Array(size);
        for (int i = 0; i < size; i++) {
            int diff = elements[i].getValue() - other.elements[i].getValue();
            result.elements[i] = new Element(diff);
        }
        return result;
    }

    public Array multiply(Array other) {
        int size = Math.min(elements.length, other.elements.length);
        Array result = new Array(size);
        for (int i = 0; i < size; i++) {
            int product = elements[i].getValue() * other.elements[i].getValue();
            result.elements[i] = new Element(product);
        }
        return result;
    }
}

