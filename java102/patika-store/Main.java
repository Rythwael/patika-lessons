import com.sun.source.tree.Tree;

import java.sql.SQLOutput;
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
                    System.out.println("Yapmak istediğiniz işlemi seçiniz");
                    System.out.println("1 - Cep Telefonlarını Listele\n2 - Cep Telefonu Ekle\n3 - Cep Telefonu Sil");
                    int phoneSelection = s.nextInt();
                    phoneSelection(mobilePhones,phoneSelection,brands);
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

        //Notebook Options
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
                    System.out.format("|%3d |",note.getProductNumber());
                    System.out.print(String.format("%-20s|"," " + note.getName()) + " ");
                    System.out.format("%-7d|",note.getBasePrice());
                    System.out.print(String.format("%-7s|"," " + note.getBrand()) + " ");
                    System.out.format("%-10d|",note.getMemory());
                    System.out.print(String.format("%-10s|"," " + note.getScreenSize()) + " ");
                    System.out.format("%-10d|",note.getRAM());
                    System.out.println();
                }
            } else if (printNoteSelection==2) {
                System.out.println("Aradığınız Markayı giriniz:");
                String brand = s.next();
                System.out.print(String.format("|%3s|"," ID "));
                System.out.print(String.format("%-20s|"," Ürün Adı "));
                System.out.print(String.format("%-8s|"," Fiyat "));
                System.out.print(String.format("%-7s|"," Marka "));
                System.out.print(String.format("%-11s|"," Depolama "));
                System.out.print(String.format("%-10s|"," Ekran "));
                System.out.print(String.format("%-11s|"," RAM "));
                System.out.println();
                for (Notebook note : notebooks){
                    if (note.getBrand().equals(brand)){
                        System.out.format("|%3d |",note.getProductNumber());
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
        }

        public static void addNotebook(TreeSet<Notebook> notebooks,TreeSet<Brand> brands){

            Scanner s = new Scanner(System.in);
            System.out.println("Ürün Numarası : ");
            int PN = s.nextInt();
            System.out.println("Ürün Adı : ");
            String name = s.next();
            System.out.println("Ürün Fiyatı : ");
            int price = s.nextInt();
            System.out.println("Ürün Markasını Seçiniz : ");
            Brand[] listedBrands = new Brand[brands.size()];
            listedBrands = brands.toArray(listedBrands);
            for (int i=0;i< listedBrands.length;i++){
                System.out.println((i+1) + " - " + listedBrands[i].getName());
            }
            int selectBrand = s.nextInt();
            String brand = listedBrands[selectBrand-1].getName();
            System.out.println("Ürün Depolama Boyutu : ");
            int memory = s.nextInt();
            System.out.println("Ürün Ekran Boyutu : ");
            double screenSize = s.nextDouble();
            System.out.println("Ürün RAM miktarı : ");
            int RAM = s.nextInt();
            int stock = 100;
            Notebook note = new Notebook(PN,price,stock,name,brand,RAM,memory,screenSize);
            notebooks.add(note);


        }

        public static void deleteNotebook(TreeSet<Notebook> notebooks){
            System.out.println("Silmek istediğiniz ürünün Ürün Numarasını giriniz");
            Scanner s = new Scanner(System.in);
            int PN = s.nextInt();
            Notebook[] listedNotebooks = new Notebook[notebooks.size()];
            listedNotebooks = notebooks.toArray(listedNotebooks);
            for (Notebook n : listedNotebooks){
                if (n.getProductNumber() == PN){
                    notebooks.remove(n);
                    break;
                }
            }

        }

        //MobilePhone Options
        public static void phoneSelection(TreeSet<MobilePhone> mobilePhones,int selection,TreeSet<Brand> brands){
            switch (selection){
                case 1:
                    printMobilePhones(mobilePhones);
                    break;
                case 2:
                    addMobilePhones(mobilePhones,brands);
                    break;
                case 3:
                    deleteMobilePhones(mobilePhones);
                    break;
                default:
                    System.out.println("Görüşmek üzere :)");

            }
        }

        public static void printMobilePhones (TreeSet<MobilePhone> mobilePhones) {
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
                System.out.print(String.format("%-10s|"," Pil "));
                System.out.print(String.format("%-11s|"," RAM "));
                System.out.print(String.format("%-10s|"," Renk "));
                System.out.println();
                for (MobilePhone phone : mobilePhones){
                    System.out.format("|%3d |",phone.getProductNumber());
                    System.out.print(String.format("%-20s|"," " + phone.getName()) + " ");
                    System.out.format("%-7d|",phone.getBasePrice());
                    System.out.print(String.format("%-7s|"," " + phone.getBrand()) + " ");
                    System.out.format("%-10d|",phone.getMemory());
                    System.out.print(String.format("%-10s|"," " + phone.getScreenSize()) + " ");
                    System.out.format("%-9d|",phone.getBatteryPower());
                    System.out.format("% -11d|",phone.getRAM());
                    System.out.print(String.format("%-10s|"," " + phone.getColor()) + " ");
                    System.out.println();
                }
            } else if (printNoteSelection==2) {
                System.out.println("Aradığınız Markayı giriniz:");
                String brand = s.next();
                System.out.print(String.format("|%3s|"," ID "));
                System.out.print(String.format("%-20s|"," Ürün Adı "));
                System.out.print(String.format("%-8s|"," Fiyat "));
                System.out.print(String.format("%-7s|"," Marka "));
                System.out.print(String.format("%-11s|"," Depolama "));
                System.out.print(String.format("%-10s|"," Ekran "));
                System.out.print(String.format("%-10s|"," Pil "));
                System.out.print(String.format("%-11s|"," RAM "));
                System.out.print(String.format("%-10s|"," Renk "));
                System.out.println();
                for (MobilePhone phone : mobilePhones){
                    if (phone.getBrand().equals(brand)){
                        System.out.format("|%3d |",phone.getProductNumber());
                        System.out.print(String.format("%-20s|"," " + phone.getName()) + " ");
                        System.out.format("%-7d|",phone.getBasePrice());
                        System.out.print(String.format("%-7s|"," " + phone.getBrand()) + " ");
                        System.out.format("%-10d|",phone.getMemory());
                        System.out.print(String.format("%-10s|"," " + phone.getScreenSize()) + " ");
                        System.out.format("%-10d|",phone.getBatteryPower());
                        System.out.format("%-10d|",phone.getRAM());
                        System.out.print(String.format("%-10s|"," " + phone.getColor()) + " ");
                        System.out.println();
                    }
                }
            }
        }

        public static void addMobilePhones(TreeSet<MobilePhone> mobilePhones,TreeSet<Brand> brands){
            Scanner s = new Scanner(System.in);
            System.out.println("Ürün Numarası : ");
            int PN = s.nextInt();
            System.out.println("Ürün Adı : ");
            String name = s.next();
            System.out.println("Ürün Fiyatı : ");
            int price = s.nextInt();
            System.out.println("Ürün Markasını Seçiniz : ");
            Brand[] listedBrands = new Brand[brands.size()];
            listedBrands = brands.toArray(listedBrands);
            for (int i=0;i< listedBrands.length;i++){
                System.out.println((i+1) + " - " + listedBrands[i].getName());
            }
            int selectBrand = s.nextInt();
            String brand = listedBrands[selectBrand-1].getName();
            System.out.println("Ürün Depolama Boyutu : ");
            int memory = s.nextInt();
            System.out.println("Ürün Ekran Boyutu : ");
            double screenSize = s.nextDouble();
            System.out.println("Ürün RAM miktarı : ");
            int RAM = s.nextInt();
            System.out.println("Ürünün Pil Gücü");
            int battery = s.nextInt();
            System.out.println("Ürünün Rengi");
            String color = s.next();
            int stock = 100;
            MobilePhone phone = new MobilePhone(PN,price,stock,name,brand,memory,screenSize,battery,RAM,color);
            mobilePhones.add(phone);
        }

        public static void deleteMobilePhones(TreeSet<MobilePhone> mobilePhones){
            System.out.println("Silmek istediğiniz ürünün Ürün Numarasını giriniz");
            Scanner s = new Scanner(System.in);
            int PN = s.nextInt();
            MobilePhone[] listedPhones = new MobilePhone[mobilePhones.size()];
            listedPhones = mobilePhones.toArray(listedPhones);
            for (MobilePhone n : listedPhones){
                if (n.getProductNumber() == PN){
                    mobilePhones.remove(n);
                    break;
                }
            }
        }

    }
