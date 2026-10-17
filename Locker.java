public class Locker {
    private final int lockerNumber;
    private String combinationCode;

    public Locker(int lockerNumber, String combinationCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = combinationCode;
    }

    public boolean changeCode(String currentCode, String newCode) {
        if (combinationCode.equals(currentCode)) {
            combinationCode = newCode;
            return true;
        }

        return false;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    public static void main(String[] args) {
        Locker l = new Locker(101, "1234");

        System.out.println(
            l.changeCode("1234", "5678")
        ); // true

        System.out.println(
            l.changeCode("0000", "9999")
        ); // false
    }
}
