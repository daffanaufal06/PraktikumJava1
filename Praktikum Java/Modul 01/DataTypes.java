import javax.swing.JOptionPane;
public class DataTypes{
 public static void main(String[] args){

  String namaDepan = "Muhammad Daffa";
  String namaBelakang = "Naufal";
  int usia = 20;
  int targetTahunKuliah = 4;
  double ipk = 3.899;
  char nilaiAbjad = 'A';
  boolean tampan = true;

  System.out.println("Nama Lengkap : " + " " + namaDepan +" "+ namaBelakang);

  System.out.println("Usia : " + usia + " Tahun");
  System.out.println("Usia ketika lulus : " + (usia + targetTahunKuliah) + " Tahun");
  JOptionPane.showMessageDialog(null, "Hai " + namaDepan +" "
         + namaBelakang);
  

 }
}
