public class Student {
    String nim;
    String name;
    String kelas;
    double ipk;

    Student(String nim, String name, String kelas, double ipk) {
        this.nim = nim;
        this.name = name;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    void print() {
        System.out.println(nim + " - " + name + " - " + kelas + " - " + ipk);
    }
}
