import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data diri
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (P/L): ");
        String jenisKelaminInput = scanner.next();
        String jenisKelamin = (jenisKelaminInput.equalsIgnoreCase("L")) ? "laki-laki" : "perempuan";

        System.out.print("Masukkan tanggal lahir (YYYY-MM-DD): ");
        String tanggalLahirStr = scanner.next();

        LocalDate tanggalLahir = LocalDate.parse(tanggalLahirStr);

        int umur = hitungUmur(tanggalLahir);

        // Output data diri
        System.out.println("\nData diri:");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelamin);
        System.out.println("Tanggal Lahir: " + tanggalLahir.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();
    }

    // Method untuk menghitung umur
    public static int hitungUmur(LocalDate tanggalLahir) {
        LocalDate hariIni = LocalDate.now();
        return hariIni.minusYears(tanggalLahir.getYear()).getYear();
    }
}