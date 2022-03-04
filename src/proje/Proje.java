package proje;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Proje {

    public static void main(String[] args) throws FileNotFoundException {

        Scanner islem1 = new Scanner(new File("veriler.txt"));
        Vehicle[] araclar = new Vehicle[100];
        int index = 0;
        while (islem1.hasNext()) {
            String tip = islem1.next();
            String plaka = islem1.next();
            String model = islem1.next();
            String marka = islem1.next();
            int kapiyuk = islem1.nextInt();
            
            
            if (tip.equals("car")) {
                Car araba = new Car(plaka, model, marka, kapiyuk);
                araclar[index] = araba;
                index ++;
            } else {
                Truck tir = new Truck(plaka, model, marka, kapiyuk);
                araclar[index] = tir;
                index ++;
            }
        }
        System.out.println("Sıralanmamış hali : ");
        for (int i = 0; i < index; i++) {
            System.out.println(araclar[i]);
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");

        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        for (int i = 0; i < index; i++) { 
            doubleLinkedList.ekle(araclar[i]);
        }
        
        System.out.println("İşlemler yapılmadan önce : ");
        doubleLinkedList.listeyazdir();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        
        Scanner islem2 = new Scanner(new File("islemler.txt"));
        
        String[] ozellik = new String[6];
        while (islem2.hasNext()) {
            ozellik = islem2.nextLine().split(" ");
            for (String i : ozellik) {
                if (i.equals("ekle")) {
                    if (ozellik[1].equals("car")) {
                        Car yeni_araba = new Car(ozellik[2],ozellik[3],ozellik[4],Integer.parseInt(ozellik[5])); 
                        doubleLinkedList.ekle(yeni_araba);
                    }
                    else{
                        Truck yeni_tir = new Truck(ozellik[2],ozellik[3],ozellik[4],Integer.parseInt(ozellik[5])); 
                        doubleLinkedList.ekle(yeni_tir);  
                    }
                } 
                else if (i.equals("sil")) {
                    doubleLinkedList.sil(ozellik[1]);
                }
            }
        }
    doubleLinkedList.listeyazdir();
    doubleLinkedList.terslisteyazdir();
    }
}
