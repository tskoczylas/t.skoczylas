class ArraySorter {
    public static void main(String[] args) {
        Sortable sorter = new Sortable() {
            @Override
            public void sort(int[] array) {
                for (int i = 0; i < array.length; i++) {
                    for (int j = 1; j < array.length - i; j++) {
                        if (array[j - 1] > array[j]) {
                            int temp = array[j];
                            array[j] = array[j - 1];
                            array[j - 1] = temp;
                        }
                    }
                }
            }
        };
        int[] tab = {5 ,1 ,4, 2, 8};
        printArray(tab);
        sorter.sort(tab);
        printArray(tab);
    }

    private static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    private interface Sortable {
        void sort(int[] array);
    }
}