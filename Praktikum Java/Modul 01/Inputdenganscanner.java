import javax.swing.JOptionPane;
import java.util.Scanner;

public class Inputdenganscanner{
 public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

  String namaDepan = "Muhammad Daffa";
  String namaBelakang = "Naufal";
  int usia = 20;
  int targetTahunKuliah = 4;
  double ipk = 3.899;
  char nilaiAbjad = 'A';
  boolean tampan = true;

  System.out.print("Input Nama Depan : ");
  namaDepan = scanner.nextLine();
  System.out.print("Input Usia : ");
  usia = scanner.nextInt();
  System.out.print("Input IPK : ");
  ipk = scanner.nextDouble();
  System.out.print("");
  System.out.print("Input Nilai Abjad : ");
  nilaiAbjad = scanner.next().charAT(0);

 System.out.printl("========== OUTPUT ==========");
 System.out.printl("Nama Depan : " + namaDepan);
 System.out.printl("Nama Belakang : " + namaBelakang);
 System.out.printl("Usia : " + usia);
 System.out.printl("IPK : " + ipk);
  
 JOptionPane.showMessageDialog(null, "Hai " + namaDepan +" "
         + namaBelakang);

 }
}
