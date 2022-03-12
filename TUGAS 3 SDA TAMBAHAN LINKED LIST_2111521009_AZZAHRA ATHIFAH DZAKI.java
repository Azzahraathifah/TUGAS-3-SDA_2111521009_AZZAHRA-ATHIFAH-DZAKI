import java.util.LinkedList;
public class tugaszahra3 {
    public static void main(String[] args) {
         
         LinkedList <String> nama_mahasiswa = new LinkedList<>();
         LinkedList <String> nim_mahasiswa = new LinkedList<>();
         LinkedList <String> alamat_mahasiswa = new LinkedList<>();
        
         //data awal mahasiswa
         nama_mahasiswa.add("AZZAHRA ATHIFAH DZAKI");
         nama_mahasiswa.add("JENNIE KIM");
         nama_mahasiswa.add("LALISA MANOBAN");
 
         nim_mahasiswa.add("2111521009");
         nim_mahasiswa.add("2111521696");
         nim_mahasiswa.add("2111522797");
 
         alamat_mahasiswa.add("INDONESIA");
         alamat_mahasiswa.add("SELANDIA BARU");
         alamat_mahasiswa.add("THAILAND");

         nama_mahasiswa.add("KIM JISOO");
         nim_mahasiswa.add("2111520395");
         alamat_mahasiswa.add("KOREA SELATAN");
 
         nama_mahasiswa.add("ROSEANNE PARK");
         nim_mahasiswa.add("2111521197");
         alamat_mahasiswa.add("AUSTRALIA");
         
         System.out.println(" ");
         System.out.println("===========DATA MAHASISWA AWAL===========");
         System.out.println("NAMA\t: " + nama_mahasiswa);
         System.out.println("NIM\t: " + nim_mahasiswa);
         System.out.println("ALAMAT\t: " + alamat_mahasiswa);
         System.out.println(" ");

         //fungsi isEmpty
         System.out.println("===========DATA MAHASISWA YANG KOSONG===========");
         System.out.println("NAMA\t: " + nama_mahasiswa.isEmpty());
         System.out.println("NIM\t: " + nim_mahasiswa.isEmpty());
         System.out.println("ALAMAT\t: " + alamat_mahasiswa.isEmpty());
         System.out.println(" ");
 
         //fungsi add First dan Last
         nama_mahasiswa.addFirst("GIGI HADID");
         nim_mahasiswa.addFirst("2111522395");
         alamat_mahasiswa.addFirst("AMERIKA SERIKAT");
 
         nama_mahasiswa.addLast("KENDALL JENNER");
         nim_mahasiswa.addLast("2111520395");
         alamat_mahasiswa.addLast("INGGRIS");
 
         System.out.println("===========DATA MAHASISWA SETELAH DI ADD===========");
         System.out.println("NAMA\t: " + nama_mahasiswa);
         System.out.println("NIM\t: " + nim_mahasiswa);
         System.out.println("ALAMAT\t: " + alamat_mahasiswa);
         System.out.println(" ");
 
         //fungsi set 
         nama_mahasiswa.set(3, "KIM SEOKJIN");
         nim_mahasiswa.set(3, "2111520492");
         alamat_mahasiswa.set(3, "KOREA SELATAN");
 
         System.out.println("===========DATA MAHASISWA  SETELAH DI SET===========");
         System.out.println("NAMA\t: " + nama_mahasiswa);
         System.out.println("NIM\t: " + nim_mahasiswa);
         System.out.println("ALAMAT\t: " + alamat_mahasiswa);
         System.out.println(" ");

         //funsgi indexOf
         System.out.println("===========DATA MAHASISWA YANG DICARI===========");
         System.out.println("DATA MAHASISWA\t: AZZAHRA ATHIFAH DZAKI");
         System.out.println("NAMA\t: " + nama_mahasiswa.indexOf("AZZAHRA ATHIFAH DZAKI"));
         System.out.println("NIM\t: " + nim_mahasiswa.indexOf("2111521009"));
         System.out.println("ALAMAT\t: " + alamat_mahasiswa.indexOf("INDONESIA"));
         System.out.println(" ");
  
         //fungsi remove 
         nama_mahasiswa.removeLast();
         nama_mahasiswa.remove(0);
         
         nim_mahasiswa.removeLast();
         nim_mahasiswa.remove(0);
 
         alamat_mahasiswa.removeLast();
         alamat_mahasiswa.remove(0);
 
         System.out.println("===========DATA MAHASISWA  SETELAH DI REMOVE===========");
         System.out.println("NAMA\t: " + nama_mahasiswa);
         System.out.println("NIM\t: " + nim_mahasiswa);
         System.out.println("ALAMAT\t: " + alamat_mahasiswa);
         System.out.println(" ");
         
         //push
         nama_mahasiswa.push("JUNG HOSEOK");
         nim_mahasiswa.push("2111521894");
         alamat_mahasiswa.push("PAKISTAN");
 
         nama_mahasiswa.push("KIM NAMJOON");
         nim_mahasiswa.push("2111521294");
         alamat_mahasiswa.push("MALAYSIA");

         System.out.println("===========DATA MAHASISWA  SETELAH PUSH===========");
         System.out.println("NAMA\t: " + nama_mahasiswa);
         System.out.println("NIM\t: " + nim_mahasiswa);
         System.out.println("ALAMAT\t: " + alamat_mahasiswa);
         System.out.println(" ");
 
         //pop
         nama_mahasiswa.pop();
         nim_mahasiswa.pop();
         alamat_mahasiswa.pop();
 
         System.out.println("===========DATA MAHASISWA SETELAH DI POP===========");
         System.out.println("NAMA\t: " + nama_mahasiswa);
         System.out.println("NIM\t: " + nim_mahasiswa);
         System.out.println("ALAMAT\t: " + alamat_mahasiswa);
         System.out.println(" ");
 
         //get 
         System.out.println("DATA MAHASISWA TERATAS:  ");
         System.out.println(nama_mahasiswa.getFirst());
         System.out.println(nim_mahasiswa.getFirst());
         System.out.println(alamat_mahasiswa.getFirst());
 
         //size
         System.out.println(" ");
         System.out.println("BANYAK DATA MAHASISWA AKHIR: " + nama_mahasiswa.size());
    }
}
