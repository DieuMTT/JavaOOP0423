package BT2.person;

public class Information {
    public static void main(String[] args) {
        Person Obj = new Person("Toan", 30, "Male", "HCM", "0365287550");
        System.out.println("Name:" + Obj.getName());
        System.out.println("Age:" + Obj.getAge());
        System.out.println("Gender:" + Obj.getGender());
        System.out.println("Address:" + Obj.getAddress());
        System.out.println("Phone:" + Obj.getPhone());

    }
}
