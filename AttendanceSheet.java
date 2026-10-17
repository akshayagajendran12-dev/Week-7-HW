class AttendanceSheet {
    private String[] presentStudents;
    private int count;

    public AttendanceSheet(int maxSize) {
        presentStudents = new String[maxSize];
        count = 0;
    }

    public void markPresent(String name) {
        if (name == null || name.trim().isEmpty()) {
            return;
        }

        if (isPresent(name)) {
            return;
        }

        if (count < presentStudents.length) {
            presentStudents[count] = name;
            count++;
        }
    }

    public int getPresentCount() {
        return count;
    }

    public boolean isPresent(String name) {
        if (name == null) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (presentStudents[i].equals(name)) {
                return true;
            }
        }

        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana");

        System.out.println(sheet.getPresentCount());
        System.out.println(sheet.isPresent("Ben"));
        System.out.println(sheet.isPresent("Chen"));
    }
}
