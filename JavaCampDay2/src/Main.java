import Classes.Classes;
import DataTypes.DataType;
import Fields.ProductMenu;
import Inheritance.PersonMenu;
import InheritanceDemo.InherticanceMain;
import MethodOverloading.Overloading;
import Methods.Method;
import RecapDemo_Classes.DortIslemClasses;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        //reference type
        Method method = new Method();
        Classes classes = new Classes();
        DataType dataType = new DataType();
        DortIslemClasses dortIslem = new DortIslemClasses();
        ProductMenu productMenu = new ProductMenu();
        Overloading overloading = new Overloading();
        PersonMenu personMenu = new PersonMenu();
        InherticanceMain inherticanceMain = new InherticanceMain();

        System.out.println("Hello Java!\n");

        System.out.println("----------------------------------------------");
        System.out.println("video24 video25 video26 video27");
        System.out.println("video27 (video27 ve video28 icin)");
        System.out.println("video29 video30");
        System.out.println("video31 (video31, video32, video33, video34)");
        System.out.println("video35 video36 video37");
        System.out.println("----------------------------------------------");
        System.out.print("Lutfen secim belirtin: ");
        String veriGirdisi = veri.next();

        switch (veriGirdisi) {
            case "video24" -> method.sayiBulma();
            case "video25" -> method.toplamaIslemi();
            case "video26" -> method.toplama();
            case "video27" -> classes.customerManager();
            case "video29" -> dataType.referenceDataType();
            case "video30" -> dortIslem.matematikIslemi();
            case "video31" -> productMenu.productManager();
            case "video35" -> overloading.islem();
            case "video36" -> personMenu.personManager();
            case "video37" -> inherticanceMain.inheritanceDemo();

            default -> System.out.println("Yanlis veri girisi!");
        }
    }

}
