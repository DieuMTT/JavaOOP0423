package BT1;

public class NhanVien {

    private String name;
    private int age;
    private String address;

    public NhanVien(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void getInformation() {
        System.out.println("Name:" + name);
        System.out.println("Age:" + age);
        System.out.println("Address:" + address);
    }

}
