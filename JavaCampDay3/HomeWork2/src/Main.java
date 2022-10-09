import AbstractClasses.AbstractMain;
import AbstractDemo.AbstractDemoMain;
import Interfaces.InterfacesMain;
import InterfacesDemo.InterfacesDemo;
import Overriding.OverridingMain;
import Polymorphism.PolymorphismMain;
import StaticDemo.StaticDemo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner veri = new Scanner(System.in);

        //reference type
        PolymorphismMain polymorphismMain = new PolymorphismMain();
        OverridingMain overridingMain = new OverridingMain();
        AbstractMain abstractMain = new AbstractMain();
        AbstractDemoMain abstractDemoMain = new AbstractDemoMain();
        InterfacesMain interfacesMain = new InterfacesMain();
        InterfacesDemo interfacesDemo = new InterfacesDemo();
        StaticDemo staticDemo = new StaticDemo();

        System.out.println("Hello Java!\n");

        System.out.println("----------------------------------------------");
        System.out.println("video38 video39 video40 video41");
        System.out.println("video42(video43 dahil) video44");
        System.out.println("video45");
        System.out.println("----------------------------------------------");
        System.out.print("Lutfen secim belirtin: ");
        String veriGirdisi = veri.next();

        switch (veriGirdisi) {
            case "video38" -> polymorphismMain.main();
            case "video39" -> overridingMain.main();
            case "video40" -> abstractMain.main();
            case "video41" -> abstractDemoMain.main();
            case "video42" -> interfacesMain.main();
            case "video44" -> interfacesDemo.main();
            case "video45" -> staticDemo.main();
            default -> System.out.println("Yanlis veri girisi!");
        }
    }
}
