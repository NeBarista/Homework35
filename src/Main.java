public class Main {
    public static void main(String[] args) {
        System.out.println(stringCount(new String[] {"b", "ss", "f", "i"}));
        System.out.println(stringCount(new String[] {"a"}));
        System.out.println(stringCount(new String[] {""}));
        System.out.println(stringCount(new String[] {"3"}));
        System.out.println(stringCount(new String[] {" "}));
        System.out.println(stringCount(new String [] {}));
    }
    public static int stringCount(String[] array) {
        int count = 0;
        if (array.length <1) {
            System.out.println("array is empty");
            count = -1;
        } else {
            for (String string : array) {
                if (string.isEmpty()) {
                    count++;
                }
            }
        }
        return count;
    }
}