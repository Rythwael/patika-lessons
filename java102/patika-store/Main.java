import com.sun.source.tree.Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Brand samsung = new Brand(1, "Samsung");
        Brand lenovo = new Brand(2, "Lenovo");
        Brand apple = new Brand(3, "Apple");
        Brand huawei = new Brand(4, "Huawei");
        Brand casper = new Brand(5, "Casper");
        Brand asus = new Brand(6, "Asus");
        Brand HP = new Brand(7, "HP");
        Brand xiaomi = new Brand(8, "Xiaomi");
        Brand monster = new Brand(9, "Monster");

        Comparator<Brand> compareBrand = Comparator.comparing(Brand::getName);
        TreeSet<Brand> brands = new TreeSet<>(compareBrand);
        Comparator<Notebook> compareNotebookPN = Comparator.comparing(Notebook::getProductNumber);
        TreeSet<Notebook> notebooks = new TreeSet<>(compareNotebookPN);
        Comparator<MobilePhone> compareMobilePhonePN = Comparator.comparing(MobilePhone::getProductNumber);
        TreeSet<MobilePhone> mobilePhones = new TreeSet<>(compareMobilePhonePN);

        brands.add(samsung);
        brands.add(lenovo);
        brands.add(apple);
        brands.add(huawei);
        brands.add(casper);
        brands.add(asus);
        brands.add(HP);
        brands.add(xiaomi);
        brands.add(monster);

        Scanner s = new Scanner(System.in);
        boolean isDone = false;
        while (!isDone){
            System.out.println("PatikaStore Ürün Yönetim Paneli !");
            System.out.println("1 - Notebook İşlemleri\n2 - Cep Telefonu İşlemleri\n3 - Markaları Listele\n4 - Çıkış yap");
            int select = s.nextInt();
            while (select<1 || select > 4){
                System.out.println("Geçerli bir değer giriniz");
                select = s.nextInt();
            }
            switch (select){
                case 1:
                    System.out.println("Yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1 - Notebookları Listele\n2 - Notebook Ekle\n3 - Notebook Sil");
                    int noteSelection = s.nextInt();
                    noteSelection(noteSelection,notebooks,brands);
                    break;
                case 2:
                    printMobilePhones();
                    break;
                case 3:
                    printBrands(brands);
                    break;
                default:
                    System.out.println("Görüşmek Üzere :)");
                    isDone = true;
            }
        }

    }


        public static void printBrands (TreeSet<Brand> brands){
            System.out.println("Markalarımız");
            for (Brand brd : brands) {
                System.out.println("- " + brd.getName());
            }
        }

        public static void noteSelection(int selection,TreeSet<Notebook> notebooks,TreeSet<Brand> brands){
        switch (selection){
            case 1:
                printNotebooks(notebooks);
                break;
            case 2:
                addNotebook(notebooks,brands);
                break;
            case 3:
                deleteNotebook(notebooks);
                break;
            default:
                System.out.println("Görüşmek üzere :)");

        }

        }
        public static void printNotebooks (TreeSet<Notebook> notebooks) {

            System.out.println("Filtreleme şeklini seçiniz");
            System.out.println("1 - Ürün numarası\n2 - Marka");
            Scanner s = new Scanner(System.in);
            int printNoteSelection = s.nextInt();
            if (printNoteSelection==1){
                System.out.print(String.format("|%3s|"," ID "));
                System.out.print(String.format("%-20s|"," Ürün Adı "));
                System.out.print(String.format("%-8s|"," Fiyat "));
                System.out.print(String.format("%-7s|"," Marka "));
                System.out.print(String.format("%-11s|"," Depolama "));
                System.out.print(String.format("%-10s|"," Ekran "));
                System.out.print(String.format("%-11s|"," RAM "));
                System.out.println();
                for (Notebook note : notebooks){
                    System.out.format("|% 3d |",note.getProductNumber());
                    System.out.print(String.format("%-20s|"," " + note.getName()) + " ");
                    System.out.format("%-7d|",note.getBasePrice());
                    System.out.print(String.format("%-7s|"," " + note.getBrand()) + " ");
                    System.out.format("%-10d|",note.getMemory());
                    System.out.print(String.format("%-10s|"," " + note.getScreenSize()) + " ");
                    System.out.format("%-10d|",note.getRAM());
                    System.out.println();
                }
            }
        }

        public static void addNotebook(TreeSet<Notebook> notebooks,TreeSet<Brand> brands){
        /*
            Scanner s = new Scanner(System.in);
            System.out.println("Ürün Numarası : ");
            int PN = s.nextInt();
            System.out.println("Ürün Adı : ");
            String name = s.next();
            System.out.println("Ürün Fiyatı : ");
            int price = s.nextInt();
            System.out.println("Ürün Markasını Seçiniz : ");
            Comparator<Brand> compareBrandID = Comparator.comparing(Brand::getId);
            TreeSet<Brand> listedBrands = new TreeSet<>(compareBrandID);
            listedBrands.addAll(brands);
            for (Brand brd : listedBrands){
                System.out.println(brd.getId() + " - " + brd.getName());
            }
            int selectBrand = s.nextInt();
            String brand = "";
            Iterator<Brand> itr = brands.iterator();
            int currentIndex = 0;
            while(itr.hasNext()){
                if( currentIndex == selectBrand ){
                    brand = itr.next().getName();
                    break;
                }
                currentIndex++;
            }
            System.out.println("Ürün Depolama Boyutu : ");
            int memory = s.nextInt();
            System.out.println("Ürün Ekran Boyutu : ");
            double screenSize = s.nextDouble();
            System.out.println("Ürün RAM miktarı : ");
            int RAM = s.nextInt();
            int stock = 100;
            Notebook note = new Notebook(PN,price,stock,name,brand,RAM,memory,screenSize);
            notebooks.add(note);
*/
            Notebook note = new Notebook(1,5000,100,"Excalibur","Apple",16,512,14.6);
            Notebook note2 = new Notebook(2,5000,100,"Arthur","Casper",8,512,15.6);
            notebooks.add(note2);
            notebooks.add(note);
        }

        public static void deleteNotebook(TreeSet<Notebook> notebooks){

        }

        public static void phoneSelection(int selection){
            switch (selection){
                case 1:
                    printMobilePhones();
                    break;
                case 2:
                    addMobilePhones();
                    break;
                case 3:
                    deleteMobilePhones();
                    break;
                default:
                    System.out.println("Görüşmek üzere :)");

            }
        }

        public static void printMobilePhones () {

        }

        public static void addMobilePhones(){

        }

        public static void deleteMobilePhones(){

        }

    }
