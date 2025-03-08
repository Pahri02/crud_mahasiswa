import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Database.loadFromFile();
        Scanner scanner = new Scanner(System.in);
        String pilihan;

        while (true) {
            System.out.println("===============");
            System.out.println("| Pilih menu: |");
            System.out.println("| [C] : Create (Menambah data)|");
            System.out.println("| [R] : Read (Menampilkan data)|");
            System.out.println("| [U] : Update (Perbarui data)|");
            System.out.println("| [D] : Delete (Menghapus data)|");
            System.out.println("| [X] : Exit (Keluar)|");
            System.out.println("===============");
            System.out.print("Masukkan pilihan: ");
            pilihan = scanner.nextLine().toUpperCase();

            switch (pilihan) {
                case "C":
                    Database.create(scanner);
                    break;
                case "R":
                    Database.read();
                    break;
                case "U":
                    Database.update(scanner);
                    break;
                case "D":
                    Database.delete(scanner);
                    break;
                case "X":
                    System.out.print("Apakah Anda yakin ingin keluar? (Y/N): ");
                    String konfirmasi = scanner.nextLine().toUpperCase();
                    if (konfirmasi.equals("Y")) {

                        System.out.println("Program selesai");
                        scanner.close();
                        return;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
