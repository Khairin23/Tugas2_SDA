package linked_list;
import java.util.LinkedList;

public class Tugas2 {
    public static void main(String[] args) {
        
       LinkedList <String> saya = new LinkedList<>();
       saya.add("K");
       saya.add("H");
       saya.add("A");
       saya.add("I");
       saya.add("R");
       saya.add("I");
       saya.add("N");
       saya.add("");
       saya.add("N");
       saya.add("I");
       saya.add("S");
       saya.add("A");
       System.out.println("output tambah : "+saya+", Ukuran :" +saya.size());

       //1. add karakter lain yang anda inginkan
       saya.addFirst("X");
       saya.add("C");
       saya.add("H");
       saya.addLast("A");
       System.out.println("output tambah : "+saya+", Ukuran :" +saya.size());

       //2. sisipkan karakter lain yang anda inginkan
       saya.set(6, "O");
       saya.set(8, "Z");
       saya.set(5, "T");
       saya.set(9, "Y");
       System.out.println("output sisip : "+saya+", Ukuran :" +saya.size());

       // 3. hapus beberapa karaker yang ingin anda hapus
       saya.removeFirst();
       saya.removeLast();
       System.out.println("output hapus : "+saya+", Ukuran :" +saya.size());

       saya.remove("I");
       saya.remove("H");
       System.out.println("output hapus : "+saya+", Ukuran :" +saya.size());

       //4. buat fungsi POP dan PUSH pada project anda
       saya.pop();
       System.out.println("output pop : "+saya+", Ukuran :" +saya.size()); 
       saya.push("B");
       System.out.println("output push : "+saya+", Ukuran :" +saya.size());
       
    




    
    }
}
