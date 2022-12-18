import java.util.Scanner;
public class kinan {
    private static void bioData() {
        do {
            Scanner userObj = new Scanner(System.in);
            System.out.print("Masukan Nama Anda [1..25] : ");
            String name = userObj.nextLine();
            while (name.length()<1 || name.length()>25){
                System.out.println("Inputan Nama minimal 1-25 Karakter.");
                System.out.print("Masukan Nama Anda [1..25] : ");
                name = userObj.nextLine();
            }
            System.out.print("Masukan NIM Anda [harus 10 karakter] : ");
            String id = userObj.next();
            while (id.length() != 10){
                System.out.println("Inputan NIM harus 10 karakter");
                System.out.print("Masukkan NIM Anda [harus 10 karakter]: ");
                id = userObj.next();
            }

            System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@");
            System.out.println("\nRegistrasi Sukses.,");
            System.out.println("Selamat Datang " + name + " [NIM : " + id +"].. ^v^");
        }
        while(false);
    }
    private static void fibonacci( int limit) {
        int past, current, fibonacci, hasil=0;
        System.out.println(limit+" Bilangan Fibonacci :");
        past = 0;
        current = 1;
        fibonacci = 1;
        for (int i =1; i <= limit; i++){
            System.out.print(current + " ");
            fibonacci = past + current;
            past = current;
            current = fibonacci;
            hasil += past;
        }
        System.out.print("\nHasil Penjumlahan = "+ hasil);
        System.out.println("\n");
    }
    private static void even( int limit) {
        int past, count=0, even, hasil=0;
        System.out.println(limit+" Bilangan Genap :");
        int i=0;
        while (count <= limit){
            if (i % 2 == 0){
                System.out.print(i + " ");
                hasil += i;
                count++;
            }
            i++;
        }
        System.out.print("\nHasil Penjumlahan = "+ hasil);
        System.out.println("\n");
    }
    private static void odd( int limit) {
        int past, count=1, odd, hasil=0;
        System.out.println(limit+" Bilangan Ganjil :");
        int i=0;
        while (count <= limit){
            if (i % 2 != 0){
                System.out.print(i + " ");
                hasil += i;
                count++;
            }
            i++; }
        System.out.print("\nHasil Penjumlahan = "+ hasil);
        System.out.println("\n");
    }
    public static void main(String[] args) throws Exception {
        boolean valid;
        while (true){
            Scanner input = new Scanner(System.in);bioData();
            System.out.println("Mari belajar macam-macam deret bilangan..");
            do{
                valid = true;
                System.out.println("@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
                System.out.print("Masukan sembarang angka [5..20] : ");
                int limit = input.nextInt();
                if (limit < 5 || limit > 20){
                    valid = false;
                }
                else {
                    System.out.println("\n@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@\n");
                    System.out.println("Deret Bilangan");
                    System.out.println("################\n");
                    even(limit);
                    odd(limit);
                    fibonacci(limit);
                }
            }while(!valid);
            System.out.print("Anda igin mengulang [y/t] : ");
            Character loop = input.next().charAt(0);
            if(loop == 'Y' || loop == 'y'){
                System.out.println("\n");
                continue;
            }
            else if(loop == 'T' || loop == 't'){
                break;
            } else{
                break;
            }
        }
    }
}
