package Sigleton;

class Test {

    public static void main(String args[]) {
        StandardInterestRate obj = StandardInterestRate.getInstance();
        StandardInterestRate obj2 = StandardInterestRate.getInstance();

        System.out.println(obj.getInterestRate());
        // Return 3
        System.out.println(obj2.getInterestRate());
        // Return 3
        // Weil gleiches Objekt
    }
}
