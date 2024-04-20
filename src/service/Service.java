
package service;

import persoane.*;
import stocpiese.*;
import serviciiservice.*;
import Masina.*;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Service {
    
  public ArrayList<Object> Citire(String filepath) {
    ArrayList<Object> objects = new ArrayList<>();

    try (FileInputStream fileIn = new FileInputStream(filepath);
         ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {

        while (true) {
            try {
                Object obj = objectIn.readObject();
                objects.add(obj);
            } catch (EOFException eof) {
                break;
            }
        }
    } catch (IOException | ClassNotFoundException ex) {
        ex.printStackTrace();
    }
    
    return objects;
}

    public static void main(String[] args) {
       
        Persoane p1 = new Persoane("Dan", "Pop", 47, "angajat");
        Persoane p2 = new Persoane("Vlad", "Capatos", 23, "client");
        Persoane p3 = new Persoane("Marius", "Negru", 33, "angajat");
        Persoane p4 = new Persoane("Florin", "Pop", 22, "client");
        p1.AfisPers();
        p1.setvarsta(30);
        System.out.println(p1);
        p2.AfisPers();
        p2.setNume("Vlad");
        System.out.println(p2);
        p3.AfisPers();
        p3.setPrenume("Borcea");
        System.out.println(p3);
        p4.AfisPers();
        p4.settip("Angajat");
        System.out.println(p4);
        System.out.println(" ");
        
        Client c1 = new Client("Vlad", "Capatos", 23, "client", "Mazda", "Miata", 1995, "egs8g7es8");
        Client c2 = new Client("Florin", "Pop", 22, "client", "BMW", "Seria 3",2014, "efsf6sf");
        Client c3 = new Client("Pablo", "Escobar", 56,"client", "Mercedes-Benz", "S650", 2022, "sefsef87sf");
        Client c4 = new Client("Valentin", "DDD", 33, "client", "Seat", "Leon", 2013, "efs6f875");
        c1.AfisareClient();
        c1.setAnMasina(2011);
        System.out.println(c1);
        c2.AfisareClient();
        c2.setSerieSasiu("gfeas8a");
        System.out.println(c2);
        c3.AfisareClient();
        c3.setMarcaMasina("Mercedes");
        System.out.println(c3);
        c4.AfisareClient();
        c4.setModelMasina("Ibiza");
        System.out.println(c4);
        System.out.println(" ");
        
        Angajat a1 = new Angajat("Dan", "Pop", 47, "angajat","tinichigiu", 4500, 2004);
        Angajat a2 = new Angajat("Marius", "Negru", 33, "angajat", "mecanic motor", 5000, 2010);
        Angajat a3 = new Angajat("Cristian", "Lungu", 40, "angajat", "Electrician", 4500, 2008);
        a1.AfisareAngajat();
        a1.setAnAngajare(2000);
        System.out.println(a1);
        a2.AfisareAngajat();
        a2.setsalariu(6000);
        System.out.println(a2);
        a3.AfisareAngajat();
        a3.setcalificare("electrician");
        System.out.println(a3);
        System.out.println(" ");
        
        Masina m1 = new Masina("BMW", "Seria 4", "fesf86", 2020, "baterie descarcata");
        Masina m2 = new Masina("Audi", "A7", "87fawf", 2018, "distributie");
        Masina m3 = new Masina("Dacia", "Logan", "sfes78f", 2008, "rugina");
        Masina m4 = new Masina("BMW", "M5", "fe87fsa", 2016, "injectoare");
        m1.Afis();
        m1.setMarca("Bmw");
        System.out.println(m1);
        m2.Afis();
        m2.setModel("A8");
        System.out.println(m2);
        m3.Afis();
        m3.setAn(2015);
        System.out.println(m3);
        m4.Afis();
        m4.setProblema("Buji");
        System.out.println(m4);
        System.out.println();
        
        ServiciiService ss1 = new ServiciiService("Schimbare baterie", 100, 60, "baterie", 2794, "electrician");
        ServiciiService ss2 = new ServiciiService("Schimbare injectoare", 300, 220, "injectoare", 282, "mecanic motor");
        ServiciiService ss3 = new ServiciiService("Schimbare buji", 100, 120, "buji", 23794, "mecanic motor");
        ServiciiService ss4 = new ServiciiService("Schimbare Far", 180, 120, "far", 3282, "electrician");
        ss1.Afis();
        ss1.setpret(115);
        System.out.println(ss1);
        ss2.Afis();
        ss2.setdurata(200);
        System.out.println(ss2);
        ss3.Afis();
        ss3.setCod(7924);
        System.out.println(ss3);
        ss4.Afis();
        ss4.setCalificare("Mecanic Motor");
        System.out.println(ss4);
        System.out.println(" ");
        
        StocPiese sp1 = new StocPiese("Baterie", 2, 350, 23225);
        StocPiese sp2 = new StocPiese("Bujie", 30, 100, 72947);
        StocPiese sp3 = new StocPiese("Far", 4, 2500, 9024);
        StocPiese sp4 = new StocPiese("Injector", 33, 240, 29442);
        sp1.Afis();
        sp1.setCantitate(6);
        System.out.println(sp1);
        sp2.Afis();
        sp2.setPret(130);
        System.out.println(sp2);
        sp3.Afis();
        sp3.setCod(6836);
        System.out.println(sp3);
        sp4.Afis();
        sp4.setNume("injector");
        System.out.println(sp4);
        System.out.println(" ");
        
          
    Persoane[] VectorPers;
    VectorPers = new Persoane[17];
    VectorPers[0] = new Persoane("Dan", "Pop", 38, "client");
    VectorPers[1] = new Persoane("Dan", "Pop", 38, "client");
    VectorPers[2] = new Persoane("Cristian", "Radu", 57, "angajat");
    VectorPers[3] = new Persoane("Marian", "Balan", 29, "client");
    VectorPers[4] = new Persoane("Ana", "Rosu", 21, "client");
    VectorPers[5] = new Persoane("Valentin", "Cristea", 47, "angajat");
    VectorPers[6] = new Persoane("Diana", "Pop", 43, "client");
    VectorPers[7] = new Persoane("Florin", "Sandu", 32, "angajat");
    VectorPers[8] = new Persoane("Ioana", "Popescu", 31, "client");
    VectorPers[9] = new Persoane("Andrei", "Luca", 60, "angajat");
    VectorPers[10] = new Persoane("Cosmin", "Radu", 56, "client");
    VectorPers[11] = new Persoane("Aurelian", "Negru", 29, "angajat");
    VectorPers[12] = new Persoane("Radu", "Popescu", 35, "angajat");
    VectorPers[13] = new Persoane("Gabrie;", "Balan", 27, "client");
    VectorPers[14] = new Persoane("Dan", "Ban", 42, "angajat");
    VectorPers[15] = new Persoane("Dan", "Ban", 42, "angajat");
    VectorPers[16] = new Persoane("Dan", "Ban", 42, "angajat");
    for (Persoane p : VectorPers) {
            System.out.println(p);
        }
    
    Client[] VectorClient = new Client[15];
    VectorClient[0] = new Client("Vlad", "Capatos", 23, "client", "Ford", "Focus", 2003, "egs8g7es8");
    VectorClient[1] = new Client("Marius", "Luca", 33, "client", "Mazda", "Miata", 1995, "4b66e6eb");
    VectorClient[2] = new Client("Ioana", "Radu", 21, "client", "Seat", "Leon", 2005, "gfse7887");
    VectorClient[3] = new Client("Ana", "Pop", 45, "client", "Audi", "A1", 2019, "ehejtf7ua");
    VectorClient[4] = new Client("Marian", "Popescu", 38, "client", "Bmw", "M4", 2022, "4tjwkkwj");
    VectorClient[5] = new Client("Alexandru", "Cristea", 40, "client", "Dacia", "Sandero", 2008, "ew4vtgwkj");
    VectorClient[6] = new Client("Cristian", "Pop", 52, "client", "Renault", "Megan", 2014, "efsowa78");
    VectorClient[7] = new Client("Raluca", "Popescu", 53, "client", "Bmw", "X5", 2020, "7f5ea78f");
    VectorClient[8] = new Client("Vlad", "Neagu", 32, "client", "Mercedes", "C220", 2008, "7f6e9av7f");
    VectorClient[9] = new Client("Dan", "Negru", 24, "client", "Audi", "Q5", 2012, "8seegs8");
    VectorClient[10] = new Client("Florin", "Radu", 31, "client", "Volkswagen", "Passat", 2009, "egs8g7es8");
    VectorClient[11] = new Client("Andreea", "Pop", 35, "client", "Mazda", "6", 2018, "g7sdg7s");
    VectorClient[12] = new Client("Luca", "Capatos", 22, "client", "Volkswagen", "Golf", 2011, "s2ggg42s");
    VectorClient[13] = new Client("Maria", "Popescu", 29, "client", "Seat", "Ibiza", 2007, "s87vss79");
    VectorClient[14] = new Client("Radu", "Ban", 31, "client", "Toyota", "Yaris", 2014, "z24z4v2zs");
    for (Client c : VectorClient) {
        System.out.println(c);
    }
    
    Angajat[] VectorAngajat = new Angajat[15];
    VectorAngajat[0] = new Angajat("Dan", "Pop", 45, "angajat","tinichigiu", 5000, 2004);
    VectorAngajat[1] = new Angajat("Vlad", "Popescu", 32, "angajat","mecanic motor", 4700, 2015);
    VectorAngajat[2] = new Angajat("Marian", "Radu", 51, "angajat","detailing", 4800, 2013);
    VectorAngajat[3] = new Angajat("Marius", "Balan", 42, "angajat","mecanic motor", 4700, 2020);
    VectorAngajat[4] = new Angajat("Florin", "Negru", 38, "angajat","vulcanizare", 3900, 2021);
    VectorAngajat[5] = new Angajat("Cristian", "Popescu", 34, "angajat","mecanic motor", 4100, 2014);
    VectorAngajat[6] = new Angajat("Andrei", "Ban", 30, "angajat","detailing", 4000, 2015);
    VectorAngajat[7] = new Angajat("Liviu", "Pop", 40, "angajat","tinichigiu", 3900, 2018);
    VectorAngajat[8] = new Angajat("Gabriel", "Cristea", 39, "angajat","vulcanizare", 3500, 2008);
    VectorAngajat[9] = new Angajat("Alexandru", "Balan", 28, "angajat","electrician", 4800, 2019);
    VectorAngajat[10] = new Angajat("Radu", "Dima", 29, "angajat","electrician", 4700, 2014);
    VectorAngajat[11] = new Angajat("Cosmin", "Negru", 39, "angajat","vulcanizare", 4200, 2006);
    VectorAngajat[12] = new Angajat("George", "Lup", 42, "angajat","mecanic motor", 4000, 2017);
    VectorAngajat[13] = new Angajat("Dorian", "Popescu", 43, "angajat","electrician", 5600, 2009);
    VectorAngajat[14] = new Angajat("Andrei", "Dima", 50, "angajat","tinichigiu", 3400, 2004);
    for (Angajat a : VectorAngajat) {
        System.out.println(a);
    }
    
    Masina[] VectorMasina = new Masina[15];
    VectorMasina[0] = new Masina("BMW", "M4", "4tjwkkwj", 2020, "baterie");
    VectorMasina[1] = new Masina("Citroen", "C4", "a8f6wa6", 2013, "parbriz");
    VectorMasina[2] = new Masina("Hyundai", "Elantra", "a7fa77fa", 2022, "cauciuc");
    VectorMasina[3] = new Masina("Skoda", "Fabia", "af6a6f8c", 2009, "far");
    VectorMasina[4] = new Masina("Renault", "Clio", "dv6d4a76v", 2012, "baterie");
    VectorMasina[5] = new Masina("Dacia", "Logan", "a75c875v", 2007, "evacuare");
    VectorMasina[6] = new Masina("BMW", "Seria 5", "v7a5dv8a57", 2019, "buji");
    VectorMasina[7] = new Masina("Mazda", "3", "v6asdv68a", 2006, "volan");
    VectorMasina[8] = new Masina("Audi", "Q7", "vd7a5v8a75", 2013, "injectoare");
    VectorMasina[9] = new Masina("Seat", "Leon", "gfse7887", 2020, "distirbutie");
    VectorMasina[10] = new Masina("Volkswagen", "Sharan", "s2esav46", 2004, "baterie");
    VectorMasina[11] = new Masina("Skoda", "Octavia", "vsdv45s6", 2010, "evacuare");
    VectorMasina[12] = new Masina("BMW", "Seria 4", "vs57dvs7", 2015, "buji");
    VectorMasina[13] = new Masina("Mercedes", "G63", "vdsv53s", 2023, "far");
    VectorMasina[14] = new Masina("Audi", "A4", "sdv4syv4", 2014, "volan");
    for (Masina m : VectorMasina) {
        System.out.println(m);
    }
    
    ServiciiService[] VectorServicii = new ServiciiService[15];
    VectorServicii[0] = new ServiciiService("Schimbare baterie", 100, 60, "baterie", 23225, "electrician");
    VectorServicii[1] = VectorServicii[0];
    VectorServicii[2] = new ServiciiService("Schimbare buji", 150, 60, "buji", 9285092, "mecanic motor");
    VectorServicii[3] = new ServiciiService("Schimbare distirbutie", 300, 120, "distributie", 352857, "mecanic motor");
    VectorServicii[4] = new ServiciiService("Schimbare cauciuc", 100, 60, "cauciuc", 232352, "vulcanizare");
    VectorServicii[5] = new ServiciiService("Schimbare parbriz", 1200, 610, "parbriz", 2794, "tinichigiu");
    VectorServicii[6] = new ServiciiService("Schimbare volan", 400, 60, "volan", 2566, "detailing");
    VectorServicii[7] = new ServiciiService("Schimbare injectoare", 700, 120, "injectoare", 132435, "mecanic motor");
    VectorServicii[8] = new ServiciiService("Schimbare evacuare", 1000, 240, "evacuare", 23225, "mecanic motor");
    VectorServicii[9] = new ServiciiService("Schimbare galerie", 620, 300, "galerie", 23225, "mecanic motor");
    VectorServicii[10] = new ServiciiService("Schimbare far", 300, 180, "far", 252522, "electrician");
    VectorServicii[11] = new ServiciiService("Schimbare baterie", 120, 30, "baterie", 23225, "electrician");
    VectorServicii[12] = new ServiciiService("Schimbare buji", 100, 100, "buji", 9285092, "mecanic motor");
    VectorServicii[13] = new ServiciiService("Schimbare distirbutie", 700, 120, "distirbutie", 352857, "mecanic motor");
    VectorServicii[14] = new ServiciiService("Schimbare cauciuc", 110, 30, "cauciuc", 232352, "vulcanizare");
    for (ServiciiService ss : VectorServicii ) {
        System.out.println(ss);
    }
    
    StocPiese[] VectorPiese = new StocPiese[15];
    VectorPiese[0] = new StocPiese("baterie", 2, 350, 23225);
    VectorPiese[1] = new StocPiese("injcector", 16, 550, 8782597);
    VectorPiese[2] = new StocPiese("baterie", 2, 510, 9853);
    VectorPiese[3] = new StocPiese("buji", 7, 460, 9285092);
    VectorPiese[4] = new StocPiese("far", 8, 420, 2525);
    VectorPiese[5] = new StocPiese("volan", 5, 900, 2566);
    VectorPiese[6] = new StocPiese("airbag", 2, 130, 72985);
    VectorPiese[7] = new StocPiese("distributie", 11, 350, 352857);
    VectorPiese[8] = new StocPiese("injector", 9, 200, 132435);
    VectorPiese[9] = new StocPiese("far", 5, 2000, 252522);
    VectorPiese[10] = new StocPiese("evacuare", 2, 1450, 23225);
    VectorPiese[11] = new StocPiese("galerie", 3, 390, 23225);
    VectorPiese[12] = new StocPiese("dpf", 9, 350, 56752);
    VectorPiese[13] = new StocPiese("baterie", 7, 800, 89235);
    VectorPiese[14] = new StocPiese("cauciuc", 6, 320, 232352);
    for (StocPiese sp : VectorPiese) {
        System.out.println(sp);
    }
    
    System.out.println(" ");
    for (Persoane p : VectorPers) {
        p.VerificareVarsta();
    }
    
    
    System.out.println(" ");
    for (Client c : VectorClient) {
        for (Masina m : VectorMasina) {
        if (c.CarCheck(m.getSerie())==true) {
        System.out.print("Are masina in service. ");
        System.out.println(c);
        }
    }
    }
    
    System.out.println(" ");
    for (Angajat a : VectorAngajat) {
        a.VerificareExperienta();
    }
    
    System.out.println("");
    for (Masina m : VectorMasina) {
        m.VerificareAnFab();
    }
    
    System.out.println(" ");
    for (ServiciiService ss : VectorServicii) {
        ss.VerificareDurata();
    }
    
    System.out.println(" ");
    for (StocPiese sp : VectorPiese) {
        sp.VerificareCantitate();
    }
    
    /*
      Service mm = new Service();
      ArrayList<Object> objects = mm.Citire("Masina.txt");
          for (Object obj : objects) {
            System.out.println("Obiectul citit este: " + obj.toString());
        }
          
           Service pp = new Service();
      ArrayList<Object> objects2 = pp.Citire("Persoane.txt");
          for (Object obj : objects2) {           
            System.out.println("Obiectul citit este: " + obj.toString());
        }
      
          Service cc = new Service();
          ArrayList<Object> objects3 = cc.Citire("Client.txt");
          for (Object obj : objects3) {
           System.out.println("Obiectul citit este: " + obj.toString());
        }
          
          Service aa = new Service();
          ArrayList<Object> objects4 = aa.Citire("Angajat.txt");
          for (Object obj : objects4) {
           System.out.println("Obiectul citit este: " + obj.toString());
        }
          
          Service sss = new Service();
          ArrayList<Object> objects5 = sss.Citire("Servicii.txt");
          for (Object obj : objects5) {
           System.out.println("Obiectul citit este: " + obj.toString());
        }
          
          Service ssp = new Service();
          ArrayList<Object> objects6 = ssp.Citire("StocPiese.txt");
          for (Object obj : objects6) {
           System.out.println("Obiectul citit este: " + obj.toString());
        }
          
          */
                    
    Scanner scanner = new Scanner(System.in);
    System.out.println("");
    System.out.println("Numele clasei: ");
    String caz = scanner.nextLine();
    System.out.println("Prima conditie: ");
    String con1 = scanner.nextLine();
    System.out.println("A doua conditie: ");
    String con2 = scanner.nextLine();
    
    switch (caz) {
        case "Persoane":            
            if ((con1.equals("Nume") && con2.equals("Prenume")) || (con1.equals("Prenume") && con2.equals("Nume"))) {
            System.out.println("Introduceti numele: ");
            String nume = scanner.nextLine();
            System.out.println("Introduceti prenumele: ");
            String prenume = scanner.nextLine();
            for (Persoane p : VectorPers) {
                p.NumePrenume(nume, prenume);
            }
            }
            if ((con1.equals("Nume") && con2.equals("Varsta")) || (con1.equals("Varsta") && con2.equals("Nume"))) {
            System.out.println("Introduceti numele: ");
            String nume = scanner.nextLine();
            System.out.println("Introduceti varsta: ");
            int varsta = scanner.nextInt();
            for (Persoane p : VectorPers) {
                p.NumeVarsta(nume, varsta);
            }
            }
            if ((con1.equals("Nume") && con2.equals("Tip")) || (con1.equals("Tip") && con2.equals("Nume"))) {
            System.out.println("Introduceti numele: ");
            String nume = scanner.nextLine();
            System.out.println("Introduceti tipul: ");
            String tip = scanner.nextLine();
            for (Persoane p : VectorPers) {
                p.NumeTip(nume, tip);
            }
            }
            if ((con1.equals("Prenume") && con2.equals("Varsta")) || (con1.equals("Varsta") && con2.equals("Prenume"))) {
            System.out.println("Introduceti prenumele: ");
            String prenume = scanner.nextLine();
            System.out.println("Introduceti varsta: ");
            int varsta = scanner.nextInt();
            for (Persoane p : VectorPers) {
                p.PrenumeVarsta(prenume, varsta);
            }
            }
            if ((con1.equals("Prenume") && con2.equals("Tip")) || (con1.equals("Tip") && con2.equals("Prenume"))) {
            System.out.println("Introduceti tipul: ");
            String tip = scanner.nextLine();
            System.out.println("Introduceti prenumele: ");
            String prenume = scanner.nextLine();
            for (Persoane p : VectorPers) {
                p.PrenumeTip(prenume, tip);
            }
            }
            if ((con1.equals("Tip") && con2.equals("Varsta")) || (con1.equals("Varsta") && con2.equals("Tip"))) {
            System.out.println("Introduceti tipul: ");
            String tip = scanner.nextLine();
            System.out.println("Introduceti varsta: ");
            int varsta = scanner.nextInt();
            for (Persoane p : VectorPers) {
                p.VarstaTip(varsta, tip);
            }
            }
                break;
        case "Client":
            if ((con1.equals("Marca") && con2.equals("Model")) || (con1.equals("Model") && con2.equals("Marca"))) {
            System.out.println("Introduceti marca: ");
            String marca = scanner.nextLine();
            System.out.println("Introduceti modelul: ");
            String model = scanner.nextLine();
            for (Client c : VectorClient) {
                c.MarcaModel(marca, model);
            }
            }
                break;
        case "Angajat":
            if ((con1.equals("Salariu") && con2.equals("AnAngajare")) || (con1.equals("AnAngajare") && con2.equals("Salariu"))) {
            System.out.println("Introduceti salariul: ");
            int salariu = scanner.nextInt();
            System.out.println("Introduceti anul angajarii: ");
            int an = scanner.nextInt();
            for (Angajat a : VectorAngajat) {
                a.SalariuAn(salariu, an);
            }
            }
                break;
        case "Masina":
            if ((con1.equals("Marca") && con2.equals("Model")) || (con1.equals("Model") && con2.equals("Marca"))) {
            System.out.println("Introduceti marca: ");
            String marca = scanner.nextLine();
            System.out.println("Introduceti modelul: ");
            String model = scanner.nextLine();
            for (Masina m : VectorMasina) {
                m.MarcaModel(marca, model);
            }
            }
                break;
        case "ServiciiService":
            if ((con1.equals("Pret") && con2.equals("Durata")) || (con1.equals("Durata") && con2.equals("Pret"))) {
            System.out.println("Introduceti pretul: ");
            int pret = scanner.nextInt();
            System.out.println("Introduceti durata: ");
            int durata = scanner.nextInt();
            for (ServiciiService ss : VectorServicii) {
                ss.PretDurata(pret, durata);
            }
            }
                break;
        case "StocPiese":
            if ((con1.equals("Nume") && con2.equals("Pret")) || (con1.equals("Pret") && con2.equals("Nume"))) {
            System.out.println("Introduceti numele piesei: ");
            String nume = scanner.nextLine();
            System.out.println("Introduceti pretul: ");
            int pret = scanner.nextInt();
            for (StocPiese sp : VectorPiese) {
                sp.NumePret(nume, pret);
            }
            }
                break;
    
    }
          
    } 
     
}